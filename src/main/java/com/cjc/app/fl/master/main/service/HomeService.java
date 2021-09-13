package com.cjc.app.fl.master.main.service;

import java.util.List;
import com.cjc.app.fl.master.main.model.Disburse;
import com.cjc.app.fl.master.main.model.Ledger;
import com.cjc.app.fl.master.main.model.Sanction;
import com.cjc.app.fl.master.main.model.UpdateLedger;


public interface HomeService 
{
	public Sanction sanctionDetails(Sanction san);
//	public Disburse disburseDetails(Disburse dis, int loanId);
	public Disburse disburseDetails1(Disburse dis);
	public List<Disburse> getAllDisburse();
	public Disburse getDisburseByCaseNo(int caseNo);
	
	
	public Ledger editLedger(Ledger l, int ledgerId);
	public List<Ledger> getAllLedger();
	
	public UpdateLedger updateLedger(UpdateLedger updateLedger);
	public Sanction getSanctionById(int loanId);
	public List<Sanction> getAllSanction();
	public List<UpdateLedger> getAllUpdateLedger();
	public List<UpdateLedger> getUpdateLedgerByCaseNo(int caseNo);
	public UpdateLedger editUpdateLedger(UpdateLedger updateLedger);
	
	
	//--------------Not Used-------------------------//
	public Ledger getLedgerById(int ledgerId);
	public Ledger getByCaseNo(int caseNo);
	public Ledger ledgerDetails(Ledger ledger, int caseNo);
	
	
	


}
