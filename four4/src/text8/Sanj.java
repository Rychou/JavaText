package text8;

import java.util.Scanner;

/**
 * Created by Administrator on 2017/5/31.
 */
public class Sanj {
    private int x;
    private int y;
    private int z;
    public Sanj(int x,int y,int z){
        this.x = x;
        this.y = y;
        this.z = z;
    }
    double getArea() throws NotSanjiaoException{
        double p = (x + y +z)/2; //三角形半周长
        if (!((x+y)>z)&&((y+z)>x)&&((z+x)>y))
            throw new NotSanjiaoException("a,b,c不能构成三角形");
        else return Math.sqrt(p*(p-x)*(p-y)*(p-z));
    }
    public void showInfo() throws NotSanjiaoException{
        if (!((x+y)>z)&&((y+z)>x)&&((z+x)>y))
            throw new NotSanjiaoException("a,b,c不能构成三角形");
        else System.out.println("x: "+x+" y:"+y+" z:"+z);
    }
    public static void main (String[] args){
        Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        int y = in.nextInt();
        int z = in.nextInt();
        try{
            Sanj sj = new Sanj(x,y,z);
            System.out.println(sj.getArea()) ;
            sj.showInfo();
        }
        catch (NotSanjiaoException e){
            e.printStackTrace();
        }
    }
}
