package JavaPractixe;

public class Thiskeyword {
	int a=3;
	
	public void getdata() {
		int a=2;
		System.out.println(a);
		System.out.println(this.a);
	}

	public static void main(String[] args) {
		Thiskeyword tk=new Thiskeyword();
		tk.getdata();

	}

}
