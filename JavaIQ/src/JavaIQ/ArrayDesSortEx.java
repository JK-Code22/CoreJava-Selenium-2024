package JavaIQ;

public class ArrayDesSortEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int a[] = { 3, 5, 4, 2, 7, 6 };

		int temp;
		for (int i = 0; i < 6; i++) {
			for (int j = i + 1; j < 6; j++) {
				if (a[i] < a[j]) 
				{
					temp = a[i];
					a[i] = a[j];
					a[j] = temp;
				}
			}
		}
		for (int i = 0; i < 6; i++) {
			System.out.println(a[i]);
		}

	}

}
