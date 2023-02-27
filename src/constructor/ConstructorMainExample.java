/**
 * 
 */
package constructor;

/**
 * @author hp
 *
 */
public class ConstructorMainExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//ConstructorExample constructorExample = new ConstructorExample();
		//ConstructorExample constructorExample = new ConstructorExample("kiran ","reddy");
		ConstructorExample constructorExample = new ConstructorExample("kinnu ","chary","m",27,'f',95736);
		//constructorExample.setGender('m');
		constructorExample.setContactNumber(9849760);
		ConstructorMainExample constructorMainExample = new ConstructorMainExample();
		constructorMainExample.displayDetails(constructorExample);

		}
		private void displayDetails(ConstructorExample constructorExample) {
		System.out.println("first name : "+constructorExample.getFirstName());
		System.out.println("last name : "+constructorExample.getLastName());
		System.out.println("middle name : "+constructorExample.getMiddleName());
		System.out.println("age  : "+constructorExample.getAge());
		System.out.println("gender  : "+constructorExample.getGender());
		System.out.println("contact number  : "+constructorExample.getContactNumber());

		}

	}


