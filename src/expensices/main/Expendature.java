/**
 * 
 */
package expensices.main;

//import expensices.model.AccountHolderDetails;
//import expensices.model.AddressDetails;
import expensices.model.BankDetails;
import expensices.model.LoanDetails;

/**
 * @author hp
 *
 */
public class Expendature {

	public static void main(String[] args) {

		System.out.println("loan example :::::");

		LoanDetails loanDetails = new LoanDetails();
		BankDetails bankDetails = new BankDetails();

		Expendature expendature = new Expendature();

		bankDetails = expendature.setBankDetails();
		expendature.diplayBranchDetails(bankDetails);
		loanDetails = expendature.setLoanDetails();
		expendature.displayLoanDetails(loanDetails);
		/*
		* accountHolderDetails = expendature.setAccountHolderDetails();
		* expendature.diplayAccountHolderDetails(accountHolderDetails);
		*/

		/*
		* AccountHolderDetails accountHolderDetails = new AccountHolderDetails();
		* AccountHolderDetails accountHolderDetails1 = new AccountHolderDetails();
		* AccountHolderDetails accountHolderDetails2 = new AccountHolderDetails();
		* accountHolderDetails = expendature.setAccountHolderDetails();
		* accountHolderDetails1 = expendature.setAccountHolderDetails();
		* accountHolderDetails1.setFullName("chakri");
		* accountHolderDetails1.setPanNumber("haser1234e");
		* accountHolderDetails1.setAdharNumber(145780126512l); accountHolderDetails2 =
		* expendature.setAccountHolderDetails();
		* accountHolderDetails2.setFullName("Nani");
		* accountHolderDetails2.setPanNumber("jerde7896a");
		* accountHolderDetails2.setAdharNumber(987432123789l); AccountHolderDetails[]
		* holderDetails = new AccountHolderDetails[3]; holderDetails[0] =
		* accountHolderDetails; holderDetails[1] = accountHolderDetails1;
		* holderDetails[2] = accountHolderDetails2; for (int i = 0; i <
		* holderDetails.length; i++) { System.out.println("--------------------------"
		* + i + "--------------------------");
		* expendature.diplayAccountHolderDetails(holderDetails[i]); }
		*/

		/*
		* LoanDetails loanDetails = new LoanDetails(); loanDetails =
		* expendature.setLoanDetails(); String loanstatus =
		* expendature.loanStatus(loanDetails.getLoanNumber(),
		* loanDetails.getLoanTenure(), loanDetails.getLoanPaidEmi());
		* System.out.println("loan status is : "+loanstatus);
		*/

		}

		/*
		 * private float calculateInterestAmount(float principalAmount, int tenure,
		 * float rateOfInterest) { float interestAmout = 0.0f; // todo caculation
		 * 
		 * return interestAmout; }
		 * 
		 * private float precloserAmount(float pendingAmount, float rateOfPrecloser) {
		 * float preCloserAmount = 0.0f; // todo caculation
		 * 
		 * return preCloserAmount; }
		 * 
		 * private float mislaniousCharges(String mislaniousType) { float
		 * mislaniousChargeAmount = 0.0f;
		 * 
		 * return mislaniousChargeAmount; }
		 * 
		 */	
		/*
		 * private String loanStatus(long loanNumber, int loanTenure, int loanPaidEmi) {
		 * String loanStatus = "inprogress"; if (loanTenure == loanPaidEmi) { loanStatus
		 * = "closed"; } else { int remainingEmi = loanTenure - loanPaidEmi; loanStatus
		 * = loanStatus.concat(" remaining emi: " + remainingEmi); } loanStatus =
		 * loanStatus.concat(" loan number : " + loanNumber); return loanStatus; }
		 */
		private BankDetails setBankDetails() {
		BankDetails bankDetails = new BankDetails();
		// AddressDetails bankAddressDetails = new AddressDetails();
		bankDetails.setAccountNumber(1234567890);
		bankDetails.setBankName("SBI");
		bankDetails.setBranchName("Warangal");
		bankDetails.setIfscCode("SBIN0000673");
		bankDetails.setDoorNumber("1-99");
		bankDetails.setFlatNumber("#456");
		bankDetails.setStreetName("Coffee street");
		bankDetails.setDistrict("Warangal");
		bankDetails.setState("telangana");
		bankDetails.setPincode("543672");
		bankDetails.setPlanet("moon");
		bankDetails.setRadius(123665l);
		// bankDetails.setBankAddress(bankAddressDetails);

		return bankDetails;
		}

		/*
		 * private AccountHolderDetails setAccountHolderDetails() { AccountHolderDetails
		 * accountHolderDetails = new AccountHolderDetails(); // AddressDetails
		 * accountHolderAddressDetails = new AddressDetails();
		 * accountHolderDetails.setFullName("kiran reddy");
		 * accountHolderDetails.setContactNumber(765431890);
		 * accountHolderDetails.setPanNumber("axipg1234q");
		 * accountHolderDetails.setAdharNumber(222612345678l);
		 * accountHolderDetails.setEmailId("montreetechpvtltd@gmail.com");
		 * accountHolderDetails.setDoorNumber("234");
		 * accountHolderDetails.setFlatNumber("675");
		 * accountHolderDetails.setStreetName("mg road");
		 * accountHolderDetails.setDistrict("rangareddy");
		 * accountHolderDetails.setState("telangana");
		 * accountHolderDetails.setPincode("54329"); //
		 * accountHolderDetails.setAccountHolderAddress(accountHolderAddressDetails);
		 * return accountHolderDetails; }
		 */

		private LoanDetails setLoanDetails() {
		LoanDetails loanDetails = new LoanDetails();
		loanDetails.setLoanNumber(234568656556l);
		loanDetails.setLoanTenure(60);
		loanDetails.setLoanPaidEmi(55);
		// AddressDetails loanTackerAddress = new AddressDetails();

		loanDetails.setDoorNumber("234");
		loanDetails.setFlatNumber("675");
		loanDetails.setStreetName("mg road");
		loanDetails.setDistrict("rangareddy");
		loanDetails.setState("telangana");
		loanDetails.setPincode("54329");
		// loanDetails.setLoanTackerAddress(loanTackerAddress);
		return loanDetails;
		}

		private void diplayBranchDetails(BankDetails bankDetailsInfo) {
		System.out.println("Bank details ::::");
		System.out.println("Bank account Number : " + bankDetailsInfo.getAccountNumber());
		System.out.println("Bank Name : " + bankDetailsInfo.getBankName());
		System.out.println("Bank branch name : " + bankDetailsInfo.getBranchName());
		System.out.println("Bank ifsc code : " + bankDetailsInfo.getIfscCode());

		System.out.println("Bank address details ::::");
		System.out.println("door number : " + bankDetailsInfo.getDoorNumber());
		System.out.println("flat number : " + bankDetailsInfo.getFlatNumber());
		System.out.println("street Name : " + bankDetailsInfo.getStreetName());
		System.out.println("distict : " + bankDetailsInfo.getDistrict());
		System.out.println("state : " + bankDetailsInfo.getState());
		System.out.println("pincode : " + bankDetailsInfo.getPincode());
		System.out.println("Planet : " + bankDetailsInfo.getPlanet());

		}

		/*
		 * private void diplayAccountHolderDetails(AccountHolderDetails
		 * accountHolderDetails) { System.out.println("Account holder details ::::");
		 * System.out.println("full name : " + accountHolderDetails.getFullName());
		 * System.out.println("contact number : " +
		 * accountHolderDetails.getContactNumber()); System.out.println("pan number : "
		 * + accountHolderDetails.getPanNumber()); System.out.println("aadhar number : "
		 * + accountHolderDetails.getAdharNumber()); System.out.println("email id : " +
		 * accountHolderDetails.getEmailId());
		 * 
		 * System.out.println("Account holder address details ::::");
		 * System.out.println("door number : " + accountHolderDetails.getDoorNumber());
		 * System.out.println("flat number : " + accountHolderDetails.getFlatNumber());
		 * System.out.println("street Name : " + accountHolderDetails.getStreetName());
		 * System.out.println("distict : " + accountHolderDetails.getDistrict());
		 * System.out.println("state : " + accountHolderDetails.getState());
		 * System.out.println("pincode : " + accountHolderDetails.getPincode());
		 * 
		 * }
		 */
		private void displayLoanDetails(LoanDetails loanDetails) {
		System.out.println("loan holder address details ::::");
		System.out.println("door number : " + loanDetails.getDoorNumber());
		System.out.println("flat number : " + loanDetails.getFlatNumber());
		System.out.println("street Name : " + loanDetails.getStreetName());
		System.out.println("distict : " + loanDetails.getDistrict());
		System.out.println("state : " + loanDetails.getState());
		System.out.println("pincode : " + loanDetails.getPincode());

		}

		}
