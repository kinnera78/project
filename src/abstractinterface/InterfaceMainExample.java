/**
 * 
 */
package abstractinterface;

/**
 * @author hp
 *
 */
public class InterfaceMainExample implements InterfaceExample,InterfaceAddress{

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		InterfaceMainExample interfaceMainExample = new InterfaceMainExample();
		interfaceMainExample.displayDetais();
		LoginDetails loginDetails = interfaceMainExample.setLoginDetails();
		interfaceMainExample.loginDetais(loginDetails);
		interfaceMainExample.address();

		}
		private LoginDetails setLoginDetails() {
		LoginDetails loginDetails = new LoginDetails();
		loginDetails.setUserName("montreetechpvtltd");
		loginDetails.setPassword("qwshbdgdjod");
		return loginDetails;
		}
		@Override
		public void displayDetais() {
		System.out.println("comapny registed in year : 2016");
		System.out.println("comapny registed in place : Hyderabad");
		System.out.println("comapny main brach in  : Nellore");
		String fullName = InterfaceExample.name;
		System.out.println("Name : " + fullName);
		String name = InterfaceAddress.name;
		System.out.println("Name : " + name);
		}

		@Override
		public void loginDetais(LoginDetails loginDetails) {

		System.out.println("user name : " + loginDetails.getUserName());
		System.out.println("password : " + loginDetails.getPassword() );

		}
		@Override
		public void address() {
		System.out.println("Company address in : 1-99,nellore,524003");

		}

	}


