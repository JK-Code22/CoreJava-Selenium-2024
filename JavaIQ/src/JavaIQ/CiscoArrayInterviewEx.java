package JavaIQ;

public class CiscoArrayInterviewEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int abc[][] = { { 1, 2, 3 }, { 5, 9, 6 }, { 7, 0, 2 } };

		int min = abc[0][0];
		int minColumn = 0;

		for (int i = 0; i < 3; i++) {
			for (int j = 0; j < 3; j++) {
				if (abc[i][j] < min) {
					min = abc[i][j];
					minColumn = j;

				}
			}

		}
		int max = abc[0][0];
		int k = 0;
		while (k < 3) {
			if (abc[k][minColumn] > max) {
				max = abc[k][minColumn];
			}
			k++;
		}
		System.out.println(max);
	}

}
