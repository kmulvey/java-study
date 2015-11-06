package Strings;

public class Compare {
	private final int MATCH = 0;
	private final int INSERT = 1;
	private final int DELETE = 2;
	
	public Compare(){};
	
	public int recurseEditDist(String s, String t, int i, int j){
		int k;
		int[] opt = new int[3];
		int lowestCost;
		
		if(i==0) return (j*1);
		if(j==0) return (i*1);
		
		opt[MATCH] = recurseEditDist(s, t, i-1, j-1) + match(s.charAt(i), t.charAt(j));
		opt[INSERT] = recurseEditDist(s, t, i, j-1) + 1;
		opt[DELETE] = recurseEditDist(s, t, i-1, j) + 1;
		
		lowestCost  = opt[MATCH];
		for(k=INSERT; k<=DELETE; k++){
			if(opt[k] < lowestCost) lowestCost = opt[k];
		}
		return lowestCost;
	}
	private int match(char c, char d){
		if(c==d) return 0;
		else return 1;
	}
}
