package Review;

//3、两个矩阵相乘，A={{7,8,9},{3,6,5}}; B={{3,5,2,1},{8,9,3,-5},{7,3,-4,-1}}，计算其相乘后的结果。
public class Third {
    public static void main(String[] args){
        int[][] A = {{7,8,9},{3,6,5}};
        int[][] B = {{3,5,2,1},{8,9,3,-5},{7,3,-4,-1}};
        int m = A.length; // 数组A的行数
        int n = B[0].length; //数组B的列数
        int l = A[0].length; // 用于表示A的列数或B的行数 也可以写成 l = B.length
        int[][] C = new int[m][n];
        for (int i=0;i<m;i++){
            for (int j=0;j<n;j++){
                int temp = 0;
                for (int k=0;k<l;k++){
                    temp+=A[i][k]*B[k][j];
                }
                C[i][j] = temp;
            }
        }
        //输出数组C
        for (int i=0;i<2;i++){
            for (int j=0;j<4;j++){
                System.out.print(C[i][j]+" ");
                if (j==3)
                    System.out.println();
            }
        }
    }
}
