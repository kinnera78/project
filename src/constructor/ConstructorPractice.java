/**
 * 
 */
package constructor;

/**
 * @author hp
 *
 */
public class ConstructorPractice {
private String EmployeName;
/**
 * @return the employeName
 */
public String getEmployeName() {
	return EmployeName;
}
/**
 * @param employeName the employeName to set
 */
public void setEmployeName(String employeName) {
	EmployeName = employeName;
}
/**
 * @return the employeID
 */
public String getEmployeID() {
	return EmployeID;
}
/**
 * @param employeID the employeID to set
 */
public void setEmployeID(String employeID) {
	EmployeID = employeID;
}
/**
 * @return the employeAge
 */
public int getEmployeAge() {
	return EmployeAge;
}
/**
 * @param employeAge the employeAge to set
 */
public void setEmployeAge(int employeAge) {
	EmployeAge = employeAge;
}
/**
 * @return the contactDetails
 */
public long getContactDetails() {
	return ContactDetails;
}
/**
 * @param contactDetails the contactDetails to set
 */
public void setContactDetails(long contactDetails) {
	ContactDetails = contactDetails;
}
/**
 * @return the officeAddress
 */
public String getOfficeAddress() {
	return officeAddress;
}
/**
 * @param officeAddress the officeAddress to set
 */
public void setOfficeAddress(String officeAddress) {
	this.officeAddress = officeAddress;
}
private String EmployeID;
private int EmployeAge;
private long ContactDetails;
private String officeAddress;

public ConstructorPractice()
{
	
}
public ConstructorPractice(String EmployeName, String EmployeID, int EmployeAge,long ContactDetails,String officeAddress)
{
	this.EmployeName = EmployeName;
	this.EmployeID = EmployeID;
	this.EmployeAge = EmployeAge;
	this.ContactDetails = ContactDetails;
	this.officeAddress = officeAddress;
	
}
}

