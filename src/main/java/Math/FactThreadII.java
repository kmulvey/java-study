package Math;

public class FactThreadII {
	int facts;
	public FactThreadII(int f) {
		this.facts = f;
	}
	
	public void reduce(){
		int remain = facts % 2;
		for(int i=1; i<=facts - 1; i+=2){
			int next = i+1;
			System.out.println(i + " x " + next);
		}
		if(remain == 1){
			System.out.println("x " + facts);
		}
	}
}
