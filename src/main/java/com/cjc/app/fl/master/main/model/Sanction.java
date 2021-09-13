package com.cjc.app.fl.master.main.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Sanction {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private int loanId;
	private int customerId;
	private String customerName;
	private long customerMobNo;
	@OneToOne(cascade = CascadeType.ALL)
	private Address customerAddress;
	private String vehicleCompanyName;
	private String vehicleModel;
	private String vehicleChaseNo;
	private double loanAmount;
	private float rateOfInterest;
	private int tenure;
	private double processingCharges;
	private double monthlyEmi;
	private String remark;
	private String generatedBy;
	private String generatedDate;
	private String status;
	private String dealerName;
	private String dealerBankName;
	private String dealerBankIfscCode;
	private long dealerBankAccountNumber;
	private double loanAmountPayToDealerAcc;
	private String dealerEmail;
	
	public int getLoanId() {
		return loanId;
	}
	public void setLoanId(int loanId) {
		this.loanId = loanId;
	}
	public int getCustomerId() {
		return customerId;
	}
	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}
	public String getCustomerName() {
		return customerName;
	}
	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}
	public long getCustomerMobNo() {
		return customerMobNo;
	}
	public void setCustomerMobNo(long customerMobNo) {
		this.customerMobNo = customerMobNo;
	}
	public Address getCustomerAddress() {
		return customerAddress;
	}
	public void setCustomerAddress(Address customerAddress) {
		this.customerAddress = customerAddress;
	}
	public String getVehicleCompanyName() {
		return vehicleCompanyName;
	}
	public void setVehicleCompanyName(String vehicleCompanyName) {
		this.vehicleCompanyName = vehicleCompanyName;
	}
	public String getVehicleModel() {
		return vehicleModel;
	}
	public void setVehicleModel(String vehicleModel) {
		this.vehicleModel = vehicleModel;
	}
	public String getVehicleChaseNo() {
		return vehicleChaseNo;
	}
	public void setVehicleChaseNo(String vehicleChaseNo) {
		this.vehicleChaseNo = vehicleChaseNo;
	}
	public double getLoanAmount() {
		return loanAmount;
	}
	public void setLoanAmount(double loanAmount) {
		this.loanAmount = loanAmount;
	}
	public float getRateOfInterest() {
		return rateOfInterest;
	}
	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}
	public int getTenure() {
		return tenure;
	}
	public void setTenure(int tenure) {
		this.tenure = tenure;
	}
	public double getProcessingCharges() {
		return processingCharges;
	}
	public void setProcessingCharges(double processingCharges) {
		this.processingCharges = processingCharges;
	}
	public double getMonthlyEmi() {
		return monthlyEmi;
	}
	public void setMonthlyEmi(double monthlyEmi) {
		this.monthlyEmi = monthlyEmi;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
	}
	public String getGeneratedBy() {
		return generatedBy;
	}
	public void setGeneratedBy(String generatedBy) {
		this.generatedBy = generatedBy;
	}
	public String getGeneratedDate() {
		return generatedDate;
	}
	public void setGeneratedDate(String generatedDate) {
		this.generatedDate = generatedDate;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
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
	public double getLoanAmountPayToDealerAcc() {
		return loanAmountPayToDealerAcc;
	}
	public void setLoanAmountPayToDealerAcc(double loanAmountPayToDealerAcc) {
		this.loanAmountPayToDealerAcc = loanAmountPayToDealerAcc;
	}
	public String getDealerEmail() {
		return dealerEmail;
	}
	public void setDealerEmail(String dealerEmail) {
		this.dealerEmail = dealerEmail;
	}




}
