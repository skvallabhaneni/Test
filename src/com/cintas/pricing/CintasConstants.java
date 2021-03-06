package com.cintas.pricing;

import java.math.BigDecimal;
import java.util.HashMap;
import java.util.HashSet;

import com.sap.spe.condmgnt.finding.userexit.IConditionFindingManagerUserExit;
import com.sap.spe.pricing.customizing.PricingCustomizingConstants;
import com.sap.spe.pricing.transactiondata.userexit.IPricingConditionUserExit;
import com.sap.spe.pricing.transactiondata.userexit.IPricingItemUserExit;

public class CintasConstants 
{
  public static final String     ABAP_TRUE                  = "X";
  
  public static final String     INITIAL                    = "";
  
  public static final BigDecimal ONE_PENNY                  = new BigDecimal("0.001");
  
  public static final char       PRICE_EXCLUDED             = 'E';
  public static final char       PRICE_MINIMUM              = 'M';
  public static final char       PRICE_MAXIMUM              = 'X';
  
  public static final String     QUANTITY_RULE_NOCHG        = "1";
  public static final String     QUANTITY_RULE_MAX          = "2";
  
  public static final String     MATERIAL_EXCL_NOCHG        = "1";
  
  public static final HashMap    PRECISION_CURRENCIES       = CreateCurrencyMap();
  
  public static final HashSet    INSURANCE_CONDITIONS       = CreateInsuranceSet();
  
  public static final class MaterialGroup {
    public static final String TRIM                     = "DCTRIM";
  }
  
  public static final class Attributes {
    public static final String PRODUCT                  = "PRODUCT";
    public static final String PRICE_PRODUCT            = "PRICE_PRODUCT"; //price reference material
    public static final String MATERIAL_GROUP           = "ZZ_MATKL";
    public static final String NOCHARGE                 = "ZZ_NOCHG";
    public static final String ZEROQTY                  = "ZZ_ZEROQTY";
    public static final String SPECIAL_HANDLING         = "ZZ_SPCHAND";
    public static final String PACKAGE_CODE             = "ZZ_PACKCD";
    public static final String STOP_EXCLUSION           = "ZZ_STOPEXCL";
    public static final String STOP_MIN                 = "ZZ_STOPMIN";
    public static final String STOP_MAX                 = "ZZ_STOPMAX";
    public static final String PRICE_MAX                = "ZZ_PRICMAX";
    public static final String PRICE_MIN                = "ZZ_PRICMIN";
    public static final String USAGE                    = "ZZ_USAGE";
    public static final String INVENTORY_QTY            = "ZZ_INVQTY";
    public static final String INVENTORY_PCT            = "ZZ_PCTINV";
    public static final String MATERIAL_EXCLUSION       = "ZZ_MEXCL";
    public static final String MATERIAL_EXCLUSION_R     = "ZZ_MEXCL_R";
    public static final String QUANTITY_ERROR_R         = "ZZ_QTYERR_R";
    public static final String QUANTITY_MIN             = "ZZ_MINQTY";
    public static final String QUANTITY_MAX             = "ZZ_MAXQTY";
    public static final String ACCOUNT_ASSIGNMENT_GROUP = "ZZ_ACCTASSN_GRP";
    public static final String VARIABLE_DELIVERY        = "ZZ_VAR_DEL_CYCLE";
    public static final String SIZE_PREMIUM             = "ZZ_SIZEPREM";
    public static final String LR_QTY                   = "ZZ_LR_QTY";
    public static final String INSURANCE                = "ZZ_INSURANCE";
    public static final String INSURANCE_PROGRAM        = "ZZ_INSURP";
    public static final String INSURANCE_MAKEUP_EXCL    = "ZZ_MUINS_EX";
    public static final String INSURANCE_MAKEUP         = "ZZ_MAKEUP_INS";
    public static final String TRIM_PRICED              = "ZZ_TRIMPR";
    public static final String TRIM_EXCLUSION           = "ZZ_TRINS_EX";
    public static final String TRIM_INSURANCE           = "ZZ_TRIM_INS";
  }
  
  public static final class AncillaryMaterials {
    public static final String INSURANCE = "ZZ_ANC_INSURANCE";
    public static final String MINIMUM   = "ZZ_ANC_MINIMUM";
    public static final String SERVICE   = "ZZ_ANC_SERVICE";
    public static final String FREIGHT   = "ZZ_ANC_FREIGHT";
  }
  
  public static final class Usage {
    public static final String RENTAL   = "0";
    public static final String BUYBACK  = "B";
    public static final String CLEAN    = "C";
    public static final String DIRECT   = "D";
    public static final String LOST     = "L";
    public static final String NOG      = "N";
    public static final String UNILEASE = "P";
    public static final String DESTROY  = "R";
    public static final String SCRAP    = "S";
    public static final String CHARGES  = "X";
  }
  
  public static final class Conditions {
    
    public static final String LOCAL_PRODUCT_LINE   = "ZLPL";
    public static final String BASE_PRICE           = "ZBPR";
    public static final String INVOICE_DISCOUNT     = "ZDIS";
    public static final String SPECIAL_HANDLING     = "ZSUR";
    public static final String AGREEMENT_PRICE      = "ZPR0";
    public static final String AGREEMENT_PRICE_ADJ  = "ZPRA";
    public static final String PROGRAM_TOTAL        = "ZPRT";
    public static final String SERVICE_CHARGE       = "ZSVC";
    public static final String INSURANCE_CHARGE     = "ZICH";
    public static final String INSURANCE_AUTOLR     = "ZIPI";
    public static final String INSURANCE_PCT        = "ZIPS";
    public static final String INSURANCE_MAKEUP     = "ZIMU";
    public static final String INSURANCE_TRIM       = "ZITR";
    public static final String INSURANCE_PROGRAM    = "ZIPD";
    public static final String INSURANCE_ADJUSTMENT = "ZINA";
    public static final String ADJ_MINIMUM          = "ZSTA";
    public static final String SIZE_PREMIUM         = "ZSPM";
    public static final String BOOK_PRICE           = "ZBOK";
    public static final String CALCULATED_PRICE     = "ZPR1";
    public static final String INITIAL_PRICE        = "ZIPR";
    public static final String MATERIAL_LIST        = "ZMLE";
    public static final String ITEM_DISCOUNT        = "ZIDC";
    public static final String STOP_MIN             = "ZSTV";
    public static final String DIRECT_SALE_SURCHG   = "ZDSS";
    public static final String PRICE_DISCOUNT       = "ZPRD";
    
    public static final class Rules {
      public static final String AGREEMENT_PRICE    = "ZPRR";
      public static final String NONCOMPLIANCE      = "ZNCR";
      public static final String QTY_RESTRICTION    = "ZQTR";
      public static final String SERVICE_CHARGE     = "ZRSV";
      public static final String STOP_MIN           = "ZSTR";
      public static final String INSURANCE          = "ZIRL";
      public static final String INSURANCE_CHG      = "ZRIC";
      public static final String INSURANCE_PCT_INV  = "ZRPI";
      public static final String INVOICE_DISCOUNT   = "ZRDI";
      public static final String SIZE_PREMIUM       = "ZRSP";
      public static final String SURCHARGE          = "ZRSC";
    }
    
    public static final class Exclusions {
      public static final String INVOICE_DISCOUNT   = "ZDSX";      
    }
    
    public static final class SubTotals {
      public static final String PRINTED_PIECE      = "ZTC0";
      public static final String SIZE_PREMIUM       = "ZTC1";
      public static final String INSURANCE          = "ZTC2";
      public static final String SERVICE_CHARGE     = "ZTC3";
      public static final String MINIMUM_CHARGE     = "ZTC4";
      public static final String DISCOUNTED_PRICE   = "ZTC6";
      public static final String AMOUNT_SERV_CHARGE = "ZSV1";
      public static final String AMOUNT_MIN_CHARGE  = "ZST$";
    }
  }
  
  public static final class AccountAssignment {
    public final static String INSURANCE = "24";
    public final static String SERVICE   = "25";
    public final static String MINIMUM   = "26";
    public final static String FREIGHT   = "27";
  }
  
  public static final class Currency {
    public static final int    PRECISION_SCALE = 3;
    public static final int    SCALE           = 2;
    
    public static final String US = "USD";
    public static final String CA = "CAD";
  }
  
  public static final class AccountKey {
    public final static String INSURANCE = "ZIN";
  }

  public static boolean IsProductAncillary(IConditionFindingManagerUserExit item) {
    String productGuid = item.getAttributeValue(Attributes.PRODUCT);

    if (productGuid.equals(item.getAttributeValue(AncillaryMaterials.INSURANCE)))
      return true;
    if (productGuid.equals(item.getAttributeValue(AncillaryMaterials.SERVICE)))
      return true;
    if (productGuid.equals(item.getAttributeValue(AncillaryMaterials.MINIMUM)))
      return true;
    if (productGuid.equals(item.getAttributeValue(AncillaryMaterials.FREIGHT)))
      return true;

    return false;
  }
  
  public static boolean IsAncillaryService(IConditionFindingManagerUserExit item) {
    if (IsProductAncillary(item))
       if (item.getAttributeValue(Attributes.PRODUCT).equals(item.getAttributeValue(AncillaryMaterials.SERVICE)))
        return true;

    return false;
  }

  public static boolean IsAncillaryMinimum(IConditionFindingManagerUserExit item) {
    if (IsProductAncillary(item))
       if (item.getAttributeValue(Attributes.PRODUCT).equals(item.getAttributeValue(AncillaryMaterials.MINIMUM)))
        return true;

    return false;
  }

  public static boolean IsAncillaryInsurance(IConditionFindingManagerUserExit item) {
    if (IsProductAncillary(item))
       if (item.getAttributeValue(Attributes.PRODUCT).equals(item.getAttributeValue(AncillaryMaterials.INSURANCE)))
        return true;

    return false;
  }

  public static boolean IsAncillaryFreight(IConditionFindingManagerUserExit item) {
    if (IsProductAncillary(item))
       if (item.getAttributeValue(Attributes.PRODUCT).equals(item.getAttributeValue(AncillaryMaterials.FREIGHT)))
        return true;

    return false;
  }

 public static boolean IsRentalProduct(IConditionFindingManagerUserExit item)
  {
    return (item.getAttributeValue(Attributes.USAGE).equals(Usage.RENTAL));
  }
  
  public static boolean IsValidSpecialHandling(String specialHandlingCode) {
    if (specialHandlingCode.length() == 4 && specialHandlingCode.startsWith("T"))
      return true;
    
    return false;
  }
  
  public static final String GetPrecisionCurrency(String documentCurrency) {
    String _currency = (String) PRECISION_CURRENCIES.get(documentCurrency); 
    return (_currency == null ? documentCurrency : _currency);
  }
  
  public static final String GetPrecisionCurrency(IPricingItemUserExit pricingItem) {
    return GetPrecisionCurrency(pricingItem.getUserExitDocument().getDocumentCurrencyUnit().getUnitName());
  }
  
  public static final boolean IsPrecisionCurrency(String currency) {
    return PRECISION_CURRENCIES.containsValue(currency);
  }
  
  public static final boolean IsItemNoCharge(IPricingItemUserExit pricingItem) {
    /* 
     * No charge can be set either on the item in WebUI (AttributeValue)
     * or due to exclusion rules in Base Formula 903 (ObjectForUserExit).
     */
    String itemNoCharge = (pricingItem.getAttributeValue(CintasConstants.Attributes.NOCHARGE) != null
        ? pricingItem.getAttributeValue(CintasConstants.Attributes.NOCHARGE) : INITIAL);
    String objectNoCharge = (pricingItem.getObjectForUserExits(CintasConstants.Attributes.NOCHARGE) != null 
        ? (String)pricingItem.getObjectForUserExits(CintasConstants.Attributes.NOCHARGE) : INITIAL);

    return (itemNoCharge.equals(ABAP_TRUE) || objectNoCharge.equals(ABAP_TRUE));
  }
 
  public static final boolean IsInsuranceVantage(IConditionFindingManagerUserExit item) {
    // 10, 11, 12
    return false;
  }
  
  public static final boolean IsInsuranceVantagePlus(IConditionFindingManagerUserExit item) {
    // 20, 21, 22
    return false;
  }
  
  public static final boolean IsInsuranceAutoLR(IConditionFindingManagerUserExit item) {
    // 30
    return false;
  }
  
  public static final boolean IsAttributeInitial(IConditionFindingManagerUserExit item, String attribute) {
    return item.getAttributeValue(attribute).equals(INITIAL);
  }
  
  private static HashMap CreateCurrencyMap() {
    HashMap _currency = new HashMap(2);
    
    _currency.put(Currency.US, "US3");
    _currency.put(Currency.CA, "CA3");
    
    return _currency;
  }
  
  private static HashSet CreateInsuranceSet() {
    HashSet _conditions = new HashSet(7);
    
    _conditions.add(Conditions.INSURANCE_CHARGE);
    _conditions.add(Conditions.Rules.INSURANCE_PCT_INV);
    _conditions.add(Conditions.INSURANCE_AUTOLR);
    _conditions.add(Conditions.INSURANCE_PCT);
    _conditions.add(Conditions.INSURANCE_MAKEUP);
    _conditions.add(Conditions.INSURANCE_TRIM);
    _conditions.add(Conditions.INSURANCE_ADJUSTMENT);

    return _conditions;
  }
  
public static final BigDecimal GetConditionValue(IPricingItemUserExit item, String conditionName) {
    BigDecimal _value = BigDecimal.ZERO;
    
    if (FindCondition(item, conditionName) != null)
      _value = FindCondition(item, conditionName).getConditionValue().getValue();
    
    return _value;
  }
  
  public static final BigDecimal GetConditionRate(IPricingItemUserExit item, String conditionName) {
    BigDecimal _value = BigDecimal.ZERO;
    
    if (FindCondition(item, conditionName) != null)
      _value = FindCondition(item, conditionName).getConditionRate().getValue();
    
    return _value;
  }
 
  public static final IPricingConditionUserExit FindCondition(IPricingItemUserExit item, String conditionName) {
    IPricingConditionUserExit _condition = null;

    IPricingConditionUserExit[] _conditions = item.getUserExitConditions();
    for (int i=0; i < _conditions.length; i++) {
      String conditionType = _conditions[i].getConditionTypeName();
      if (conditionType != null && conditionType.equals(conditionName)) {
        _condition = _conditions[i];
        break;
      }
    }       

    return _condition;
  }
  
  public static final BigDecimal GetSubtotalK(IPricingItemUserExit item) {
    BigDecimal _subtotal = item.getSubtotalAsBigDecimal(PricingCustomizingConstants.ConditionSubtotal.SUBTOTAL_K);
    if (_subtotal.compareTo(BigDecimal.ZERO) == 0)
      _subtotal = GetConditionRate(item, Conditions.AGREEMENT_PRICE)
          .add(GetConditionRate(item, Conditions.SPECIAL_HANDLING))
          .add(GetConditionRate(item, Conditions.Rules.SURCHARGE));
    return _subtotal;
  }
  
  public static final BigDecimal GetSubtotalL(IPricingItemUserExit item) {
//    BigDecimal _subtotal = item.getSubtotalAsBigDecimal(PricingCustomizingConstants.ConditionSubtotal.SUBTOTAL_L);
//    if (_subtotal.compareTo(BigDecimal.ZERO) == 0)
    BigDecimal _subtotal = GetConditionRate(item, Conditions.AGREEMENT_PRICE_ADJ)
          .add(GetConditionRate(item, Conditions.SIZE_PREMIUM))
          .add(GetConditionRate(item, Conditions.PRICE_DISCOUNT));
    return _subtotal;
  }
  
  public static final boolean HasInsuranceCondition(IPricingItemUserExit item) {
    IPricingConditionUserExit[] _conditions = item.getUserExitConditions();
    
    for (int i=0; i < _conditions.length; i++) {
      if (IsInsuranceCondition(_conditions[i].getConditionTypeName()))
        return true;
    }
    
    return false;
  }
  
  public static final boolean IsInsuranceCondition(String conditionName) {
    return INSURANCE_CONDITIONS.contains(conditionName);
  }
  
  public static final boolean IsStringInitial(String string) {
    return string == null || string.equals(CintasConstants.INITIAL);
  }
  
}