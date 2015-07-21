package com.rmx.dao;

import com.rmx.dto.Payment;
import org.springframework.stereotype.Repository;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.UUID;

@Repository
public class JdbcPaymentDAO implements PaymentDAO{
    @Override
    public List<Payment> getAllPayments() {
        Payment payment = new Payment();
        payment.setAmount(BigDecimal.valueOf(2000));
        payment.setCompanyName("Tradeshift");
        payment.setCurrency("CNY");
        payment.setNote("pay for computers");
        payment.setPaymentId(UUID.randomUUID());
        List<Payment> payments = new ArrayList<Payment>();
        payments.add(payment);
        return payments;
    }

    @Override
    public Boolean savePayment() {
        return null;
    }
}
