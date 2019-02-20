import java.util.Random;
import java.util.Scanner;

public class HomeWork01 {
    public static void main(String[] args) {
        //定义随机数组
        Random random = new Random();
        int[] array = new int[10];
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.println("随机数组元素为：" + array[i] + "\t");
        }
        int min = array[0];
        for (int j = 0; j < array.length; j++) {
            if (array[j] < min) {
                min = array[j];
            }
        }
        System.out.println("最小值为-->" + min);
    }
}
