public class HomeWork04 {
    public static void main(String[] args) {
        int[] arr={8,41,6,7,34};
        for(int i=0;i<arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                    int item=arr[i];
                    arr[i]=arr[j];
                    arr[j]=item;
                }
            }
            System.out.println(arr[i]);
        }
    }
}
