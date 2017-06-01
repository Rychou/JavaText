package text2;

import java.util.Arrays;
import java.util.Comparator;
import java.util.TreeSet;
import java.util.Set;

public class text2 {
	 
	public static void main(String[] args) {
		
		  String[] str = {"abc","de","gong","De","abc","Foo","gong"};  
	      Set<String> set1 = new TreeSet<String>(new Comparator<String>(){
	    	  @Override
	    	    public int compare(String o1, String o2) {
	    	        return o1.compareToIgnoreCase(o2);
	    	    }});
	      set1.addAll(Arrays.asList(str));
	      System.out.println(set1);  
	      }
	     
	}
	

