/**
 * 
 */
package expensices.model;

import java.util.Date;

/**
 * @author hp
 *
 */
public class LoanDetails extends AddressDetails {
	private String loanType;
	private float emi;
	private Date dueDate;
	private int loanTenure;
	private int Tenure;

	/**
	 * @return the tenure
	 */
	public int getTenure() {
		return Tenure;
	}

	/**
	 * @param tenure the tenure to set
	 */
	public void setTenure(int tenure) {
		Tenure = tenure;
	}

	private int loanPaidEmi;
	private float loanAmount;
	private float interestRate;
	private float processingFee;
	private long loanNumber;
	private float principalAmount;

	/**
	 * @return the principalAmount
	 */
	public float getPrincipalAmount() {
		return principalAmount;
	}

	/**
	 * @param principalAmount the principalAmount to set
	 */
	public void setPrincipalAmount(float principalAmount) {
		this.principalAmount = principalAmount;
	}

	/**
	 * @return the rateOfInterest
	 */
	public float getRateOfInterest() {
		return rateOfInterest;
	}

	/**
	 * @param rateOfInterest the rateOfInterest to set
	 */
	public void setRateOfInterest(float rateOfInterest) {
		this.rateOfInterest = rateOfInterest;
	}

	private float rateOfInterest;

	//private AddressDetails loanTackerAddress;

	/**
	 * @return the loanType
	 */
	public String getLoanType() {
		return loanType;
	}

	/**
	 * @param loanType the loanType to set
	 */
	public void setLoanType(String loanType) {
		this.loanType = loanType;
	}

	/**
	 * @return the emi
	 */
	public float getEmi() {
		return emi;
	}

	/**
	 * @param emi the emi to set
	 */
	public void setEmi(float emi) {
		this.emi = emi;
	}

	/**
	 * @return the dueDate
	 */
	public Date getDueDate() {
		return dueDate;
	}

	/**
	 * @param dueDate the dueDate to set
	 */
	public void setDueDate(Date dueDate) {
		this.dueDate = dueDate;
	}

	/**
	 * @return the loanTenure
	 */
	public int getLoanTenure() {
		return loanTenure;
	}

	/**
	 * @param loanTenure the loanTenure to set
	 */
	public void setLoanTenure(int loanTenure) {
		this.loanTenure = loanTenure;
	}

	/**
	 * @return the loanPaidEmi
	 */
	public int getLoanPaidEmi() {
		return loanPaidEmi;
	}

	/**
	 * @param loanPaidEmi the loanPaidEmi to set
	 */
	public void setLoanPaidEmi(int loanPaidEmi) {
		this.loanPaidEmi = loanPaidEmi;
	}

	/**
	 * @return the loanAmount
	 */
	public float getLoanAmount() {
		return loanAmount;
	}

	/**
	 * @param loanAmount the loanAmount to set
	 */
	public void setLoanAmount(float loanAmount) {
		this.loanAmount = loanAmount;
	}

	/**
	 * @return the interestRate
	 */
	public float getInterestRate() {
		return interestRate;
	}

	/**
	 * @param interestRate the interestRate to set
	 */
	public void setInterestRate(float interestRate) {
		this.interestRate = interestRate;
	}

	/**
	 * @return the processingFee
	 */
	public float getProcessingFee() {
		return processingFee;
	}

	/**
	 * @param processingFee the processingFee to set
	 */
	public void setProcessingFee(float processingFee) {
		this.processingFee = processingFee;
	}

	/**
	 * @return the loanNumber
	 */
	public long getLoanNumber() {
		return loanNumber;
	}

	/**
	 * @param loanNumber the loanNumber to set
	 */
	public void setLoanNumber(long loanNumber) {
		this.loanNumber = loanNumber;
	}

	/**
	 * @return the loanTackerAddress
	 */
	/*
	 * public AddressDetails getLoanTackerAddress() { return loanTackerAddress; }
	 * 
	 *//**
		 * @param loanTackerAddress the loanTackerAddress to set
		 *//*
			 * public void setLoanTackerAddress(AddressDetails loanTackerAddress) {
			 * this.loanTackerAddress = loanTackerAddress; }
			 */

}
