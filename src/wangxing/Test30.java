package wangxing;

import java.util.Scanner;

/**
 * Created by Administrator on 13-8-6.
 */

//有一个已经排好序的数组。现输入一个数，要求按原来的规律将它插入数组中


public class Test30 {

    private static int[] ints = new int[10];


    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入一组数据 ：");
        for (int i = 0; i < 5; i++) {
            ints[i] = scanner.nextInt();
        }
        System.out.println("请输入一个数：");
        int n = scanner.nextInt();
        int m = 0;
        for (int i = 0; i < 5; i++) {
            if (ints[i] > n ){
                m = i;
                break;
            }
        }
        for (int i = 5 - 1; i >= m ; i--) {
            ints[i+1] = ints[i];
        }
        ints[m] = n;
        for (int i = 0; i < ints.length; i++) {
            System.out.print(ints[i] + "\t");

        }
    }
}
