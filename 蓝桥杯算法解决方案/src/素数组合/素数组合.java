/**
 * @program: 蓝桥杯
 * @description: 0~8排列素数
 * @author: 瑾墨
 * @create: 2018-10-30 23:27
 **/
import java.lang.Math;
public class 素数组合 {
    static int s;
    static int sum;
    //素数判断函数
    public static boolean su(double n){
        double s=Math.sqrt(n);
        for(int i=2;i<=s;i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        //暴力排列组合
        for (int a = 1; a < 8; a++) {
            for (int b = 0; b < 8; b++) {
                for (int c = 0; c < 8; c++) {
                    for (int d = 0; d < 8; d++) {
                        for (int e = 0; e < 8; e++) {
                            for (int f = 0; f < 8; f++) {
                                for (int g = 0; g < 8; g++) {
                                    for (int h = 0; h < 8; h++) {
                                        s = a * 10000000 + b * 1000000 + c * 100000 + d * 10000 + e * 1000 + f * 100 + g * 10 + h;
                                        if ((a != b) && (a != c) && (a != d) & (a != e) && (a != f) && (a != g) && (a != h)
                                                && (b != c) && (b != d) & (b != e) && (b != f) && (b != g) && (b != h)
                                                && (c != d) & (c != e) && (c != f) && (c != g) && (c != h)
                                                && (d != e) && (d != f) && (d != g) && (d != h)
                                                && (e != f) && (e != g) && (e != h)
                                                && (f != g) && (f != h) && (g != h) && su(s)) {
                                            //System.out.println(s);
                                            sum++;
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }

        }
        System.out.println(sum);
    }
}
