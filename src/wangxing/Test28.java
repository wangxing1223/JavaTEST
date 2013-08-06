package wangxing;

import java.util.Scanner;

/**
 * Created by Administrator on 13-8-6.
 */

//对10个数进行排序


public class Test28 {

    public static void main(String[] args) {

        double temp;
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入10个数：");
        double[] number = new double[10];
        for (int i = 0; i < number.length; i++) {
            number[i] = scanner.nextDouble();
        }
        for (int i = 0; i < number.length; i++) {
            for (int j = i+1; j < number.length; j++) {
                if (number[i] > number[j]){
                    temp = number[j];
                    number[j] = number[i];
                    number[i] = temp;
                }
            }

        }
        for (int i = 0; i < number.length; i++) {
            System.out.print(number[i] + "  ");


        }
    }
}
