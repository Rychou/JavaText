package Review;

//总计800元的工资分成100元，50元，10元三种面值的货币发放，其中至少有5张百元票，编程输出各种组合方案。

public class Four {
    public static void main(String[] args){
        int i,j,k;
        int count=0;
        for (i=5;i<=8;i++){
            for (j=0;j<=6;j++){
                for (k=0;k<=30;k++){
                    if ((i*100+j*50+k*10)==800){
                        count++;
                        System.out.println(count+":"+"100yuan:"+i+" 50yuan:"+j+" 10yuan:"+k);
                    }
                }
            }
        }
    }
}
