/**
 * 
 */
package abstractinterface;

/**
 * @author hp
 *
 */
public abstract class AbstractExample{
	public abstract void displayDetails();
	  public void loginDetails(LoginDetails loginDetails)
	  {
	  System.out.println("user name : " + loginDetails.getUserName());
	  System.out.println("password : " + loginDetails.getPassword() ); 
	  }
	  	
	}
	

