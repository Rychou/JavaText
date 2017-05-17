package text5;

import java.util.ArrayList;
import java.util.Iterator;
import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;
public class main {
	public static void main(String[] args) {
		worker p1 = new worker(1001,"Tom","Market",1200);
		worker p2 = new worker(1002,"Jack","Department",1300);
		worker p3 = new worker(1003,"Simth","Market",2000);
		worker p4 = new worker(1004,"Tony","Department",3000);
		ArrayList<worker> wk = new ArrayList<worker>();
		wk.add(p1);
		wk.add(p2);
		wk.add(p3);
		wk.add(p4); 
		System.out.println("Jack's salary is "+wk.get(1).salary);
		wk.get(1).changePay(1500);
		System.out.println("Changed salary is "+wk.get(1).salary);
		for(int i=0;i<wk.size();i++){
			if(wk.get(i).salary<2000){
				wk.get(i).changePay(0.2);
			}
			System.out.println(wk.get(i).salary);
		}
		Iterator<worker> it = wk.iterator();
		int sumM=0;
		int sumD = 0;
		for(int i=0;i<wk.size();i++){
			if(wk.get(i).depName == "Market")
				sumM += it.next().salary;
			else 
				sumD += it.next().salary;
		}
		System.out.println("Market's aver sal is "+sumM/2);
		System.out.println("Deparement's aver sal is "+sumD/2);

		wk.remove(wk.get(0));
		
		System.out.println(wk.get(0).name);
	}
		
}

	

