public class que6 {
    public static int getocc(int[] arr, int key, int occ1){
        int occ=0;
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key)occ++;
            if(occ==occ1)return i;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr ={1,2,5,5,3};
       System.out.println( getocc(arr,5,1));
    }
}
