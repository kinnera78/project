/**
 * 
 */
package polymorphism;

/**
 * @author hp
 *
 */
public class OverLoadingExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverLoadingExample overLoadingExample = new OverLoadingExample();
		overLoadingExample.displayDetails();
		overLoadingExample.displayDetails("kiran reddy");
		overLoadingExample.displayDetails(5.3f, 4.2f);
		overLoadingExample.displayDetails(4.3f, 5);
		overLoadingExample.displayDetails(6, 3.2f);
		overLoadingExample.displayDetails(2, 5);
		}

		private void displayDetails() {
		System.out.println("no parameter/arguments method");
		}

		private void displayDetails(String name) {
		System.out.println("one parameter/arguments method " + name);
		}

		private void displayDetails(int firstNumber, int secondNumber) {
		int total = firstNumber + secondNumber;
		System.out.println("two parameter/arguments method  int, int : " + total);
		}

		private void displayDetails(int firstNumber, float secondNumber) {
		float total = firstNumber + secondNumber;
		System.out.println("two parameter/arguments method int, float : " + total);
		}

		private void displayDetails(float firstNumber, int secondNumber) {
		float total = firstNumber + secondNumber;
		System.out.println("two parameter/arguments method float,int : " + total);
		}

		private void displayDetails(float firstNumber, float secondNumber) {
		float total = firstNumber + secondNumber;
		System.out.println("two parameter/arguments method float,float : " + total);
		}

		}

