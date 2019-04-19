package pageObject;

  class Test {

    public static void main(String[] args) {



        int [] arr = {1,2,5,4,4};

        System.out.println(duplicates(arr));
    }


    public static boolean duplicates( int[] arr){

        boolean isDistinct = true;
        for(int i = 0; i < arr.length; i++){
            for(int b = 0; b< arr.length; b++){
                if(arr[i] == arr[b] && b != i  ){
                    isDistinct = false;
                }
            }
        }
        return isDistinct;
    }
}
