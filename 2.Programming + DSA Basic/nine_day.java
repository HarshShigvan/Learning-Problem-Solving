import java.util.Scanner;
//merge sort 

// public class nine_day {

//   public static void divide(int arr[], int si, int ei){
//     if (si >= ei){
//       return;
//     }
//     int mid = si + (ei - si)/2;
//     divide(arr, si, mid);
//     divide(arr, mid+1, ei);
//     conquer(arr, si, mid, ei);
//   }
//   public static void conquer(int arr[], int si, int mid, int ei){
//     int merged[] = new int [ei-si+1];
//     int idx1 = si;
//     int idx2 = mid+1;
//     int x = 0;


//     while (idx1 <= mid && idx2 <= ei){
//      if (arr[idx1] <= arr[idx2]){
//       merged[x++] = arr[idx1++];
//      } else {
//       merged[x++] = arr[idx2++];
//      }
//     }

//     while (idx1 <= mid){
//       merged[x++] = arr[idx1++];
//     }
//     while (idx2 <= ei){
//       merged[x++] = arr[idx2++];
//     }

//     for(int i = 0; i<merged.length; i++){
//       arr[si+i] = merged[i];
//     }
    
//   }
  
//   public static void main(String[] args){
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the size of the array: ");
// int n = sc. nextInt();
// int arr[] =new int[n];
// System.out.println("Enter the elements of the array: ");
// for (int i =0; i<n; i++){
//   arr[i] =sc.nextInt();
// }


//   divide(arr, 0, n-1);
//   System.out.println("Sorted array: ");
//   for (int i = 0; i < n; i++) {
//     System.out.print(arr[i] + " ");
//   }
//   }
// }


// Quick Sort 
public class nine_day {

public static int partition(int arr[], int low, int high){
  int pivot = arr[high];
  int i = low - 1;
for(int j= low; j<high; j++){
  if (arr[j] < pivot){
    i++;
    int temp = arr[i];
    arr[i] = arr[j];
    arr[j] = temp;
  }
}
i++;
int temp = arr[i];
arr[i] = arr[high];
arr[high] = temp;
return i;
}
  public static void quickSort(int arr[], int low , int high){
    if (low < high){

      int pivotIndex = partition(arr, low, high);
      quickSort(arr, low , pivotIndex-1);
      quickSort(arr, pivotIndex+1, high);
    }
  }
  public static void main(String [] args){
    Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array: ");
int n = sc.nextInt();
System.out.println("enter the elements of the array: ");
int arr[] = new int[n];
for (int i=0; i<n; i++){
  arr[i] = sc.nextInt();
}
quickSort(arr, 0, n-1);
System.out.println("Sorted array: ");
for (int i=0; i<n; i++){
  System.out.print(arr[i] + "  ");
}
  }
}