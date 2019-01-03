/**
 * @author 瑾墨
 *
 */
public class 矩阵求和 {
    public static void main(String[] args) {
        int n = 101;
        //用于递增
        int t = 1;
        //定义一个二维数组来表示横纵
        int num[][] = new int[n + 1][n + 1];
        //存数
        for (int i = 1; i <= n; i++) {
            for (int j = 1; j <= n; j++) {
                num[i][j] = t;
                t++;
            }
        }

        int sum = 0;
        //计算中间行的和
        for (int i = 1; i <= 101; i++) {
//System.out.println(num[51][i]);
            //第51行
            sum += num[51][i];
        }
        System.out.println(sum);
        //计算上半部分的和
        for (int i = 50; i >= 1; i--) {
            for (int j = 51 - i + 1; j <= 101 - (51 - i); j++) {
                sum += num[i][j];
            }
        }
        System.out.println(sum);
        //计算下半部分的和
        for (int i = 52; i <= 101; i++) {
            for (int j = i - 51 + 1; j <= 101 - (i - 51); j++) {
                sum += num[i][j];
            }
        }
        System.out.println(sum);
    }
}