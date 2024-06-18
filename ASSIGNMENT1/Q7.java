public class que7 {

    public static int distinct(int[] arr){
       for (int i = 0; i < arr.length; i++) {
        boolean flag = false;

           for (int j = 0; j < arr.length; j++) {
               if(arr[i]==arr[j]&& i!=j ){
                flag = false;   
                break;}
               else{flag=true;}
           }
          if (flag) {
              return arr[i]; 
          }
           
       }
       return -1;
    }
    public static void main(String[] args) {
        int[] arr ={1,1,3,5,5,6};
       System.out.println( distinct(arr));
    }
    
}
