import java.util.Arrays;

public class HelloWorld {
    //完成 main 方法
    public static void main(String[] args) {
        int scores[]= {89,-23,64,91,119,52,73};
        //int sorted[];

        System.out.println("数组："); // +scores[]);
        for ( int i = 0; i < scores.length; i++ ) {
            System.out.print("scores[" + i + "] = " + scores[i]+", ");
        }
        // System.out.println();
        System.out.println("数组长度 = " + scores.length);
        // System.out.println("数组越界值：" + scores[scores.length]);
        Arrays.sort(scores);
        int j = 0;
        for ( int i = scores.length - 1; i >= 0; i-- ) {
            if ((scores[i] > 100) || (scores[i] < 0)) {
                continue;
            }
            if (j == 3){
                break;
            }
            j++;
            System.out.println(scores[i]);
        }
    }
}

