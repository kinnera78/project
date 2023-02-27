package polymorphism;

public class OverridingExample {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		OverridingExample overridingExample = new OverridingExample();
		overridingExample.Display();
		}

		private void Display() {
		System.out.println("Display");
		ChildClass childClass = new ChildClass();
		childClass.displayDetails();

		ParentClass parentClass = new ParentClass();
		parentClass.displayDetails();

		ParentClass parentChild = new ChildClass();
		parentChild.displayDetails();

		}
}
