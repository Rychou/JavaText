package Text;

public class Counter {
	private int count;
	private int maxValue;
	public Counter(int count,int maxValue){
		this.count = count;
		this.maxValue = maxValue;
	}
	public void increment(){
		count += 1;
		if(count > maxValue)
			System.out.println("error");
	}
	public void decrement(){
		count -= 1;
		if(count < 0 )
			System.out.println("error");
	}
	public void setCount(int count){
		this.count = count;
		if(count > maxValue)
			System.out.println("error");
	}
	public void setMaxValue(int maxValue){
		if(maxValue <= Integer.MAX_VALUE)
			this.maxValue = maxValue;
	}
	public int getCount(){
		return count;
	}
	public int maxValue(){
		return maxValue;
	}
}
