public class IsocelesTriangle {
	public static void main(String[] args) {
		int n = 1;
		int m = 5;
		while (m > 0) {
			for (int j = m; j > 0; j--) {
				System.out.print(" ");
			}

			for (int i = 1; i <= n; i++) {
				System.out.print("*");
			}
			System.out.println();
			n += 2;
			m--;
		}

	}
}
