package com.starter.lifseed.com.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class InvoiceStatusController {
	
	@GetMapping("/invoice_status")
	public String getClients() {
		return "invoiceStatus";
	}

}
