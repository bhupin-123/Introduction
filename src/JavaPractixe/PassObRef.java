package JavaPractixe;

class Test {
	int a, b;

	Test(int i, int j) {
		a = i;
		b = j;
	}


	void change(Test myobj) {
		myobj.a = myobj.a + myobj.b;
		myobj.b = -myobj.b;
		
	}
}

class PassObRef {
	public static void main(String args[]) {
		Test ob = new Test(15, 20);
		System.out.println("ob.a and ob.b before call: " + ob.a + " " + ob.b);
		ob.change(ob);
		System.out.println("ob.a and ob.b after call: " + ob.a + " " + ob.b);
	}
}