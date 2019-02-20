public class ForTest01 {
    public static void main(String[] args) {
        System.out.println(jia(1,2));
        System.out.println(jian(1,2));
        System.out.println(cheng(1,2));
        System.out.println(chu(1,2));

    }
    static int jia(int i,int j){
        return i+j;
    }
    static int jian(int i,int j){
        return i-j;
    }
    static int cheng(int i,int j){
        return i*j;
    } static int chu(int i,int j){
        return i/j;
    }

}
