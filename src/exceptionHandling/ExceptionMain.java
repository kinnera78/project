/**
 * 
 */
package exceptionHandling;

/**
 * @author hp
 *
 */
public class ExceptionMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
			/*
			* 1. we can handle exception by using 1 throw , 2 throws 2. we can handle
			* exception by using try, catch, finally 3. if we write try block mandatory
			* catch or finally or both 4. order is try followed by catch followed by
			* finally
			*/
			//ExceptionModel exceptionModel = new ExceptionModel("kiran reddy","male");
			ExceptionModel exceptionModel = null;
			try {
			System.out.println("name : " + exceptionModel.getName());
			System.out.println("gender : " + exceptionModel.getGender());

			} catch (Exception exception) {
			System.out.println("exeption message is : " + exception.getMessage());
			exception.printStackTrace();
			}finally {
			System.out.println("we have exception in array retrival.");
			}
			int principal = 1000;
			int rateOfInterest = 2;
			int timePeriod = 0;
			int[] names = new int[2];
			names[0] = 10;
			names[1] = 20;
			/*
			* System.out.println(names[0]); System.out.println(names[1]);
			* System.out.println(names[2]);
			*/
			try {
			for (int i = 0; i <= names.length; i++) {
			System.out.println("i : " + i + " names.length : " + names.length);
			System.out.println("names :["+ i +"] :" + names[i]);
			}
			} catch (Exception exception) {
			System.out.println("exeption message is : " + exception.getMessage());
			exception.printStackTrace();
			}
			try {
			int calucation = (principal * rateOfInterest) / timePeriod;
			System.out.println("calucation : " + calucation);
			} catch (Exception exception) {
			System.out.println("exeption message is : " + exception.getMessage());
			exception.printStackTrace();
			}
			int interestAmount = (principal * rateOfInterest * timePeriod) / 100;
			System.out.println("interestAmount :" + interestAmount);

			int totalAmount = principal + interestAmount;
			System.out.println("totalAmount : " + totalAmount);

			}

	}


