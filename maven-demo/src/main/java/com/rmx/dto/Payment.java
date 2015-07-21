package com.rmx.dto;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.math.BigDecimal;
import java.util.UUID;

@XmlRootElement(name = "Payment")
@XmlAccessorType(XmlAccessType.FIELD)
public class Payment {

    @XmlElement(name = "PaymentId")
    private UUID paymentId;

    @XmlElement(name = "CompanyName")
    private String companyName;

    @XmlElement(name = "Note")
    private String note;

    @XmlElement(name = "Amount")
    private BigDecimal amount;

    @XmlElement(name = "Currency")
    private String currency;

    public Payment() {
    }

    public UUID getPaymentId() {
        return paymentId;
    }

    public void setPaymentId(UUID paymentId) {
        this.paymentId = paymentId;
    }

    public String getCompanyName() {
        return companyName;
    }

    public void setCompanyName(String companyName) {
        this.companyName = companyName;
    }

    public String getNote() {
        return note;
    }

    public void setNote(String note) {
        this.note = note;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }
}
