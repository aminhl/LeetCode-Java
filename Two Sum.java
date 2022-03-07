package piDevers;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        int[] nums = {3,2,4};
        int x = 0, y =0;
        Scanner sc = new Scanner(System.in);
        int target =  sc.nextInt();
        for (int i = 0; i <nums.length ; i++) {
            int search = target - nums[i];
            for (int j = i+1; j <nums.length ; j++) {
                if(nums[j] == search){
                    x = i;
                    y = j;
                    break;
                }
            }
        }
        System.out.println("[" + x + "," + y + "]");
    }
}