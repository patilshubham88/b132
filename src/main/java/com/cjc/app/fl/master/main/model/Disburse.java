package com.cjc.app.fl.master.main.model;


import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;


@Entity
public class Disburse {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int disburseId;
	private int customerId;
	private int caseNo;
	private String dealerName;
	private String dealerBankName;
	private String dealerBankIfscCode;
	private long dealerBankAccountNumber;
	private String dealerAccountType;
	private String dealerEmail;
	private double loanAmount;
	private double processingCharges;
	private double loanAmountPayToDealerAcc;
	private String modeOfTransfer;
	private String amountTransferDate;
	private String disburseStatus;
	private int tenure;
	private double monthlyEmi;
	private String generatedDate;
	
	public int getDisburseId() {
		return disburseId;
	}
	public void setDisburseId(int disburseId) {
		this.disburseId = disburseId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public int getCaseNo() {
		return caseNo;
	}
	public void setCaseNo(int caseNo) {
		this.caseNo = caseNo;
	}
	public String getDealerName() {
		return dealerName;
	}
	public void setDealerName(String dealerName) {
		this.dealerName = dealerName;
	}
	public String getDealerBankName() {
		return dealerBankName;
	}
	public void setDealerBankName(String dealerBankName) {
		this.dealerBankName = dealerBankName;
	}
	public String getDealerBankIfscCode() {
		return dealerBankIfscCode;
	}
	public void setDealerBankIfscCode(String dealerBankIfscCode) {
		this.dealerBankIfscCode = dealerBankIfscCode;
	}
	public long getDealerBankAccountNumber() {
		return dealerBankAccountNumber;
	}
	public void setDealerBankAccountNumber(long dealerBankAccountNumber) {
		this.dealerBankAccountNumber = dealerBankAccountNumber;
	}
	public String getDealerAccountType() {
		return dealerAccountType;
	}
	public void setDealerAccountType(String dealerAccountType) {
		this.dealerAccountType = dealerAccountType;
	}
	public String getDealerEmail() {
		return dealerEmail;
	}
	public void setDealerEmail(String dealerEmail) {
		this.dealerEmail = dealerEmail;
	}
	
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
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
	public String getModeOfTransfer() {
		return modeOfTransfer;
	}
	public void setModeOfTransfer(String modeOfTransfer) {
		this.modeOfTransfer = modeOfTransfer;
	}
	public String getAmountTransferDate() {
		return amountTransferDate;
	}
	public void setAmountTransferDate(String amountTransferDate) {
		this.amountTransferDate = amountTransferDate;
	}
	public String getDisburseStatus() {
		return disburseStatus;
	}
	public void setDisburseStatus(String disburseStatus) {
		this.disburseStatus = disburseStatus;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getMonthlyEmi() {
		return monthlyEmi;
	}
	public void setMonthlyEmi(double monthlyEmi) {
		this.monthlyEmi = monthlyEmi;
	}
	public String getGeneratedDate() {
		return generatedDate;
	}
	public void setGeneratedDate(String generatedDate) {
		this.generatedDate = generatedDate;
	}

	
}
