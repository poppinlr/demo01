package od.od20240912;
import java.util.Scanner;
import java.util.StringJoiner;
/**
 * https://fcqian.blog.csdn.net/article/details/127247293
 */
public class ODE10027 {
    public static void main(String[] args) {

        int peopleNum = 5;
        int _7count = 3;

        int[] arr = new int[peopleNum];
        int i = 1;
        int arrIndex = 0;
        while (_7count > 0){
            if(i%7 == 0 || (""+i).contains("7")){
                _7count--;
                arr[arrIndex] = arr[arrIndex]+1;
            }

            arrIndex++;
            i++;

            if(arrIndex>=peopleNum){
                arrIndex = 0;
            }
        }

        System.out.println(arr);
    }
}