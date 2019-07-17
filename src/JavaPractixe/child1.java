package JavaPractixe;


public class child1 extends Parent1 {
	String name = "navneet";

	public child1() {
		//super();
		System.out.println("child class constructor");
	}

	public void getname() {
		System.out.println(name);
		System.out.println(super.name);
	}

	public void getdata() {
		super.getdata();
		System.out.println("i am child method");
	}

	public static void main(String[] args) {
		child1 c = new child1() ;
		c.getname();
		c.getdata();

	}

}
