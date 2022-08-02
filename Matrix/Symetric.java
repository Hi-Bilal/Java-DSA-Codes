package Matrix;

import java.util.Scanner;

public class Symetric {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        int m = scan.nextInt();
        int n = scan.nextInt();
        
        int a[][] = new int[m][n];
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                a[i][j] = scan.nextInt();
            }
        }
        
        boolean sym = true;
        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                if (a[i][j] != a[j][i]) {
                    sym = false;
                }
            }
        }
        System.out.println(sym);

	}

}
