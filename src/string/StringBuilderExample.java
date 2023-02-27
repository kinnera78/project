/**
 * 
 */
package string;

/**
 * @author hp
 *
 */
public class StringBuilderExample {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String fullName = "kiran reddy";
		String surname = " M";

		StringBuilder stringBuilder = new StringBuilder("nellore ");
		stringBuilder.append(fullName).append(surname);
		System.out.println(stringBuilder);
		System.out.println(stringBuilder.reverse());	}

}
