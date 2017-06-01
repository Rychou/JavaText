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

		    System.out.println("����������ݣ�");
		    while(!dl.isNull())
		    {
		        System.out.println(dl.myGet());
		    }
		    Duizhan dz = new Duizhan();
		    dz.myAdd("java01");
		    dz.myAdd("java02");
		    dz.myAdd("java03");
		    dz.myAdd("java04");	

		    System.out.println("�����ջ���ݣ�");
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
		link.offerLast(o); //���б�ĩβ�������
	}
	public Object myGet(){
		return link.pollFirst(); //��ȡ�б���Ԫ��
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
		link.offerFirst(o); // ���б�ͷ�������
	}
	public Object myGet(){
		return link.pollFirst();
	}
	public boolean isNull(){
		return link.isEmpty();
	}
}