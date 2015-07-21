package com.rmx.service;

import com.rmx.dao.JdbcPaymentDAO;
import com.rmx.dao.PaymentDAO;
import com.rmx.dto.Payment;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class PaymentService {

    protected PaymentDAO jdbcPaymentDAO;

    @Autowired
    public PaymentService(JdbcPaymentDAO jdbcPaymentDAO) {
        this.jdbcPaymentDAO = jdbcPaymentDAO;
    }

    public List<Payment> getAllPayments() {
        return jdbcPaymentDAO.getAllPayments();
    }
}
