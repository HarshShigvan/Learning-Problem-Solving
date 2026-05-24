import java.util.Scanner;
public class six_day {
  public static void main(String[] args) {
// // sliding window
// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the size of the array: ");
// int n = sc.nextInt();
// int[]arr= new int[n];
// System.out.println("Enter the elements of the array: ");
// for (int i = 0; i < n; i++) {
//   arr[i] =sc.nextInt();
// }
// System.out.println("Enter the size of the window: ");
// int w = sc.nextInt();
// int current = 0;

// for (int i = 0; i < w; i++) {
//   current += arr[i]; 
// } 
// int max = current;
// for (int i = 1; i <= n - w; i++ ){
//    current = current - arr[i-1] + arr[i + w-1];
//    if (current > max) {
//     max = current;
//    }
// }
// System.out.println("The maximum sum of a subarray of size " );
// System.out.println(max);



// Scanner sc = new Scanner(System.in);
// System.out.println("Enter the size of the array: ");
// int n =sc.nextInt();
// int []arr = new int[n];
// System.out.println("Enter the elements of the array: ");
// for (int i = 0; i<n; i++){
//   arr[i] = sc.nextInt();
//   }
//   int prifix[] = new int[n];
//   prifix[0] =arr[0];

//   for (int i = 1; i<n; i++) {
//     prifix[i] = prifix[i-1] + arr[i];
//   }
//   for(int i=0; i<n; i++) {
//     System.out.print(prifix[i] + " ");
//   }

Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array: ");
int n = sc.nextInt();
int arr[] =new int[n];
System.out.println("Enter the elements of the array: ");
for (int i = 0; i<n; i++) {
  arr[i] = sc.nextInt();
}
System.out.println("All the subarrays of the array are: " + n *(n+1)/2);

for (int i=0; i<n; i++){
  for (int j=i; j<n; j++){
    for (int k=i; k<=j; k++){
      
      System.out.print(arr[k] + " ");
    }
    System.out.println();
  }
}
}

}