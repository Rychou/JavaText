package text1;

import java.util.Iterator;
import java.util.LinkedList;

public class Main {
	public static void main(String[] args) {
		  DuiLie  dl = new DuiLie();
		    dl.myAdd("java01");
		    dl.myAdd("java02");
		    dl.myAdd("java03");
		    dl.myAdd("java04");	

		    System.out.println("输出队列数据：");
		    while(!dl.isNull())
		    {
		        System.out.println(dl.myGet());
		    }
		    Duizhan dz = new Duizhan();
		    dz.myAdd("java01");
		    dz.myAdd("java02");
		    dz.myAdd("java03");
		    dz.myAdd("java04");	

		    System.out.println("输出堆栈数据：");
		    while(!dz.isNull())
		    {
		        System.out.println(dz.myGet());
		    }


	}

}

class DuiLie {
	private LinkedList link;
	public DuiLie(){
		link = new LinkedList();
	}
	public void myAdd(Object o){
		link.offerLast(o); //向列表末尾插入对象
	}
	public Object myGet(){
		return link.pollFirst(); //获取列表首元素
	}
	public boolean isNull(){
		return link.isEmpty();
	}
}
class Duizhan {
	private LinkedList link;
	public Duizhan(){
		link = new LinkedList();
	}
	public void myAdd(Object o){
		link.offerFirst(o); // 向列表开头插入对象
	}
	public Object myGet(){
		return link.pollFirst();
	}
	public boolean isNull(){
		return link.isEmpty();
	}
}