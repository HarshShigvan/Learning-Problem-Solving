import java.util.Scanner;

public class eight_day {
  public static void main(String[] args) {
    // Scanner sc =new Scanner(System.in);
    // System.out.println("Enter the size of the array: ");
    // int n = sc.nextInt();

    // System.out.println("Enter the elements of the array: ");
    // int arr[] =new int[n];

    // for (int i=0; i<n; i++){
    //   arr[i] =sc.nextInt();
    // } 

    // for (int i=0; i<n-1; i++){
    //   for(int j=0; j<n-i-1; j++){
    //     if(arr[j] > arr[j+1]){
    //       int temp = arr[j];
    //       arr[j] = arr[j+1];
    //       arr[j+1] = temp;
    //     }
    //   }
    // }
    // System.out.println("Sorted array: ");
    // for (int i=0; i<n; i++){
    //   System.out.print(arr[i] + " ");
    // }

//     Scanner sc = new Scanner(System.in);
// System.out.println("Enter the size of the array: ");
// int n =sc.nextInt();
// int arr[] =new int[n];
// System.out.println("Enter the elements of the array: ");
// for (int i=0; i<n; i++){
//   arr[i] = sc.nextInt();
// }

// for (int i= 0; i< n-1; i++){
//   int minIndex = i;

//   for (int j= i+1; j < n; j++){
//     if(arr[j] < arr[minIndex]){
//       minIndex = j;
//     }
//   }

//   int temp = arr[minIndex];
//   arr[minIndex] =arr[i];
//   arr[i] =temp;
// }
// System.out.println("Sorted array: ");
// for (int i=0; i<n; i++){
//   System.out.print(arr[i] + " ");
// }


Scanner sc = new Scanner(System.in);
System.out.println("Enter the size of the array: ");
int n = sc.nextInt();
int arr[] =new int[n];
System.out.println("Enter the elements of the array: ");
for (int i=0; i<n; i++){
  arr[i] = sc.nextInt();
}

for (int i=1; i< n; i++){
  int current = arr[i];
  int j= i-1;

  while (j>=0 && arr[j]> current ){
    arr[j+1] = arr[j];
    j--;
  }
  arr[j+1] = current;
}
System.out.println("Sorted array: ");
for (int i=0; i<n; i++){
  System.out.print(arr[i] + " ");
}

  }
}