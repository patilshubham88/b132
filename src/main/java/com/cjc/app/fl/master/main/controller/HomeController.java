package com.cjc.app.fl.master.main.controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.cjc.app.fl.master.main.model.Disburse;
import com.cjc.app.fl.master.main.model.Sanction;
import com.cjc.app.fl.master.main.service.HomeService;

@CrossOrigin("*")
@RestController
public class HomeController 
{
	@Autowired
	HomeService hs;
	

	@Autowired
	public JavaMailSender javamailsender;
	
	 double loanAmount;
	  String dealerName;
	  String dealerBankName;
      String dealerBankIfscCode;
	  long dealerBankAccountNumber;
	  double loanAmountPayToDealerAcc;
	  int caseNo;
	  String dealerEmail;


	@GetMapping("/mailsend")
	public String send()
	{
		SimpleMailMessage m=new SimpleMailMessage();
		
			m.setTo(dealerEmail);
			
			m.setSubject("Regards form cjc finance");
			
			m.setText("Case No :-"+caseNo+"\n"
					+"Dealer Name :-"+dealerName+"\n"
					+"Dealer Bank AccNo :-"+dealerBankAccountNumber+"\n"
					+"Dealer Bank Name:-"+dealerBankName+"\n"
					+"Loan Amount :-"+loanAmount+"\n"
					+"Loan Amount Pay To DealerAcc :-"+loanAmountPayToDealerAcc);
		
			javamailsender.send(m);
			
			
			return "send";
	
	}

	
	
	@PostMapping("/addSanction")
	public Sanction addSanction(@RequestBody Sanction sanct)
	{
		return hs.sanctionDetails(sanct);
	}
	
	@GetMapping("/getSanctionById/{loanId}")
	public Sanction getSanction(@PathVariable int loanId)
	{
		return hs.getSanctionById(loanId);
	}
	
	@GetMapping("/getAllSanction")
	public List<Sanction> getAllSanction()
	{
		return hs.getAllSanction();
	}
	

//	@PostMapping("/addDisburse/{loanId}")
//	public Disburse addDisburse(@RequestBody Disburse disburse, @PathVariable int loanId)
//	{
//		return hs.disburseDetails(disburse, loanId);
//	}
	
	@PostMapping("/addDisburse1")
	public Disburse addDisburse1(@RequestBody Disburse disburse)
	{
		Disburse disburse1=hs.disburseDetails1(disburse);
		
		dealerName=disburse.getDealerName();
		dealerBankName=disburse.getDealerBankName();
		dealerBankAccountNumber=disburse.getDealerBankAccountNumber();
		loanAmountPayToDealerAcc=disburse.getLoanAmountPayToDealerAcc();
		caseNo=disburse.getCaseNo();
		dealerEmail=disburse.getDealerEmail();
		loanAmount=disburse.getLoanAmount();
		
		send();
		
		return disburse1;
	}
	
	@GetMapping("/getAllDisburse")
	public List<Disburse> getAllDisburse()
	{
		return hs.getAllDisburse();
	}
	

}
