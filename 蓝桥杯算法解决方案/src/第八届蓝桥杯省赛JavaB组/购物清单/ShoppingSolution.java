package 购物清单; /**
 * FileName: 购物清单.ShoppingSolution
 * Author:   瑾墨
 * Date:     2019/1/3 23:49
 * Description: 第一题：购物清单
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */

/**
 * 功能：〈第一题：购物清单〉
 *
 * @author 瑾墨
 * @create 2019/1/3
 */
public class ShoppingSolution {
    public void Solution1() {
        /**商品价格*/
        double privecs[] = new double[]{
                180.90, 10.25, 56.14, 104.65, 100.30, 297.15, 26.75, 130.62, 240.28, 270.62, 115.87, 247.34
                , 73.21, 101.00, 79.54, 278.44, 199.26, 12.97, 166.30
                , 125.50, 84.98, 113.35, 166.57, 42.56, 81.9, 131.78, 255.89, 109.17, 146.69, 139.33, 141.16
                , 154.74, 59.42, 85.44, 293.70, 261.79, 11.30, 268.27
                , 128.29, 251.03, 208.39, 128.88, 62.06, 225.87, 12.89, 34.28, 62.16, 129.12, 218.37, 289.69
        };
        /**商品折扣*/
        double a[] = new double[]{
                88, 65, 90, 90, 88, 50, 65, 50, 58, 80, 88, 95,
                90, 50, 50, 70, 50, 90, 78, 58, 90, 68, 50, 90,
                95, 80, 78, 90, 68, 65, 78, 80, 80, 68, 88, 65,
                88, 58, 88, 80, 75, 75, 90, 75, 75, 75, 58, 50,
                50, 80
        };
        /*总价*/
        double sum = 0;
        /*二重for循环,对应找到价钱以及对应的折扣*/
        for (int i = 0; i < privecs.length; i++) {
            for (int j = 0; j < a.length; j++) {
                sum = (privecs[i] * a[j] + sum);
                i++;
            }
        }
        System.out.println(sum / 100);
    }
    public static void main(String[] args) {
        ShoppingSolution shoppingSolution = new ShoppingSolution();
        shoppingSolution.Solution1();
    }

}