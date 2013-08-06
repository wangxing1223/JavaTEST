package wangxing;

import java.util.*;

/**
 * Created by Administrator on 13-8-6.
 */

//请输入星期几的第一个字母来判断一下是星期几，如果第一个字母一样，则继续 判断第二个字母。
public class Test26 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("请输入星期的第一个大写字母：");
        char[] ch = scanner.next().toCharArray();
        switch(ch[0]) {
            case 'M':
                System.out.println("Monday");
                break;
            case 'W':
                System.out.println("Wednesday");
                break;
            case 'F':
                System.out.println("Friday");
                break;
            case 'T': {
                System.out.println("请输入星期的第二个字母：");
                char[] ch1 = scanner.next().toCharArray();
                if(ch1[0] == 'U') {System.out.println("Tuesday"); }
                else if(ch[0] == 'H') {System.out.println("Thursday"); }
                else {System.out.println("无此写法！");
                }
            };
            break;
            case 'S': {
                System.out.println("请输入星期的第二个字母：");
                char[] ch1 = scanner.next().toCharArray();
                if(ch1[0] == 'U') {System.out.println("Sunday"); }
                else if(ch1[0] == 'A') {System.out.println("Saturday"); }
                else {System.out.println("无此写法！");
                }
            };
            break;
            default:System.out.println("无此写法！");
        }
    }

}
