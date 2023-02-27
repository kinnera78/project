/**
 * 
 */
package abstractinterface;

/**
 * @author hp
 *
 */
public class AbstractExampleMain extends AbstractExample {

	public static void main(String[] args)
	{
		AbstractExampleMain abstractExampleMain = new AbstractExampleMain();
		LoginDetails loginDetails = abstractExampleMain.setLoginDetails();
		abstractExampleMain.loginDetails(loginDetails);
		abstractExampleMain.displayDetails();
	}

	private LoginDetails setLoginDetails()
	{
		LoginDetails loginDetails = new LoginDetails();
		loginDetails.setUserName("kinnu");
		loginDetails.setPassword("urgreat");
		return loginDetails;
	}

	public void displayDetails() {
		System.out.println("company registed in year : 2017");
		System.out.println("company registed in place : Hyderabad");
		System.out.println("company main branch in  : chennai");

	}

	@Override
	public void loginDetails(LoginDetails loginDetails) {
		System.out.println("main user name : " + loginDetails.getUserName());
		System.out.println("main password : " + loginDetails.getPassword());
	}

	}


