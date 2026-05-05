import java.util.Scanner;

public class five_day {
  public static void main(String[] args) {
     
    Scanner sc = new Scanner(System.in);

    System.out.println("Enter size:");
    int n = sc.nextInt();

    int[] arr = new int[n];

    System.out.println("Enter elements:");
    for (int i = 0; i < n; i++) {
      arr[i] = sc.nextInt();
    }

    System.out.println("Enter number to search:");
    int target = sc.nextInt();

    boolean found = false;

    for (int i = 0; i < n; i++) {
      if (arr[i] == target) {
        System.out.println("Element found at index: " + i);
        found = true;
        break;
      }
    }

    if (!found) {
      System.out.println("Element not found");
    }
  }
}