import java.util.*;

class Searching{
  public static void main(String[] args){
    int[] nums = {1,2,3,4,5};
    System.out.println(binarySearch(nums, 1));
  }

  public static int binarySearch(int[] nums, int target){
    int lo = 0;
    int hi = nums.length-1; //the index of hi and lo

    while(lo<=hi){ //made sure the splitting doesn't overlap
      int mid = (lo + hi)/2; //get the midpoint

      if(nums[mid]==target){ //check if number is target
        return mid;
      }else if(nums[mid]>target){ //remove upperhalf 
        hi = mid-1;
      }else{ //remove lowerhalf
        lo = mid+1;
      }
    }
    return -1;
  }
}