import java.util.Arrays;

public class HelloWorld {
    //完成 main 方法
    public static void main(String[] args) {
        int scores[]= {89,-23,64,91,119,52,73};

        System.out.println("数组："); 
        for ( int i = 0; i < scores.length; i++ ) {
            System.out.print("scores[" + i + "] = " + scores[i]+", ");
        }
        System.out.println("数组长度 = " + scores.length);
        top3(scores);
    }

    public static void top3(int[] scrs) {
        Arrays.sort(scrs);
        int j = 0;
        for ( int i = scrs.length - 1; i >= 0; i-- ) {
            if ((scrs[i] > 100) || (scrs[i] < 0)) {
                continue;
            }
            if (j == 3){
                break;
            }
            j++;
            System.out.println(scrs[i]);
        }
    }
}

