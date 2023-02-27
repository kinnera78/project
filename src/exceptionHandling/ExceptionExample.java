/**
 * 
 */
package exceptionHandling;

/**
 * @author hp
 *
 */
public class ExceptionExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b = 0;

		int d = a + b;
//System.out.println("the value of d is "+d);
		try {
			System.out.println("the value of d is " + d);
			float c = a / b;

			System.out.println("the value of c is " + c);

		} catch (Exception exception) {
			System.out.println("I have exception in my program " + exception.getMessage());
			exception.printStackTrace();
		} finally {
			System.out.println("I am in Exception example");
		}
	}

}
