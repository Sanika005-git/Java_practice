import java.util.Arrays;

 public class Array5 {
    public static void main(String[] args) {
        int arr[] = {1,3,5,7,9,11,13};
        int temp;
        int i =0;
        int j =arr.length-1;
        while(i<j)
        {
            temp = arr[i];
            arr[i]=arr[j];
            arr[j] = temp;
            i++;
            j--;
        }
        System.out.println("Rotate array is"+ Arrays.toString(arr));
    }
}
