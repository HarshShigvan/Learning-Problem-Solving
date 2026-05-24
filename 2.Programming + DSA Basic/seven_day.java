import java.util.Scanner;
// Kadane's Algorithm
public class seven_day {
  public static void main(String[] args) {
  //   Scanner sc = new Scanner(System.in);
  //   System.out.println("Enter the size of the array: ");

  //   int n = sc.nextInt();
  //   int arr[] = new int[n];

  //   for (int i=0; i<n; i++) {
  //   arr[i] = sc.nextInt();
  //   }
  //   int currentSum = 0;
  //   int maxSum = Integer.MIN_VALUE;
    
  //   for (int i=0;i<n; i++ ){
  //     currentSum = currentSum + arr[i];

  //     if(currentSum > maxSum){
  //       maxSum = currentSum;
  //   }
  //   if(currentSum < 0) {
  //     currentSum = 0;
  //   }
  //   }
  //  System.out.println("Maximum Subarray Sum = " + maxSum);


  Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array: ");
int n = sc.nextInt();
int arr[] =new int [n];
System.out.println("Enter the sorted elements of the array: ");
for (int i = 0; i<n; i++) 
arr[i] =sc.nextInt();


int left = 0;
int right = n-1;
System.out.println("Enter the target element: ");
int target = sc.nextInt();

while (left < right){
  int sum = arr[left]+ arr[right];
  if (sum == target ) {
    System.out.println("pair fount : "+ sum + "  " + arr[left] + " " + arr[right]);
    break;
  }
  else if (sum < target){
    left++;
  } else {
    right--;
  }
}
  }
}