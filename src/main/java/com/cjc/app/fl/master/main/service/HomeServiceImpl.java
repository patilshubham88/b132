package com.cjc.app.fl.master.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import com.cjc.app.fl.master.main.model.Disburse;
import com.cjc.app.fl.master.main.model.Ledger;

import com.cjc.app.fl.master.main.model.Sanction;
import com.cjc.app.fl.master.main.model.UpdateLedger;

import com.cjc.app.fl.master.main.repository.DisburseRepository;
import com.cjc.app.fl.master.main.repository.LedgerRepository;

import com.cjc.app.fl.master.main.repository.SanctionRepository;
import com.cjc.app.fl.master.main.repository.UpdateLedgerRepository;


@Service
public class HomeServiceImpl implements HomeService
{
	
	@Autowired
	SanctionRepository sanctRep;
	
	@Autowired
	DisburseRepository disRep;
	
	@Autowired
	LedgerRepository ledRep;
	
	@Autowired
	UpdateLedgerRepository upLedRep;
	

	
	@Override
	public Sanction sanctionDetails(Sanction san) 
	{
		
		
		double loanAmount=san.getLoanAmount();
		float ro= san.getRateOfInterest();
		int t= san.getTenure();
	
		System.out.println(loanAmount);
		
       double emi;
		
		ro = ro / (12 * 100); // one month interest
		t = t * 12; // one month period
		emi = (loanAmount * ro * (double)Math.pow(1 + ro, t))
				/ (double)(Math.pow(1 + ro, t) - 1);
	
		System.out.println("MonthlyEmi :-"+emi);
		
		san.setMonthlyEmi(emi);
		
		return sanctRep.save(san);

	}
	
	@Override
	public Sanction getSanctionById(int loanId) 
	{
		Sanction s=sanctRep.findAllByLoanId(loanId);
		
		return s;
	}
	
	public List<Sanction> getAllSanction()
	{

		return sanctRep.findAll();
	}
	
//	@Override
//	public Disburse disburseDetails(Disburse dis, int loanId) 
//	{
//		 Sanction sn=getSanctionById(loanId);
//		  
//		    System.out.println(sn);
//		    dis.setCustomerId(sn.getCustomerId());
//		    dis.setTenure(sn.getTenure());
//		    dis.setMonthlyEmi(sn.getMonthlyEmi());
//		    dis.setGeneratedDate(sn.getGeneratedDate());
//		    dis.setDealerName(sn.getDealerName());
//		    dis.setDealerBankName(sn.getDealerBankName());
//		    dis.setDealerBankAccountNumber(sn.getDealerBankAccountNumber());
//		    dis.setDealerBankIfscCode(sn.getDealerBankIfscCode());
//		    dis.setLoanAmountPayToDealerAcc(sn.getLoanAmountPayToDealerAcc());
//		    dis.setDealerEmail(sn.getDealerEmail());
//		   
//		  
//		   
//		   System.out.println(dis);
//		   
//		return disRep.save(dis);
//	}


	
	
	@Override
	public List<Ledger> getAllLedger() 
	{
		return ledRep.findAll();
	}
	
	@Override
	public Ledger editLedger(Ledger l, int ledgerId) 
	{
		double emi= l.getEmiAmount();
		double remaning= l.getRemaningAmountToPay();
		int t=l.getTenure();
		int rt=l.getRemainingTenure();
		double tap=l.getTotalAmountPaid();
		String date=l.getTransactionDate();
		
		
		double remaning1=remaning-emi;
		int rt1=rt-1;
		double tap1=tap+emi;
		
		Ledger le=new Ledger();
		le.setLedgerId(l.getLedgerId());
		le.setCaseNo(l.getCaseNo());
		le.setEmiAmount(l.getEmiAmount());
		le.setLastEmiPaidDate(date);
		le.setLoanAmountPayToDealerAcc(l.getLoanAmountPayToDealerAcc());
		le.setProcessingCharges(l.getProcessingCharges());
		le.setRemainingTenure(rt1);
		le.setRemaningAmountToPay(remaning1);
		le.setTenure(t);
		le.setTotalAmountPaid(tap1);
		le.setTransactionDate(l.getTransactionDate());
		
		UpdateLedger upl=new UpdateLedger();
		upl.setCaseNo(le.getCaseNo());
		upl.setTenure(le.getTenure());
		upl.setLoanAmountPayToDealerAcc(le.getLoanAmountPayToDealerAcc());
		upl.setProcessingCharges(le.getProcessingCharges());
		upl.setRemaningAmountToPay(le.getRemaningAmountToPay());
		upl.setEmiAmount(le.getEmiAmount());
		upl.setRemainingTenure(le.getRemainingTenure());
		upl.setLastEmiPaidDate(le.getLastEmiPaidDate());
		upl.setTotalAmountPaid(le.getTotalAmountPaid());
		upl.setTransactionDate(le.getTransactionDate());
		
		
		
		upLedRep.save(upl);
		
		return ledRep.save(le);
	}


	@Override
	public UpdateLedger updateLedger(UpdateLedger updateLedger) 
	{
		
				
		System.out.println(updateLedger.getRemaningAmountToPay());
		System.out.println(updateLedger.getRemainingTenure());
		
		double emi= updateLedger.getEmiAmount();
		double remaning= updateLedger.getRemaningAmountToPay();
		int t=updateLedger.getTenure();
		int rt=updateLedger.getRemainingTenure();
		double tap=updateLedger.getTotalAmountPaid();
		String date=updateLedger.getTransactionDate();
		
		
		double remaning1=remaning-emi;
		int rt1=rt-1;
		double tap1=tap+emi;
		
		UpdateLedger up=new UpdateLedger();
		up.setCaseNo(updateLedger.getCaseNo());
		up.setEmiAmount(updateLedger.getEmiAmount());
		up.setLastEmiPaidDate(date);
		up.setLoanAmountPayToDealerAcc(updateLedger.getLoanAmountPayToDealerAcc());
		up.setProcessingCharges(updateLedger.getProcessingCharges());
		up.setRemainingTenure(rt1);
		up.setRemaningAmountToPay(remaning1);
		up.setTenure(t);
		up.setTotalAmountPaid(tap1);
		up.setTransactionDate(updateLedger.getTransactionDate());
	
		
		return upLedRep.save(up);
	}
	
	@Override
	public List<UpdateLedger> getAllUpdateLedger() 
	{
		return upLedRep.findAll();
	}

	
	@Override
	public UpdateLedger editUpdateLedger(UpdateLedger updateLedger) 
	{
		return upLedRep.save(updateLedger);
	}

	@Override
	public List<Disburse> getAllDisburse() 
	{
		return disRep.findAll();
	}
	
	@Override
	public List<UpdateLedger> getUpdateLedgerByCaseNo(int caseNo) 
	{
		return upLedRep.findAllByCaseNo(caseNo);
	}

	@Override
	public Disburse getDisburseByCaseNo(int caseNo) 
	{
		return disRep.getByCaseNo(caseNo);
	}

	@Override
	public Disburse disburseDetails1(Disburse dis) 
	{
		int t= dis.getTenure();
		int t1=t*12;
		
		Ledger l=new Ledger();
		l.setCaseNo(dis.getCaseNo());
		l.setTenure(t1);
		l.setLoanAmountPayToDealerAcc(dis.getLoanAmountPayToDealerAcc());
		l.setProcessingCharges(dis.getProcessingCharges());
		l.setRemaningAmountToPay(dis.getLoanAmount());
		l.setEmiAmount(dis.getMonthlyEmi());
		l.setRemainingTenure(t1);
		
		UpdateLedger upl=new UpdateLedger();
		upl.setCaseNo(l.getCaseNo());
		upl.setTenure(l.getTenure());
		upl.setLoanAmountPayToDealerAcc(l.getLoanAmountPayToDealerAcc());
		upl.setProcessingCharges(l.getProcessingCharges());
		upl.setRemaningAmountToPay(l.getRemaningAmountToPay());
		upl.setEmiAmount(l.getEmiAmount());
		upl.setRemainingTenure(l.getTenure());
		
		ledRep.save(l);
		upLedRep.save(upl);
		return disRep.save(dis);
	}
	
	
	
	
	
	
	//---------------------------
	
	@Override
	public Ledger ledgerDetails(Ledger ledger, int caseNo) 
	{
		
		Disburse d=getDisburseByCaseNo(caseNo);
		ledger.setCaseNo(d.getCaseNo());
		ledger.setLoanAmountPayToDealerAcc(d.getLoanAmountPayToDealerAcc());
		ledger.setTenure(d.getTenure());
		ledger.setEmiAmount(d.getMonthlyEmi());
		
		return ledRep.save(ledger);
	}

	
	@Override
	public Ledger getLedgerById(int ledgerId) 
	{
		return ledRep.findAllByLedgerId(ledgerId);
	}
	
	@Override
	public Ledger getByCaseNo(int caseNo) 
	{
		return ledRep.findByCaseNo(caseNo);
	}

	
	

	




	

}
