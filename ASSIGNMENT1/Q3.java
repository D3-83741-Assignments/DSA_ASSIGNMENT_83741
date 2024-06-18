public class que3 {

    public static int binarySearch(int[] arr ,int key){
        int result = 0;
        int right=0;
        int left=arr.length;
        while (right<left) {
            result++;
            int mid=(right+left)/2;
            if(arr[mid]==key)return mid;
            else if(arr[mid]>key)left=mid;
            else right=mid;
        } 
        return -1;
    }
    public static int linearsSearch(int[] arr, int key){
        
        for (int i = 0; i < arr.length; i++) {
            if(arr[i]==key)return i+1;
        }
        return -1;
    }
    public static void main(String[] args) {
        int[] arr = {1,2,3,4,5};
        System.out.println(binarySearch(arr, 4));
        System.out.println(linearsSearch(arr, 5));
    }
}
