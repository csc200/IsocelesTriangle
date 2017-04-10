
public class Diamond {

	public static void main(String[] args) {
		int n=5;
		int m=0;
		int o = 1;
		int p = 2;
		while (p > 0) {
			for (int j = p; j > 0; j--) {
				System.out.print(" ");
			}

			for (int i = 1; i <= o; i++) {
				System.out.print("*");
			}
			System.out.println();
			o += 2;
			p--;
		}
		while(n>0) {
			for(int i=0; i<m; i++) {
				System.out.print(' ');
			}
			for(int i=n; i>0; i--) {
				System.out.print('*');
			}
			System.out.println();
			n-=2;
			m++;
		}

	}

}
