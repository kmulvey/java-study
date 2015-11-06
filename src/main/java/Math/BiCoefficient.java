package Math;

public class BiCoefficient {
	public static long calcBinomialCoeffiecent(int n, int m){
		int i,j;
		long[][] bc = new long[45][45];
		
		// first col
		for(i=0;i<=n;i++) bc[i][0] = 1;
		// Diagonal
		for(j=0;j<=n;j++) bc[j][j] = 1;
		
		for(i=1;i<=n;i++){
			for(j=1; j<i; j++){
				bc[i][j] = bc[i-1][j-1] + bc[i-1][j];
			}
		}
		return bc[n][m];
	}
}
