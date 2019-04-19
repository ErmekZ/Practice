package tests.recap121918;

import java.util.ArrayList;

public class Ruslan {
    public static void main(String[] args) {

//        int [] nums = {2,3,60,7,9,3,5,8,1,0,55,87,1,12,83,31,94,12,10,5,2,55,77,66,64,78,87,98,39,94,47,83} ;
//
//        int count = 0;
//
//        for(int i = 0; i < nums.length; i++){
//            count = 0;
//            for (int b = 0; b < nums.length ; b++){
//                if(nums[i] == nums[b] && i !=b){
//                    count ++;
//                }
//            }
//            if (count ==0){
//                System.out.print(nums[i]);
//            }
//        }

        int happy = 2019;
        int binary = 1064;
        while (happy < 0){

            if((happy - binary)<=0 ){
                System.out.print(1);
                happy -= binary;
                binary /=2;
            }else{
                System.out.print(0);
                binary /=2;
            }
        }



    }
}
