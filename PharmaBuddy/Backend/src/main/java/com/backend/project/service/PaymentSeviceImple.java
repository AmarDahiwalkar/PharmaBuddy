package com.backend.project.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.backend.project.entities.Payment;
import com.backend.project.repository.PaymentRepository;

@Service
public class PaymentSeviceImple implements PaymentService {
	
	@Autowired
	PaymentRepository paymentRepo;

	@Override
	public Payment savePayment(Payment payment) {
		// TODO Auto-generated method stub
		return paymentRepo.save(payment);
	}

	@Override
	public Payment findPaymentById(int id) {
		// TODO Auto-generated method stub
		Optional<Payment> payment=paymentRepo.findById(id);
		return payment.get();
	}

}
