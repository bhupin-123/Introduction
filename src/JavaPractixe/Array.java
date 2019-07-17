package JavaPractixe;

public class Array {

	public static void main(String[] args) {
		int a[][] = { { 2, 5, 1 }, { 6, 0, 4 }, { 4, 5, 6 }, { 4, 6, 5 } };

		int minvalue = a[0][0];
		int mincolumn = 0;
		int maxvalue;
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[0].length; j++) {

				if (minvalue > a[i][j]) {
					minvalue = a[i][j];
					mincolumn = j;
				}

			}

		}
		System.out.println(mincolumn);

		maxvalue = a[k][mincolumn];
		for (k = 0; k < a.length; k++) {

			if (maxvalue < a[k][mincolumn]) {
				maxvalue = a[k][mincolumn];

			}
		}
		System.out.println(maxvalue);

	}

}
