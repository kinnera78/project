/**
 * 
 */
package exceptionHandling;

/**
 * @author hp
 *
 */
public class ExceptionClassThrows {
	public static void main(String[] args) throws ArithmeticException, NullPointerException, NumberFormatException,
	ArrayIndexOutOfBoundsException, Exception {
	/*
	* 1. we can handle exception by using 1 throw , 2 throws 2. we can handle
	* exception by using try, catch, finally 3. if we write try block mandatory
	* catch or finally or both 4. order is try followed by catch followed by
	* finally 5. one try block have multple catch blocks 6.nested try can possible
	*/
	int principal = 1000;
	int rateOfInterest = 2;
	int timePeriod = 10;
	int[] names = new int[2];
	names[0] = 10;
	names[1] = 20;
	String name = "kiran reddy";
	// ExceptionModel exceptionModel = new ExceptionModel("kiran reddy", "male");
	ExceptionModel exceptionModel = null;

	System.out.println("int value of name is :" + Integer.parseInt(name));
	System.out.println("name : " + exceptionModel.getName());
	System.out.println("gender : " + exceptionModel.getGender());

	for (int i = 0; i < names.length; i++) {
	System.out.println("i : " + i + " names.length : " + names.length);
	System.out.println("names :[" + i + "] :" + names[i]);
	}

	int calucation = (principal * rateOfInterest) / timePeriod;
	System.out.println("calucation : " + calucation);

	int interestAmount = (principal * rateOfInterest * timePeriod) / 100;
	System.out.println("interestAmount :" + interestAmount);

	int totalAmount = principal + interestAmount;
	System.out.println("totalAmount : " + totalAmount);

	}

	}

