package 纸牌三角;

public class Exe2 {

    static int count =0;

    public static void main(String[] args) {
        /*定义九个数*/
        int a[] = new int[9];
        /*给九个数赋值123456789*/
        for (int i = 0; i < a.length; i++) {
            a[i] = i+1;
        }
        /*递归循环*/
        dfs(a,0);
        /*这里其实是count/3/2,除以3是排除了旋转，除以2是排除了镜像*/
        System.out.println(count/6);
    }
    /**
     * 递归判断， a[] 九个数 ，int begin
     * */
    private static void dfs(int[] a, int begin) {
        if (begin>= a.length) {
            check(a);
            return ;
        }
        for (int i = begin; i < a.length; i++) {
            int temp = a[begin];
            a[begin] = a[i];
            a[i] = temp;
            dfs(a, begin+1);
            temp = a[begin];
            a[begin] = a[i];
            a[i] = temp;
        }
    }

    /**检查三条边是否相等*/
    private static void check(int[] a) {
        /*定义数组存储三边的值*/
        int b[] = new int[3];
        /*
        *    0
        *   1 8
        *  2   7
        * 3 4 5 6
        * 类似上述矩阵
        * */
        b[0] = a[0]+a[1]+a[2]+a[3];
        b[1] = a[3]+a[4]+a[5]+a[6];
        b[2] = a[6]+a[7]+a[8]+a[0];

        /*检查是否相等*/
        if (b[0]==b[1]&&b[1]==b[2]) {
            /*记数*/
            count++;
        }
    } 
}