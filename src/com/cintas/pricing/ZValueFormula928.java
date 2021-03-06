package com.cintas.pricing;

import java.math.BigDecimal;

import com.sap.spe.base.logging.UserexitLogger;
import com.sap.spe.conversion.exc.ConversionMissingDataException;
import com.sap.spe.pricing.customizing.PricingCustomizingConstants;
import com.sap.spe.pricing.transactiondata.userexit.IPricingConditionUserExit;
import com.sap.spe.pricing.transactiondata.userexit.IPricingItemUserExit;
import com.sap.spe.pricing.transactiondata.userexit.ValueFormulaAdapter;

public class ZValueFormula928 extends ValueFormulaAdapter {

  public BigDecimal overwriteConditionValue(IPricingItemUserExit pricingItem,
      IPricingConditionUserExit pricingCondition) {

    UserexitLogger userexitLogger = new UserexitLogger(ZValueFormula928.class);

    String condCurrency = CintasConstants.GetPrecisionCurrency(pricingItem);
 
//    BigDecimal subtotalK = pricingItem.getSubtotalAsBigDecimal(PricingCustomizingConstants.ConditionSubtotal.SUBTOTAL_K);
    BigDecimal subtotalK = CintasConstants.GetSubtotalK(pricingItem);
    
    userexitLogger.writeLogDebug("subtotalK = " + subtotalK);
    
    if (subtotalK != null && subtotalK.compareTo(new BigDecimal(0)) > 0) {
      try {
        pricingCondition.setConditionRate(subtotalK,condCurrency);
      }
      catch (ConversionMissingDataException ex) {
        pricingCondition.setConditionRateValue(subtotalK);
      }

      // Return calculation considering base quantity.
      BigDecimal conditionValue = pricingCondition.getConditionBase().getValue().multiply(pricingCondition.getConditionRate().getValue());

      BigDecimal pricingUnit = pricingCondition.getPricingUnit().getValue();
      if (pricingUnit != null && pricingUnit.compareTo(BigDecimal.ZERO) > 0) {
        conditionValue = conditionValue.divide(pricingUnit,BigDecimal.ROUND_UNNECESSARY);
      }

      return conditionValue;		
    }
    else {
      /* No charge requirement: Allow zero value initial price by setting the rate
       * to 0.001 and the value to zero.
       */
      if (CintasConstants.FindCondition(pricingItem, CintasConstants.Conditions.AGREEMENT_PRICE) != null) {
        try {
          pricingCondition.setConditionRate(CintasConstants.ONE_PENNY,condCurrency);
        }
        catch (ConversionMissingDataException ex) {
          pricingCondition.setConditionRateValue(CintasConstants.ONE_PENNY);
        }
        return BigDecimal.ZERO;
      }
      else {
        pricingCondition.setInactive(PricingCustomizingConstants.InactiveFlag.INVISIBLE);
        return null;
      }
    }
  }
}