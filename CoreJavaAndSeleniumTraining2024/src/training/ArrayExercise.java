package training;

public class ArrayExercise {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// single dimension
		int a[] = new int[5];
		a[0] = 100;
		a[1] = 200;
		a[2] = 300;
		a[3] = 400;
		a[4] = 500;

		int b[] = { 600, 700, 800, 900, 1000 };

		for (int value : a) {
			System.out.println(value);
		}

		// 2D
		int c[][] = new int[2][2];
		c[0][0] = 10;
		c[0][1] = 20;
		c[1][0] = 30;
		c[1][1] = 40;

		int d[][] = { { 60, 70 }, { 80, 90 }, { 100, 110 }, { 120, 130 } };

		// find length of 2d array
		System.out.println(d.length);
		System.out.println(d[3].length);

		for (int arr[] : d) {
			for (int x : arr) {
				System.out.println(x);
			}
		}

	}

}
