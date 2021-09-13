package com.cjc.app.fl.master.main.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Ledger {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int ledgerId;
	private int caseNo;
	private double remaningAmountToPay;
	private double processingCharges;
	private double loanAmountPayToDealerAcc;
	private double totalAmountPaid;
	private int tenure;
	private double emiAmount;
	private String lastEmiPaidDate;
	public String getLastEmiPaidDate() {
		return lastEmiPaidDate;
	}
	public void setLastEmiPaidDate(String lastEmiPaidDate) {
		this.lastEmiPaidDate = lastEmiPaidDate;
	}
	private String transactionDate;
	private int remainingTenure;
	
	public int getLedgerId() {
		return ledgerId;
	}
	public void setLedgerId(int ledgerId) {
		this.ledgerId = ledgerId;
	}
	public int getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}
	
	public double getProcessingCharges() {
		return processingCharges;
	}
	public void setProcessingCharges(double processingCharges) {
		this.processingCharges = processingCharges;
	}
	public double getLoanAmountPayToDealerAcc() {
		return loanAmountPayToDealerAcc;
	}
	public void setLoanAmountPayToDealerAcc(double loanAmountPayToDealerAcc) {
		this.loanAmountPayToDealerAcc = loanAmountPayToDealerAcc;
	}
	public double getTotalAmountPaid() {
		return totalAmountPaid;
	}
	public void setTotalAmountPaid(double totalAmountPaid) {
		this.totalAmountPaid = totalAmountPaid;
	}
	public double getRemaningAmountToPay() {
		return remaningAmountToPay;
	}
	public void setRemaningAmountToPay(double remaningAmountToPay) {
		this.remaningAmountToPay = remaningAmountToPay;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getEmiAmount() {
		return emiAmount;
	}
	public void setEmiAmount(double emiAmount) {
		this.emiAmount = emiAmount;
	}
	
	public String getTransactionDate() {
		return transactionDate;
	}
	public void setTransactionDate(String transactionDate) {
		this.transactionDate = transactionDate;
	}
	public int getRemainingTenure() {
		return remainingTenure;
	}
	public void setRemainingTenure(int remainingTenure) {
		this.remainingTenure = remainingTenure;
	}

	
}
