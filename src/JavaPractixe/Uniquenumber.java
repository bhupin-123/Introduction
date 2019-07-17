package JavaPractixe;

import java.util.ArrayList;

public class Uniquenumber {

	public static void main(String[] args) {
		int a[] = { 4, 5, 6, 9, 4, 5, 6, 5, 6 };
		ArrayList<Integer> al = new ArrayList<Integer>();

		for (int i = 0; i < a.length; i++) {
			int z = 0;
			if (!al.contains(a[i])) {
				al.add(a[i]);

				for (int k = 0; k < a.length; k++) {
					if (a[k] == a[i]) {
						z++;
					}

				}
				if (z == 1) {
					System.out.println(a[i] + " is unique");
					// System.out.println(z);
				}
			}

		}

	}

}
