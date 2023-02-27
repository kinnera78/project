/**
 * 
 */
package constructor;

/**
 * @author hp
 *
 */
public class ConstructorPracticeMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ConstructorPractice cons = new ConstructorPractice("kinnera", "atkin", 27, 9573641513l, "Hyderabad");
		ConstructorPracticeMain PracticeMain = new ConstructorPracticeMain();

		PracticeMain.display(cons);
	}

	private void display(ConstructorPractice cons) {
		System.out.println("employe name  " + cons.getEmployeName());
		System.out.println("employe ID " + cons.getEmployeID());
		System.out.println("employe Age " + cons.getEmployeAge());
		System.out.println("employe contact details " + cons.getContactDetails());
		System.out.println("employe office address " + cons.getOfficeAddress());

	}

}
