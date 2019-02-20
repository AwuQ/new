import java.util.Random;
import java.util.Scanner;

public class HomeWork02 {
    public static void main(String[] args) {
       /* Scanner scan=new Scanner(System.in);
        System.out.println("请输入数字：");
        int a=scan.nextInt();
        int [] b={2,4,6,7,82,1};
        for(int j=0;j<b.length;j++){
            if(b[j]==a){
                System.out.println("下标为："+j);
            }else{
                System.out.println("-1");
            }
        }*/
        //获得随机数组
        Random random = new Random();
        int[] array = new int[10];
        System.out.print("排序前的随机数为：");
        for (int i = 0; i < array.length; i++) {
            array[i] = random.nextInt(10);
            System.out.print(array[i] + "\t");
        }
        //获取随机数
        int count = -1;//定义count判断随机数的条件、
        int n = random.nextInt(10);
        System.out.println("随机数为：" + n);
        for (int j = 0; j < array.length; j++) {
            if (array[j] == n) {            //如果存在
               count=1;
                System.out.println("下标为：" + j);
            }
        }
        if(count == -1){
            System.out.println("-1");
        }
        }
    }



