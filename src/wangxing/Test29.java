package wangxing;

/**
 * Created by Administrator on 13-8-6.
 */

//求一个3*3矩阵对角线元素之和


public class Test29 {


    public static void main(String[] args) {
        int [][] ints = {{0,5,9},{3,3,7},{4,8,6}};
        int sum = 0;
        for (int i = 0; i < ints.length; i++) {
            for (int j = 0; j < ints[i].length; j++) {
                if((i != 1)&&(j != 1)){
                  sum +=ints[i][j];
                }
                if ((i == 1)&&(j == 1)){
                    sum +=ints[i][j];
                }

            }

        }
        System.out.println("对角线元素和是：" +  sum);

    }



}
