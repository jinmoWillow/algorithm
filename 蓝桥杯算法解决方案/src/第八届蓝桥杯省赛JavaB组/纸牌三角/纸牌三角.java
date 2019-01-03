/**
 * FileName: 纸牌三角
 * Author:   瑾墨
 * Date:     2019/1/4 0:07
 * Description:  标题：纸牌三角形  A,2,3,4,5,6,7,8,9 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。 下图就是一种排法（如有对齐问题，参看p1.png）。        A      9 6     4   8    3 7 5 2  这样的排法可能会有很多。  如果考虑旋转、镜像后相同的算同一种，一共有多少种不同的排法呢？  请你计算并提交该数字。  注意：需要提交的是一个整数，不要提交任何多余内容。
 * History:
 * <author>          <time>          <version>          <desc>
 * 作者姓名           修改时间           版本号              描述
 */
package 纸牌三角;

/**
 * 功能：〈 标题：纸牌三角形  A,2,3,4,5,6,7,8,9 共9张纸牌排成一个正三角形（A按1计算）。要求每个边的和相等。
 * 下图就是一种排法（如有对齐问题，参看p1.png）。        A      9 6     4   8    3 7 5 2
 * 这样的排法可能会有很多。  如果考虑旋转、镜像后相同的算同一种，一共有多少种不同的排法呢？
 * 请你计算并提交该数字。  注意：需要提交的是一个整数，不要提交任何多余内容。    〉
 *
 * @author 瑾墨
 * @create 2019/1/4
 */
public class 纸牌三角 {

    /**
     * 暴力方法求解
     *     a
     *   b   c
     *  d      e
     * f  g  h  i
     *
     */
    public void Solution1() {
        int cnt = 0;
        for (int a = 1; a <= 9; a++) {
            for (int b = 1; b <= 9; b++) {
                for (int c = 1; c <= 9; c++) {
                    for (int d = 1; d <= 9; d++) {
                        for (int e = 1; e <= 9; e++) {
                            for (int f = 1; f <= 9; f++) {
                                for (int g = 1; g <= 9; g++) {
                                    for (int h = 1; h <= 9; h++) {
                                        for (int i = 1; i <= 9; i++) {
                                            if (a != b && a != c && a != d && a != e && a != f && a != g && a != h && a != i &&
                                                    b != c && b != d && b != e && b != f && b != g && b != h && b != i &&
                                                    c != d && c != e && c != f && c != g && c != h && c != i &&
                                                    d != e && d != f && d != g && d != h && d != i &&
                                                    e != f && e != g && e != h && e != i &&
                                                    f != g && f != h && f != i &&
                                                    g != h && g != i &&
                                                    h != i) {
                                                if ((a + b + d + f) == (a + c + e + i) && (a + b + d + f) == (f + g + h + i) && (a + c + e + i) == (f + g + h + i)) {
                                                    cnt++;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        /*旋转3种,镜像2种*/
        System.out.println(cnt / 3 / 2);
    }

    public void Slution2(){

    }


    public static void main(String[] args) {
        纸牌三角 soluiton=new 纸牌三角();
        soluiton.Solution1();
    }

}