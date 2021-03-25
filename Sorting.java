import java.util.*;

//literally copied from a book 
class Sorting {
  public static void main(String[] args) {
    int[] arr1 = {1, 0, 3, 5, 6, 7, 9, 10, 23, 2};
    int[] arr2 = {1, 0, 3, 5, 6, 7, 9, 10, 23, 2};
    int[] arr3 =  {1, 0, 3, 5, 6, 7, 9, 10, 23, 2};

    //mergeSort(arr1);
    //quickSort(arr2);
    Arrays.sort(arr3);

    for(int i = 0;i<arr1.length;i++){
      int num1 = arr1[i];
      int num2 = arr2[i];
      int num3 = arr3[i];
      System.out.print(num3 + " ");
    }
  }

  
  public static void merge(int[] arr, int[] help, int l, int m, int r){
    for(int i = l; i<= r ; i++){
      help[i] = arr[i];
    } //move stuff to the helper
    
    int hLeft = l; //helper indexes
    int hRight = m + 1;
    int curr = l; //current index for moving elements

    while(hLeft <= m && hRight <= r){ //make sure nothing goes out of bounds
      if(help[hLeft] <= help[hRight]){ //pick smallest
        arr[curr] = help[hLeft]; //add left if it's smaller
        hLeft ++;
      }else{
        arr[curr] = help[hRight]; //else add right
        hRight ++;
      }
      curr ++; //move on to next index
    }

    int remain = m - hLeft; //remaining elements to add
    for(int i = 0; i <= remain; i++){
      arr[curr + i] = help[hLeft + i];
    }
  }

  public static void mergeSort(int[] arr, int[] help, int l, int r){
    if(l < r){
      int mid = (l + r) / 2; //split in half
      mergeSort(arr, help, l, mid); //first half
      mergeSort(arr, help, mid + 1, r); //second half
      merge(arr, help, l, mid, r); //merge them
    }
    
  }
  public static void mergeSort(int[] arr){
    int[] help = new int[arr.length]; //helper array (extra space)
    mergeSort(arr, help, 0, arr.length-1); //start the sort
  }
  public static void quickSort(int[] arr){
     //overloaded method for easier use
    quickSort(arr, 0, arr.length-1);
  }
  public static void quickSort(int[] arr, int l, int r){
    int index = partition(arr, l, r); //get the partition index

    if(l < index - 1){ //sort lower half if you can
      quickSort(arr, l, index -1);
    }
    if(index < r){ //sort upper half if you can
      quickSort(arr, index, r);
    }
  }
  public static int partition(int[] arr, int l, int r){
    int piv = arr[(l + r)/2];  //get pivot from middle
    while(l <= r){  //while the two runners don't overlap
      while(arr[l] < piv) l ++; //find index greater than piv
      while(arr[r] > piv) r --; //find index less than piv

      if(l <= r){ //if the indexes don't overlap
        swap(arr, l, r); //swap them
        l ++; //move the left runner right
        r --; //move the right runner left
      }
    }
    return l; //return final partition point(the point to split array)
  }
  public static void swap(int[] arr, int l, int r){
    int temp = arr[l]; //temporary variable to keep track of arr[l] when it is changed
    arr[l] = arr[r]; //change arr[l]
    arr[r] = temp; //change arr[r]
  }
}