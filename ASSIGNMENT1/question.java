/**
 * question
 */
public class question {

    public static int last(int[] arr, int key){
        int occ=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key)occ=i;
        }
        return occ;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,5,5,3};
       System.out.println( last(arr,5));
    }
}