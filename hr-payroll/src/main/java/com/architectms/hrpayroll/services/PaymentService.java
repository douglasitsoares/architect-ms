package com.architectms.hrpayroll.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.architectms.hrpayroll.entities.Payment;
import com.architectms.hrpayroll.entities.Worker;
import com.architectms.hrpayroll.feignclients.WorkerFeingClient;

@Service
public class PaymentService {
	
	
	@Autowired
	private WorkerFeingClient workerFeignClient;
	
	public Payment getPayment(long workerId, int days) {
		
		Worker worker = workerFeignClient.findById(workerId).getBody();
		return new Payment(worker.getName(),worker.getDailyIncome(), days);
	}
}
