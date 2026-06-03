import java.util.Scanner;

public class ten_day {
  public static void main(String[] args) {
    Scanner sc = new Scanner(System.in);
System.out.println("Enter the number array size: ");
    int n = sc.nextInt();
    System.out.println("Enter the number array: ");

    int arr[] = new int[n];
for (int i=0; i<n; i++){
  arr[i] = sc.nextInt();
}

System.out.println("enter the target: ");
int target = sc.nextInt();

int low = 0; 
int high = n-1;

while (low <= high) {
  int mid = (low +high) / 2;

  if (arr[mid] == target) {
    System.out.println("found at index: " + mid );
    return; 
     }

     else if (arr[mid] < target){
      low = mid + 1;
     }

     else { high = mid - 1;
     }
}

System.out.println("Element not found");
  }
}