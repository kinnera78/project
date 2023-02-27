/**
 * 
 */
package exceptionHandling;
//import basic.controlStatements.ArthameticExample;
/**
 * @author hp
 *
 */
public class ExceptionClassThrow {
	

		/**
		* @param args
		* @throws CustomExceptionmessage 
		*/
		public static void main(String[] args) throws CustomExceptionMessage {
		/*
		* 1. we can handle exception by using 1 throw , 2 throws 2. we can handle
		* exception by using try, catch, finally 3. if we write try block mandatory
		* catch or finally or both 4. order is try followed by catch followed by
		* finally 5. one try block have multple catch blocks 6.nested try can possible
		* 7. we can write try in methods, any blocks
		*/
		CustomExceptionMessage customExceptionmessage = new CustomExceptionMessage();
		ExceptionCodeValue exceptionCodeValue = new ExceptionCodeValue();
		int principal = 1000;
		int rateOfInterest = 2;
		int timePeriod = 10;
		int[] names = new int[2];
		names[0] = 10;
		names[1] = 20;
		String name = "kiran reddy";
		ExceptionModel exceptionModel = new ExceptionModel("kiran reddy", "male");
		//ExceptionModel exceptionModel = null;
		try {
		int interestAmount = (principal * rateOfInterest * timePeriod) / 100;
		System.out.println("interestAmount :" + interestAmount);

		int totalAmount = principal + interestAmount;
		System.out.println("totalAmount : " + totalAmount);

		System.out.println("int value of name is :" + Integer.parseInt(name));
		System.out.println("name : " + exceptionModel.getName());
		System.out.println("gender : " + exceptionModel.getGender());

		for (int i = 0; i < names.length; i++) {
		System.out.println("i : " + i + " names.length : " + names.length);
		System.out.println("names :[" + i + "] :" + names[i]);
		}

		int calucation = (principal * rateOfInterest) / timePeriod;
		System.out.println("calucation : " + calucation);
		} catch (ArithmeticException arithmeticException) {
		throw new CustomExceptionMessage(exceptionCodeValue.arithmeticExceptionCode,exceptionCodeValue.arithmeticExceptionMessage);
		} catch (NullPointerException nullPointerException) {
		throw new CustomExceptionMessage(exceptionCodeValue.nullPointerExceptionCode,exceptionCodeValue.nullPointerExceptionMessage);
		} catch (NumberFormatException numberFormatException) {
		throw new CustomExceptionMessage(exceptionCodeValue.numberFormatExceptionCode,exceptionCodeValue.numberFormatExceptionMessage);
		} catch (ArrayIndexOutOfBoundsException arrayIndexOutOfBoundsException) {
		throw new CustomExceptionMessage(exceptionCodeValue.arrayIndexOutOfBoundsExceptionCode,exceptionCodeValue.arrayIndexOutOfBoundsExceptionMessage);
		} catch (Exception exception) {
		throw new CustomExceptionMessage(exceptionCodeValue.exceptionCode,exceptionCodeValue.exceptionMessage);
		} finally {
		System.out.println("we are in finally");
		}
		}
}

