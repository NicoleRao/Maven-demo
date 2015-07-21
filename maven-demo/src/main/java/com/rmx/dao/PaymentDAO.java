package com.rmx.dao;

import com.rmx.dto.Payment;

import java.util.List;

public interface PaymentDAO {
    public List<Payment> getAllPayments();

    public Boolean savePayment();
}
