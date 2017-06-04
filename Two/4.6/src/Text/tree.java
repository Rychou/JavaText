package Text;

public class tree {
	private int ages;
	public tree(int ages){
		this.ages = ages;
	}
	public void grow(int years){
		ages = ages+ years;
	}
	public int age(){
		return ages;
	}
}
