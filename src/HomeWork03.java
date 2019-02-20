import java.util.Random;

public class HomeWork03 {
    public static void main(String[] args) {
        //获得随机数
        Random random = new Random();
        int[] array = new int[10];
        System.out.print("排序前的随机数为：");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + "\t");
        }
        for (int i = 0; i < array.length / 2; i++) {
            int temp = array[i];
            array[i] = array[array.length - 1 - i];
            array[array.length - 1 - i] = temp;
        }
        for (int i : array) {
            System.out.println(i);
        }
    }
}
