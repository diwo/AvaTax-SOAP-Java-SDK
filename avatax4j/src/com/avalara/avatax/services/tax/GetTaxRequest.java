/**
 * GetTaxRequest.java
 *
 * This file was auto-generated from WSDL
 * by the Apache Axis 1.2 May 03, 2005 (02:20:24 EDT) WSDL2Java emitter.
 */

package com.avalara.avatax.services.tax;

import java.util.*;
import java.math.BigDecimal;

/**
 * Data to pass to {@link TaxSvcSoap#getTax}.
 * @see GetTaxResult
 * @author araval
 * Copyright (c) 2005, Avalara.  All rights reserved.
 */
public class GetTaxRequest extends BaseRequest  implements java.io.Serializable {
    private java.lang.String companyCode;
    private com.avalara.avatax.services.tax.DocumentType docType;
    private java.lang.String docCode;
    private java.util.Date docDate;
    private java.lang.String salespersonCode;
    private java.lang.String customerCode;
    private java.lang.String customerUsageType;
    private java.math.BigDecimal discount;
    private java.lang.String purchaseOrderNo;
    private java.lang.String exemptionNo;
    private java.lang.String originCode;
    private java.lang.String destinationCode;
    private com.avalara.avatax.services.tax.ArrayOfBaseAddress addresses;
    private com.avalara.avatax.services.tax.ArrayOfLine lines;
    private com.avalara.avatax.services.tax.DetailLevel detailLevel;

    private java.lang.String referenceCode;
    private java.lang.String locationCode;
    private boolean commit;
    private java.lang.String batchCode;
    private java.math.BigDecimal totalTaxOverride;
    private com.avalara.avatax.services.tax.TaxOverride taxOverride;
    private java.lang.String currencyCode;
    private BaseAddress originAddress;
    private BaseAddress destinationAddress;
    private com.avalara.avatax.services.tax.ServiceMode serviceMode;
    private java.util.Date paymentDate;
    private java.math.BigDecimal exchangeRate;
    private java.util.Date exchangeRateEffDate;
    private java.lang.String businessIdentificationNo;
	private java.lang.String posLaneCode;

	//Added for Taxsvc2
    private com.avalara.avatax.services.tax.ArrayOfAddressLocationType addressLocationTypes;
    private boolean isSellerImporterOfRecord;
    private com.avalara.avatax.services.tax.BRBuyerTypeEnum bRBuyerType;	//enum
    private boolean bRBuyer_IsExemptOrCannotWH_IRRF;
    private boolean bRBuyer_IsExemptOrCannotWH_PISRF;
    private boolean bRBuyer_IsExemptOrCannotWH_COFINSRF;
    private boolean bRBuyer_IsExemptOrCannotWH_CSLLRF;
    private boolean bRBuyer_IsExempt_PIS;
    private boolean bRBuyer_IsExempt_COFINS;
    private boolean bRBuyer_IsExempt_CSLL;
    private java.lang.String description;
    private java.lang.String email;
    private com.avalara.avatax.services.tax.ArrayOfParameterBagItem parameterBagItems;
	//Taxsvc2 changes end

    /**
     * Initializes a new instance of the class.
     */
    public GetTaxRequest() {
        addresses = new ArrayOfBaseAddress();
        lines = new ArrayOfLine();
        docType = DocumentType.SalesOrder;
        docDate = new Date();
        this.commit = false;
        serviceMode = ServiceMode.Automatic;

        Calendar calendar= Calendar.getInstance();
        calendar.set(1900,01,01);
        this.paymentDate=calendar.getTime();
        this.exchangeRateEffDate=calendar.getTime();

        this.exchangeRate=new BigDecimal(1.0);

		//Taxsvc2 changes
		addressLocationTypes = new ArrayOfAddressLocationType();
		parameterBagItems = new ArrayOfParameterBagItem();
        this.isSellerImporterOfRecord = false;
        bRBuyerType = BRBuyerTypeEnum.IND;
        this.bRBuyer_IsExemptOrCannotWH_IRRF = false;
        this.bRBuyer_IsExemptOrCannotWH_PISRF = false;
        this.bRBuyer_IsExemptOrCannotWH_COFINSRF = false;
        this.bRBuyer_IsExemptOrCannotWH_CSLLRF = false;
        this.bRBuyer_IsExempt_PIS = false;
        this.bRBuyer_IsExempt_COFINS = false;
        this.bRBuyer_IsExempt_CSLL = false;
	}

    /**
     * Gets the client application company reference code.
     *
     * @return companyCode
     */
    public java.lang.String getCompanyCode() {
        return companyCode;
    }


    /**
     * Sets the client application company reference code.
     *
     * @param companyCode
     */
    public void setCompanyCode(java.lang.String companyCode) {
        this.companyCode = companyCode;
    }


    /**
     * The document type specifies the category of the document and affects
     * how the document is treated after a tax calculation;
     * see {@link DocumentType} for more information about the specific document types.
     * <br><b>Example:</b>
     * <pre>
     * [Java]
     * GetTaxRequest request = new GetTaxRequest();
     * request.setDocType(DocumentType.SalesInvoice);
     * </pre>
     *
     * @return docType
     */
    public com.avalara.avatax.services.tax.DocumentType getDocType() {
        return docType;
    }

     /*
     * Taxsvc2
     */
    public com.avalara.avatax.services.tax.BRBuyerTypeEnum getBRBuyerType() {
        return bRBuyerType;
    }

    /**
     * The document type specifies the category of the document and affects
     * how the document is treated after a tax calculation;
     * see {@link DocumentType} for more information about the specific document types.
     * <br><b>Example:</b>
     * <pre>
     * [Java]
     * GetTaxRequest request = new GetTaxRequest();
     * request.setDocType(DocumentType.SalesInvoice);
     * </pre>
     *
     * @param docType
     */
    public void setDocType(com.avalara.avatax.services.tax.DocumentType docType) {
        this.docType = docType;
    }

     /* Taxsvc2
     */
    public void setBRBuyerType(com.avalara.avatax.services.tax.BRBuyerTypeEnum bRBuyerType) {
        this.bRBuyerType = bRBuyerType;
    }

    /**
     * Gets the Document Code, i.e., the internal reference code used by the client application.
     * <p>
     * If DocId is specified, this is not needed.
     * </p>
     *
     * @return Document Code
     */
    public java.lang.String getDocCode() {
        return docCode;
    }


    /**
     * Sets the Document Code, i.e., the internal reference code used by the client application.
     * <p>
     * If DocId is specified, this is not needed.
     * </p>
     *
     * @param docCode
     */
    public void setDocCode(java.lang.String docCode) {
        this.docCode = docCode;
    }


    /**
     * The date on the invoice, purchase order, etc.
     *
     * @return docDate
     */
    public java.util.Date getDocDate() {
        return docDate;
    }


    /**
     * The date on the invoice, purchase order, etc.
     *
     * @param docDate
     */
    public void setDocDate(java.util.Date docDate) {
        this.docDate = docDate;
    }


    /**
     * The client application salesperson reference code.
     *
     * @return salespersonCode
     */
    public java.lang.String getSalespersonCode() {
        return salespersonCode;
    }


    /**
     * The client application salesperson reference code.
     *
     * @param salespersonCode
     */
    public void setSalespersonCode(java.lang.String salespersonCode) {
        this.salespersonCode = salespersonCode;
    }


    /**
     *  The client application customer reference code.
     *
     * @return customerCode
     */
    public java.lang.String getCustomerCode() {
        return customerCode;
    }


    /**
     *  The client application customer reference code.
     *
     * @param customerCode
     */
    public void setCustomerCode(java.lang.String customerCode) {
        this.customerCode = customerCode;
    }


    /**
     * The client application customer or usage type.
     *
     * @return customerUsageType
     */
    public java.lang.String getCustomerUsageType() {
        return customerUsageType;
    }


    /**
     * The client application customer or usage type.
     * <p>
     * This is used to determine the exempt status of the transaction based on the exemption tax rules for the
     * jurisdictions involved.  This may also be set at the line level.
     * </p>
     * <p>
     * The standard values for the CustomerUsageType (A-L).<br/>
        A � Federal Government<br/>
        B � State/Local Govt.<br/>
        C � Tribal Government<br/>
        D � Foreign Diplomat<br/>
        E � Charitable Organization<br/>
        F � Religious/Education<br/>
        G � Resale<br/>
        H � Agricultural Production<br/>
        I � Industrial Prod/Mfg.<br/>
        J � Direct Pay Permit<br/>
        K � Direct Mail<br/>
        L - Other<br/>
     * </p>
     * @param customerUsageType
     */
    public void setCustomerUsageType(java.lang.String customerUsageType) {
        this.customerUsageType = customerUsageType;
    }


    /**
     *  The discount amount to apply to the document.
     *
     * @return discount
     */
    public java.math.BigDecimal getDiscount() {
        return discount;
    }


    /**
     *  The discount amount to apply to the document.
     *
     * @param discount
     */
    public void setDiscount(java.math.BigDecimal discount) {
        this.discount = discount;
    }


    /**
     * Purchase Order Number for this document.
     * <p>
     * This is required for single use exemption certificates to match the order and invoice with the certificate.
     * </p>
     *
     * @return purchaseOrderNo
     */
    public java.lang.String getPurchaseOrderNo() {
        return purchaseOrderNo;
    }


    /**
     * Purchase Order Number for this document.
     * <p>
     * This is required for single use exemption certificates to match the order and invoice with the certificate.
     * </p>
     *
     * @param purchaseOrderNo
     */
    public void setPurchaseOrderNo(java.lang.String purchaseOrderNo) {
        this.purchaseOrderNo = purchaseOrderNo;
    }


    /**
     *   Exemption Number for this document
     *
     * @return exemptionNo
     */
    public java.lang.String getExemptionNo() {
        return exemptionNo;
    }


    /**
     *   Exemption Number for this document
     *
     * @param exemptionNo
     */
    public void setExemptionNo(java.lang.String exemptionNo) {
        this.exemptionNo = exemptionNo;
    }


    /**
     * Used internally by the adapter to reference the {@link Line#getOriginAddress}
     * <p>
     * Same as the <b>OriginAddress</b>'s {@link BaseAddress#getAddressCode}
     * An internally maintained value representing the <b>OriginAddress</b>
     *
     * @return originCode
     */
    public java.lang.String getOriginCode() {
        return originCode;
    }


    /**
     * Used internally by the adapter to reference the {@link Line#getOriginAddress}.
     * <p>
     * Same as the <b>OriginAddress</b>'s {@link BaseAddress#getAddressCode} --
     * An internally maintained value representing the <b>OriginAddress</b>
     * <p>Note: Made "setter" private to avoid corrupting the new way of referencing addresses.
     *
     * @param originCode
     */
    public void setOriginCode(java.lang.String originCode) {
        this.originCode = originCode;
    }


    /**
     * Used internally by the adapter to reference the {@link Line#getDestinationAddress} **FIX**.
     * Same as the <b>DestinationAddress</b>'s {@link BaseAddress#getAddressCode}.
     *  An internally maintained value representing the <b>DestinationAddress</b>.
     *
     * @return destinationCode
     */
    public java.lang.String getDestinationCode() {
        return destinationCode;
    }


    /**
     * Used internally by the adapter to reference the {@link Line#getDestinationAddress} **FIX**.
     * Same as the <b>DestinationAddress</b>'s {@link BaseAddress#getAddressCode} --
     *  An internally maintained value representing the <b>DestinationAddress</b>.
     * <p>Note: Made "setter" private to avoid corrupting the new way of referencing addresses.
     *
     * @param destinationCode
     */
    public void setDestinationCode(java.lang.String destinationCode) {
        this.destinationCode = destinationCode;
    }


    /**
     * Gets the addresses value for this GetTaxRequest.
     * Address collection for the document.  The AddressCode relates to the OriginCode or DestinationCode in the
     * document or line.
     * @see com.avalara.avatax.services.tax.ArrayOfBaseAddress line items listAddress
     * @see Line
     *
     * @return addresses
     */
    public com.avalara.avatax.services.tax.ArrayOfBaseAddress getAddresses() {
        return addresses;
    }

    /**	Taxsvc2
     * Gets the addresses location types for this GetTaxRequest.
     */
    public com.avalara.avatax.services.tax.ArrayOfAddressLocationType getAddressLocationTypes() {
        return addressLocationTypes;
    }
	
    /**	Taxsvc2
     */
    public com.avalara.avatax.services.tax.ArrayOfParameterBagItem getParameterBagItems() {
        return parameterBagItems;
    }

    /**
     * Sets the addresses for this request.  These are referenced by AddressCode from
     * the {@link GetTaxRequest#getOriginCode}, {@link GetTaxRequest#getDestinationCode}
     * and {@link Line} elements.
     *
     * @see com.avalara.avatax.services.tax.ArrayOfBaseAddress line items listAddress
     * @see Line
     *
     * @param addresses
     */
    public void setAddresses(com.avalara.avatax.services.tax.ArrayOfBaseAddress addresses)
    {
        this.addresses = addresses;
    }

     /* Taxsvc2
     * @param addressLocationTypes
     */
    public void setAddressLocationTypes(com.avalara.avatax.services.tax.ArrayOfAddressLocationType addressLocationTypes)
    {
        this.addressLocationTypes = addressLocationTypes;
    }

     /* Taxsvc2
     */
    public void setParameterBagItems(com.avalara.avatax.services.tax.ArrayOfParameterBagItem parameterBagItems)
    {
        this.parameterBagItems = parameterBagItems;
    }

    /**
     * Document line items list.
     *
     * @return lines
     */
    public com.avalara.avatax.services.tax.ArrayOfLine getLines() {
        return lines;
    }


    /**
     * Document line items list. Made private to avoid data corruption.
     *
     * @param lines
     */
    public void setLines(com.avalara.avatax.services.tax.ArrayOfLine lines) {
        this.lines = lines;
    }

    /**
     *  Specifies the level of detail to return.
     *
     * @return detailLevel
     */
    public com.avalara.avatax.services.tax.DetailLevel getDetailLevel() {
        return detailLevel;
    }


    /**
     *  Specifies the level of detail to return.
     *
     * @param detailLevel
     */
    public void setDetailLevel(com.avalara.avatax.services.tax.DetailLevel detailLevel) {
        this.detailLevel = detailLevel;
    }


    /**
     * For returns (see {@link DocumentType}), refers to the {@link GetTaxRequest#getDocCode}
     * of the original invoice.
     *
     * @return referenceCode
     */
    public java.lang.String getReferenceCode() {
        return referenceCode;
    }


    /**
     * For returns (see {@link DocumentType}), refers to the {@link GetTaxRequest#getDocCode}
     * of the original invoice.
     *
     * @param referenceCode
     */
    public void setReferenceCode(java.lang.String referenceCode) {
        this.referenceCode = referenceCode;
    }

    

    /**
     * Gets the locationCode value for this GetTaxRequest.
     * <p>
     * It is Also referred to as a Store Location, Outlet Id, or Outlet code is a number assigned by the State which identifies a Store location. Some state returns require taxes are broken out separately for Store Locations.
     * </p>
     * @return locationCode
     */
    public java.lang.String getLocationCode() {
        return locationCode;
    }


    /**
     * Sets the locationCode value for this GetTaxRequest.
     * <p>
     * It is Also referred to as a Store Location, Outlet Id, or Outlet code is a number assigned by the State which identifies a Store location. Some state returns require taxes are broken out separately for Store Locations.
     * </p>
     * @param locationCode
     */
    public void setLocationCode(java.lang.String locationCode) {
        this.locationCode = locationCode;
    }

    /**
     * Gets the commit value for this GetTaxRequest.     
     * @return commit
     */
    public boolean getCommit() {
        return commit;
    }

    /** Taxsvc2
     */
    public boolean getIsSellerImporterOfRecord() {
        return isSellerImporterOfRecord;
    }

    /** Taxsvc2
     */
    public boolean getBRBuyer_IsExemptOrCannotWH_IRRF() {
        return bRBuyer_IsExemptOrCannotWH_IRRF;
    }

    /** Taxsvc2
     */
    public boolean getBRBuyer_IsExemptOrCannotWH_PISRF() {
        return bRBuyer_IsExemptOrCannotWH_PISRF;
    }

    /** Taxsvc2
     */
    public boolean getBRBuyer_IsExemptOrCannotWH_COFINSRF() {
        return bRBuyer_IsExemptOrCannotWH_COFINSRF;
    }

    /** Taxsvc2
     */
    public boolean getBRBuyer_IsExemptOrCannotWH_CSLLRF() {
        return bRBuyer_IsExemptOrCannotWH_CSLLRF;
    }

    /** Taxsvc2
     */
    public boolean getBRBuyer_IsExempt_PIS() {
        return bRBuyer_IsExempt_PIS;
    }

    /** Taxsvc2
     */
    public boolean getBRBuyer_IsExempt_COFINS() {
        return bRBuyer_IsExempt_COFINS;
    }

    /** Taxsvc2
     */
    public boolean getBRBuyer_IsExempt_CSLL() {
        return bRBuyer_IsExempt_CSLL;
    }
    /**
     * Sets the commit value for this GetTaxRequest.
     * <p>
     * This has been defaulted to false.
     * If this has been set to true AvaTax will commit the document on this call.
     * Seller's system who wants to Save,Post and Commit the document on one call should use this flag.
     * </p>
     * Also See {@link PostTaxRequest#setCommit}
     * @param commit
     */
    public void setCommit(boolean commit) {
        this.commit = commit;
    }

     /* Taxsvc2
     */
    public void setIsSellerImporterOfRecord(boolean isSellerImporterOfRecord) {
        this.isSellerImporterOfRecord = isSellerImporterOfRecord;
    }

     /* Taxsvc2
     */
    public void setBRBuyer_IsExemptOrCannotWH_IRRF(boolean bRBuyer_IsExemptOrCannotWH_IRRF) {
        this.bRBuyer_IsExemptOrCannotWH_IRRF = bRBuyer_IsExemptOrCannotWH_IRRF;
    }

     /* Taxsvc2
     */
    public void setBRBuyer_IsExemptOrCannotWH_PISRF(boolean bRBuyer_IsExemptOrCannotWH_PISRF) {
        this.bRBuyer_IsExemptOrCannotWH_PISRF = bRBuyer_IsExemptOrCannotWH_PISRF;
    }

     /* Taxsvc2
     */
    public void setBRBuyer_IsExemptOrCannotWH_COFINSRF(boolean bRBuyer_IsExemptOrCannotWH_COFINSRF) {
        this.bRBuyer_IsExemptOrCannotWH_COFINSRF = bRBuyer_IsExemptOrCannotWH_COFINSRF;
    }

     /* Taxsvc2
     */
    public void setBRBuyer_IsExemptOrCannotWH_CSLLRF(boolean bRBuyer_IsExemptOrCannotWH_CSLLRF) {
        this.bRBuyer_IsExemptOrCannotWH_CSLLRF = bRBuyer_IsExemptOrCannotWH_CSLLRF;
    }

     /* Taxsvc2
     */
    public void setBRBuyer_IsExempt_PIS(boolean bRBuyer_IsExempt_PIS) {
        this.bRBuyer_IsExempt_PIS = bRBuyer_IsExempt_PIS;
    }

     /* Taxsvc2
     */
    public void setBRBuyer_IsExempt_COFINS(boolean BRBuyer_IsExempt_COFINS) {
        this.bRBuyer_IsExempt_COFINS = bRBuyer_IsExempt_COFINS;
    }

     /* Taxsvc2
     */
    public void setBRBuyer_IsExempt_CSLL(boolean bRBuyer_IsExempt_CSLL) {
        this.bRBuyer_IsExempt_CSLL = bRBuyer_IsExempt_CSLL;
    }
    /**
	 * Gets the batchCode value for this GetTaxRequest.
	 *
	 * @return batchCode
	 */
	public java.lang.String getBatchCode() {
		return batchCode;
	}


	/**
	 * Sets the batchCode value for this GetTaxRequest.
	 *
	 * @param batchCode
	 */
	public void setBatchCode(java.lang.String batchCode) {
		this.batchCode = batchCode;
	}


     /* Gets the taxOverride value for this GetTaxRequest.
     * 
     * @return taxOverride
     */
    public com.avalara.avatax.services.tax.TaxOverride getTaxOverride() {
        return taxOverride;
    }


    /**
     * Sets the taxOverride value for this GetTaxRequest.
     * <p>
     * TaxOverride indicates to apply tax override to the document.
     * </p>
     * Also See {@link TaxOverride}
     * @param taxOverride
     */
    public void setTaxOverride(com.avalara.avatax.services.tax.TaxOverride taxOverride) {
        this.taxOverride = taxOverride;
    }

    /**
     * Gets the currencyCode value for this GetTaxRequest.
     * 
     * @return currencyCode
     */
    public java.lang.String getCurrencyCode() {
        return currencyCode;
    }


    /**
     * Sets the currencyCode value for this GetTaxRequest.
     * <p>
     * It is 3 character ISO 4217 currency code.
     * </p>
     * @param currencyCode
     */
    public void setCurrencyCode(java.lang.String currencyCode) {
        this.currencyCode = currencyCode;
    }


    /**
     * Gets the serviceMode value for this GetTaxRequest.
     * 
     * @return serviceMode
     */
    public com.avalara.avatax.services.tax.ServiceMode getServiceMode() {
        return serviceMode;
    }


    /**
     * Sets the serviceMode value for this GetTaxRequest.
     * <p>
     * This is only supported by AvaLocal servers. It provides the ability to controls whether tax is calculated locally or remotely when using an AvaLocal server.
     * The default is Automatic which calculates locally unless remote is necessary for non-local addresses.
     * </p>
     * @param serviceMode
     */
    public void setServiceMode(com.avalara.avatax.services.tax.ServiceMode serviceMode) {
        this.serviceMode = serviceMode;
    }

     /**
     * Gets the paymentDate value for this GetTaxRequest.
     *
     * @return paymentDate
     */
    public java.util.Date getPaymentDate() {
        return paymentDate;
    }


    /**
     * Sets the paymentDate value for this GetTaxRequest.
     *
     * @param paymentDate
     */
    public void setPaymentDate(java.util.Date paymentDate) {
        this.paymentDate = paymentDate;
    }

    /**
     * Gets the exchangeRate value for this GetTaxRequest.
     *
     * @return exchangeRate
     */
    public java.math.BigDecimal getExchangeRate() {
        return exchangeRate;
    }


    /**
     * Sets the exchangeRate value for this GetTaxRequest.
     *
     * @param exchangeRate
     */
    public void setExchangeRate(java.math.BigDecimal exchangeRate) {
        this.exchangeRate = exchangeRate;
    }

    /**
     * Gets the exchangeRateEffDate value for this GetTaxRequest.
     *
     * @return exchangeRateEffDate
     */
    public java.util.Date getExchangeRateEffDate() {
        return exchangeRateEffDate;
    }


    /**
     * Sets the exchangeRateEffDate value for this GetTaxRequest.
     *
     * @param exchangeRateEffDate
     */
    public void setExchangeRateEffDate(java.util.Date exchangeRateEffDate) {
        this.exchangeRateEffDate = exchangeRateEffDate;
    }

    /**
     * Gets the businessIdentificationNo value.
     *
     * @return businessIdentificationNo
     */
    public java.lang.String getBusinessIdentificationNo() {
        return businessIdentificationNo;
    }


    /**
     * Sets the businessIdentificationNo value for this GetTaxRequest.
     *
     * @param businessIdentificationNo
     */
    public void setBusinessIdentificationNo(java.lang.String businessIdentificationNo) {
        this.businessIdentificationNo = businessIdentificationNo;
    }
	
	/**
     * Gets the posLaneCode value.
     *
     * @return posLaneCode
     */
    public java.lang.String getPosLaneCode() {
        return posLaneCode;
    }

     /* Taxsvc2
     */
    public java.lang.String getDescription() {
        return description;
    }

     /* Taxsvc2
     */
    public java.lang.String getEmail() {
        return email;
    }

    /**
     * Sets the posLaneCode value for this GetTaxRequest.
     *
     * @param posLaneCode
     */
    public void setPosLaneCode(java.lang.String posLaneCode) {
        this.posLaneCode = posLaneCode;
    }

     /* Taxsvc2
     */
    public void setDescription(java.lang.String description) {
        this.description = description;
    }

    /* Taxsvc2
    */
    public void setEmail(java.lang.String email) {
        this.email = email;
    }
	
    private java.lang.Object __equalsCalc = null;
    public synchronized boolean equals(java.lang.Object obj) {
        if (!(obj instanceof GetTaxRequest)) return false;
        GetTaxRequest other = (GetTaxRequest) obj;
        if (obj == null) return false;
        if (this == obj) return true;
        if (__equalsCalc != null) {
            return (__equalsCalc == obj);
        }
        __equalsCalc = obj;
        boolean _equals;
        _equals = true &&
                ((this.companyCode==null && other.getCompanyCode()==null) ||
                        (this.companyCode!=null &&
                                this.companyCode.equals(other.getCompanyCode()))) &&
                ((this.docType==null && other.getDocType()==null) ||
                        (this.docType!=null &&
                                this.docType.equals(other.getDocType()))) &&
                ((this.bRBuyerType==null && other.getBRBuyerType()==null) ||
                        (this.bRBuyerType!=null &&
                                this.bRBuyerType.equals(other.getBRBuyerType()))) &&
                ((this.docCode==null && other.getDocCode()==null) ||
                        (this.docCode!=null &&
                                this.docCode.equals(other.getDocCode()))) &&
                ((this.docDate==null && other.getDocDate()==null) ||
                        (this.docDate!=null &&
                                this.docDate.equals(other.getDocDate()))) &&
                ((this.salespersonCode==null && other.getSalespersonCode()==null) ||
                        (this.salespersonCode!=null &&
                                this.salespersonCode.equals(other.getSalespersonCode()))) &&
                ((this.customerCode==null && other.getCustomerCode()==null) ||
                        (this.customerCode!=null &&
                                this.customerCode.equals(other.getCustomerCode()))) &&
                ((this.customerUsageType==null && other.getCustomerUsageType()==null) ||
                        (this.customerUsageType!=null &&
                                this.customerUsageType.equals(other.getCustomerUsageType()))) &&
                ((this.discount==null && other.getDiscount()==null) ||
                        (this.discount!=null &&
                                this.discount.equals(other.getDiscount()))) &&
                ((this.purchaseOrderNo==null && other.getPurchaseOrderNo()==null) ||
                        (this.purchaseOrderNo!=null &&
                                this.purchaseOrderNo.equals(other.getPurchaseOrderNo()))) &&
                ((this.exemptionNo==null && other.getExemptionNo()==null) ||
                        (this.exemptionNo!=null &&
                                this.exemptionNo.equals(other.getExemptionNo()))) &&
                ((this.originCode==null && other.getOriginCode()==null) ||
                        (this.originCode!=null &&
                                this.originCode.equals(other.getOriginCode()))) &&
                ((this.destinationCode==null && other.getDestinationCode()==null) ||
                        (this.destinationCode!=null &&
                                this.destinationCode.equals(other.getDestinationCode()))) &&
                ((this.addresses==null && other.getAddresses()==null) ||
                        (this.addresses!=null &&
                                this.addresses.equals(other.getAddresses()))) &&
                ((this.addressLocationTypes==null && other.getAddressLocationTypes()==null) ||
                        (this.addressLocationTypes!=null &&
                                this.addressLocationTypes.equals(other.getAddressLocationTypes()))) &&
                ((this.parameterBagItems==null && other.getParameterBagItems()==null) ||
                        (this.parameterBagItems!=null &&
                                this.parameterBagItems.equals(other.getParameterBagItems()))) &&
                ((this.lines==null && other.getLines()==null) ||
                        (this.lines!=null &&
                                this.lines.equals(other.getLines()))) &&
                ((this.detailLevel==null && other.getDetailLevel()==null) ||
                        (this.detailLevel!=null &&
                                this.detailLevel.equals(other.getDetailLevel()))) &&
                ((this.referenceCode==null && other.getReferenceCode()==null) ||
                        (this.referenceCode!=null &&
                                this.referenceCode.equals(other.getReferenceCode()))) &&                
                ((this.locationCode==null && other.getLocationCode()==null) ||
                        (this.locationCode!=null &&
                                this.locationCode.equals(other.getLocationCode()))) &&
                this.commit == other.getCommit() &&
				this.isSellerImporterOfRecord == other.getIsSellerImporterOfRecord() &&
				this.bRBuyer_IsExemptOrCannotWH_IRRF == other.getBRBuyer_IsExemptOrCannotWH_IRRF() &&
				this.bRBuyer_IsExemptOrCannotWH_PISRF == other.getBRBuyer_IsExemptOrCannotWH_PISRF() &&
				this.bRBuyer_IsExemptOrCannotWH_COFINSRF == other.getBRBuyer_IsExemptOrCannotWH_COFINSRF() &&
				this.bRBuyer_IsExemptOrCannotWH_CSLLRF == other.getBRBuyer_IsExemptOrCannotWH_CSLLRF() &&
				this.bRBuyer_IsExempt_PIS == other.getBRBuyer_IsExempt_PIS() &&
				this.bRBuyer_IsExempt_COFINS == other.getBRBuyer_IsExempt_COFINS() &&
				this.bRBuyer_IsExempt_CSLL == other.getBRBuyer_IsExempt_CSLL() &&
                ((this.batchCode==null && other.getBatchCode()==null) ||
                        (this.batchCode!=null &&
                                this.batchCode.equals(other.getBatchCode()))) &&
                //this.isTotalTaxOverriden == other.getIsTotalTaxOverriden() &&
                ((this.taxOverride==null && other.getTaxOverride()==null) ||
                        (this.taxOverride!=null &&
                                 this.taxOverride.equals(other.getTaxOverride()))) &&
                ((this.currencyCode==null && other.getCurrencyCode()==null) ||
                        (this.currencyCode!=null &&
                                this.currencyCode.equals(other.getCurrencyCode()))) &&
                ((this.serviceMode==null && other.getServiceMode()==null) ||
                        (this.serviceMode!=null &&
                                this.serviceMode.equals(other.getServiceMode()))) &&
                ((this.paymentDate==null && other.getPaymentDate()==null) ||
                        (this.paymentDate!=null &&
                                this.paymentDate.equals(other.getPaymentDate()))) &&
                ((this.exchangeRate==null && other.getExchangeRate()==null) ||
                        (this.exchangeRate!=null &&
                                this.exchangeRate.equals(other.getExchangeRate()))) &&
                ((this.exchangeRateEffDate==null && other.getExchangeRateEffDate()==null) ||
                        (this.exchangeRateEffDate!=null &&
                                this.exchangeRateEffDate.equals(other.getExchangeRateEffDate()))) &&
                ((this.businessIdentificationNo==null && other.getBusinessIdentificationNo()==null) ||
                        (this.businessIdentificationNo!=null &&
                                this.businessIdentificationNo.equals(other.getBusinessIdentificationNo())))&&
                ((this.description==null && other.getDescription()==null) ||
                        (this.description!=null &&
                                this.description.equals(other.getDescription())))&&
                ((this.email==null && other.getEmail()==null) ||
                        (this.email!=null &&
                                this.email.equals(other.getEmail())))&&
                ((this.posLaneCode==null && other.getPosLaneCode()==null) ||
                        (this.posLaneCode!=null &&
                                this.posLaneCode.equals(other.getPosLaneCode())));
        __equalsCalc = null;
        return _equals;
    }

    private boolean __hashCodeCalc = false;

    /**
     *  Serves as a hash function for a particular type,
     * suitable for use in hashing algorithms and data
     * structures like a hash table.
     * @return  hash code for this GetTaxRequest object
     * @see java.lang.Object#hashCode
     */
    public synchronized int hashCode() {
        if (__hashCodeCalc) {
            return 0;
        }
        __hashCodeCalc = true;
        int _hashCode = 1;
        if (getCompanyCode() != null) {
            _hashCode += getCompanyCode().hashCode();
        }
        if (getDocType() != null) {
            _hashCode += getDocType().hashCode();
        }
		//Taxsvc2
        if (getBRBuyerType() != null) {
            _hashCode += getBRBuyerType().hashCode();
        }
        if (getDocCode() != null) {
            _hashCode += getDocCode().hashCode();
        }
        if (getDocDate() != null) {
            _hashCode += getDocDate().hashCode();
        }
        if (getSalespersonCode() != null) {
            _hashCode += getSalespersonCode().hashCode();
        }
        if (getCustomerCode() != null) {
            _hashCode += getCustomerCode().hashCode();
        }
        if (getCustomerUsageType() != null) {
            _hashCode += getCustomerUsageType().hashCode();
        }
        if (getDiscount() != null) {
            _hashCode += getDiscount().hashCode();
        }
        if (getPurchaseOrderNo() != null) {
            _hashCode += getPurchaseOrderNo().hashCode();
        }
        if (getExemptionNo() != null) {
            _hashCode += getExemptionNo().hashCode();
        }
        if (getOriginCode() != null) {
            _hashCode += getOriginCode().hashCode();
        }
        if (getDestinationCode() != null) {
            _hashCode += getDestinationCode().hashCode();
        }
        if (getAddresses() != null) {
            _hashCode += getAddresses().hashCode();
        }
		//Added for Taxsvc2
        if (getAddressLocationTypes() != null) {
            _hashCode += getAddressLocationTypes().hashCode();
        }
        if (getParameterBagItems() != null) {
            _hashCode += getParameterBagItems().hashCode();
        }
		//Taxsvc2 end
        if (getLines() != null) {
            _hashCode += getLines().hashCode();
        }
        if (getDetailLevel() != null) {
            _hashCode += getDetailLevel().hashCode();
        }
        if (getReferenceCode() != null) {
            _hashCode += getReferenceCode().hashCode();
        }        
        if (getLocationCode() != null) {
            _hashCode += getLocationCode().hashCode();
        }
        _hashCode += (getCommit() ? Boolean.TRUE : Boolean.FALSE).hashCode();
        _hashCode += (getIsSellerImporterOfRecord() ? Boolean.TRUE : Boolean.FALSE).hashCode();		//Taxsvc2
        _hashCode += (getBRBuyer_IsExemptOrCannotWH_IRRF() ? Boolean.TRUE : Boolean.FALSE).hashCode();		//Taxsvc2
        _hashCode += (getBRBuyer_IsExemptOrCannotWH_PISRF() ? Boolean.TRUE : Boolean.FALSE).hashCode();		//Taxsvc2
        _hashCode += (getBRBuyer_IsExemptOrCannotWH_COFINSRF() ? Boolean.TRUE : Boolean.FALSE).hashCode();		//Taxsvc2
        _hashCode += (getBRBuyer_IsExemptOrCannotWH_CSLLRF() ? Boolean.TRUE : Boolean.FALSE).hashCode();		//Taxsvc2
        _hashCode += (getBRBuyer_IsExempt_PIS() ? Boolean.TRUE : Boolean.FALSE).hashCode();		//Taxsvc2
        _hashCode += (getBRBuyer_IsExempt_COFINS() ? Boolean.TRUE : Boolean.FALSE).hashCode();		//Taxsvc2
        _hashCode += (getBRBuyer_IsExempt_CSLL() ? Boolean.TRUE : Boolean.FALSE).hashCode();		//Taxsvc2
         if (getBatchCode() != null) {
            _hashCode += getBatchCode().hashCode();
        }
        if (getTaxOverride() != null) {
            _hashCode += getTaxOverride().hashCode();
        }
        if (getCurrencyCode() != null) {
            _hashCode += getCurrencyCode().hashCode();
        }
        if (getServiceMode() != null) {
            _hashCode += getServiceMode().hashCode();
        }
        if (getPaymentDate() != null) {
            _hashCode += getPaymentDate().hashCode();
        }
        if (getExchangeRate() != null) {
            _hashCode += getExchangeRate().hashCode();
        }
        if (getExchangeRateEffDate() != null) {
            _hashCode += getExchangeRateEffDate().hashCode();
        }
        if (getBusinessIdentificationNo() != null) {
            _hashCode += getBusinessIdentificationNo().hashCode();
        }
		if (getPosLaneCode() != null) {
            _hashCode += getPosLaneCode().hashCode();
        }
		if (getDescription() != null) {
            _hashCode += getDescription().hashCode();
        }
		if (getEmail() != null) {
            _hashCode += getEmail().hashCode();
        }
            __hashCodeCalc = false;
            return _hashCode;
    }

    // Type metadata
    private static org.apache.axis.description.TypeDesc typeDesc =
            new org.apache.axis.description.TypeDesc(GetTaxRequest.class, true);

    static {
        typeDesc.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "GetTaxRequest"));
        org.apache.axis.description.ElementDesc elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("companyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CompanyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocumentType"));
        elemField.setNillable(false);
		//Taxsvc2 starts
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bRBuyerType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BRBuyerType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BRBuyerTypeEnum"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
		//Taxsvc2 ends
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("docDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DocDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("salespersonCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "SalespersonCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CustomerCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("customerUsageType");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CustomerUsageType"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("discount");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Discount"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("purchaseOrderNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PurchaseOrderNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exemptionNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExemptionNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("originCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "OriginCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("destinationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DestinationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addresses");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Addresses"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfBaseAddress"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
		typeDesc.addFieldDesc(elemField);
        //Added for Taxsvc2
		elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("addressLocationTypes");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "AddressLocationTypes"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ArrayOfAddressLocationType"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
		//Taxsvc2 ends
        //Added for Taxsvc2
		elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("parameterBagItems");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ParameterBagItems"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "ArrayOfParameterBagItem"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
		//Taxsvc2 ends
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("lines");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Lines"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ArrayOfLine"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("detailLevel");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DetailLevel"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "DetailLevel"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("referenceCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ReferenceCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);        
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("locationCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "LocationCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("commit");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Commit"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
		//Added for Taxsvc2
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("isSellerImporterOfRecord");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "IsSellerImporterOfRecord"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
		//Taxsvc2 ends
		//Added for Taxsvc2
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bRBuyer_IsExemptOrCannotWH_IRRF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BRBuyer_IsExemptOrCannotWH_IRRF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
		//Taxsvc2 ends
		//Added for Taxsvc2
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bRBuyer_IsExemptOrCannotWH_PISRF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BRBuyer_IsExemptOrCannotWH_PISRF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
		//Taxsvc2 ends
		//Added for Taxsvc2
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bRBuyer_IsExemptOrCannotWH_COFINSRF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BRBuyer_IsExemptOrCannotWH_COFINSRF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
		//Taxsvc2 ends
		//Added for Taxsvc2
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bRBuyer_IsExemptOrCannotWH_CSLLRF");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BRBuyer_IsExemptOrCannotWH_CSLLRF"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
		//Taxsvc2 ends
		//Added for Taxsvc2
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bRBuyer_IsExempt_PIS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BRBuyer_IsExempt_PIS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
		//Taxsvc2 ends
		//Added for Taxsvc2
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bRBuyer_IsExempt_COFINS");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BRBuyer_IsExempt_COFINS"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
		//Taxsvc2 ends
		//Added for Taxsvc2
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("bRBuyer_IsExempt_CSLL");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BRBuyer_IsExempt_CSLL"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "boolean"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
		//Taxsvc2 ends
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("batchCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BatchCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("taxOverride");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxOverride"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "TaxOverride"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("currencyCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "CurrencyCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("serviceMode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ServiceMode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ServiceMode"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("paymentDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PaymentDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExchangeRate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "decimal"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("exchangeRateEffDate");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "ExchangeRateEffDate"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "date"));
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
        elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("businessIdentificationNo");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "BusinessIdentificationNo"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
		elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("posLaneCode");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "PosLaneCode"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
		//Added for Taxsvc2
		elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("description");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Description"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
		//Taxsvc2 ends
		//Added for Taxsvc2
		elemField = new org.apache.axis.description.ElementDesc();
        elemField.setFieldName("email");
        elemField.setXmlName(new javax.xml.namespace.QName("http://avatax.avalara.com/services", "Email"));
        elemField.setXmlType(new javax.xml.namespace.QName("http://www.w3.org/2001/XMLSchema", "string"));
        elemField.setMinOccurs(0);
        elemField.setNillable(false);
        typeDesc.addFieldDesc(elemField);
		//Taxsvc2 ends
    }

    /**
     * Return Axis type metadata object; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     */
    public static org.apache.axis.description.TypeDesc getTypeDesc() {
        return typeDesc;
    }

    /**
     * Get Axis Custom Serializer; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     */
    public static org.apache.axis.encoding.Serializer getSerializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new  org.apache.axis.encoding.ser.BeanSerializer(
                        _javaType, _xmlType, typeDesc);
    }

    /**
     * Get Axis Custom Deserializer; this method is used internally by the adapter
     * and not intended to be used by external implementation code.
     */
    public static org.apache.axis.encoding.Deserializer getDeserializer(
            java.lang.String mechType,
            java.lang.Class _javaType,
            javax.xml.namespace.QName _xmlType) {
        return
                new  com.avalara.avatax.services.base.ser.BeanDeserializer(
                        _javaType, _xmlType, typeDesc);
    }
}
