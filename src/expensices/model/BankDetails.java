/**
 * 
 */
package expensices.model;

/**
 * @author hp
 *
 */
public class BankDetails extends AddressDetails {
	private long accountNumber;
	private String bankName;
	private String ifscCode;
	private String branchName;

	// private AddressDetails bankAddress;

	/**
	 * @return the accountNumber
	 */
	public long getAccountNumber() {
		return accountNumber;
	}

	/**
	 * @param accountNumber the accountNumber to set
	 */
	public void setAccountNumber(long accountNumber) {
		this.accountNumber = accountNumber;
	}

	/**
	 * @return the bankName
	 */
	public String getBankName() {
		return bankName;
	}

	/**
	 * @param bankName the bankName to set
	 */
	public void setBankName(String bankName) {
		this.bankName = bankName;
	}

	/**
	 * @return the ifscCode
	 */
	public String getIfscCode() {
		return ifscCode;
	}

	/**
	 * @param ifscCode the ifscCode to set
	 */
	public void setIfscCode(String ifscCode) {
		this.ifscCode = ifscCode;
	}

	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}

	/**
	 * @param branchName the branchName to set
	 */
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}

	/**
	 * @return the bankAddress
	 */
	/*
	 * public AddressDetails getBankAddress() { return bankAddress; }
	 * 
	 *//**
		 * @param bankAddress the bankAddress to set
		 *//*
			 * public void setBankAddress(AddressDetails bankAddress) { this.bankAddress =
			 * bankAddress; }
			 */
}
