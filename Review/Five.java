package Review;

/*
 构造一个坐标点类point，包含横坐标x和纵坐标y两个属性和以下函数：
 1）不带参数的构造函数，默认坐标点（0，0）
 2）包含横坐标和纵坐标两个参数 的构造函数
 3）获取坐标点的函数getPoint(),返回”(x,y)”格式的字符串
 编写测试代码分别对这三个函数进行测试
 */
class point{
    int x;
    int y;
    public point(){
        this.x = 0;
        this.y = 0;
    }
    public point(int x,int y){
        this.x = x;
        this.y = y;
    }
    public String getPoint(){
        return "("+x+","+y+")";
    }
}
public class Five {
    public static void main(String[] args){
        point p1 = new point();
        point p2 = new point(1,2);
        System.out.println(p1.getPoint());
        System.out.println(p2.getPoint());
    }
}
