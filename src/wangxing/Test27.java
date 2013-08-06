package wangxing;

/**
 * Created by Administrator on 13-8-6.
 */

//求100之内的素数
public class Test27 {

    public static void main(String[] args) {
        boolean b = false;
        System.out.print(2 + "\t");
        System.out.print(3 + "\t");
        for (int i = 4; i <100 ; i++) {
            for (int j = 2; j <= i/2; j++) {
                if(i%j == 0){
                    b = false;
                    break;
                }else {
                    b = true;
                }

            }
            if (b == true){
            System.out.print( i + "\t");

            }
        }

    }
}
