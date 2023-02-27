/**
 * 
 */
package string;

/**
 * @author hp
 *
 */
public class StringBufferExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullName = "kiran reddy";
		String surname = " M";

		StringBuffer stringBuffer = new StringBuffer("nellore ");
	stringBuffer.append(fullName).append(surname);
	System.out.println(stringBuffer);
		System.out.println(stringBuffer.reverse());

	}

}
