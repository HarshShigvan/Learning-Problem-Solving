import java.util.Scanner;
public class three_day {
  public static void main(String[] args) {
  // static int fact(int n) {

  //   if (n == 0)
  //     return 1;
    

  //   return n * fact(n-1);
  // }

  // public static void main(String[] args) {
  //  int output = fact(5);
  //   System.out.println(output);
  // }

//   int a = 0;
// int b = 1;

// System.out.print(a + " " + b);

// for(int i=1;i<=10;i++){

//     int c = a + b;

//     System.out.print(" " + c);

//     a = b;
//     b = c;
// }

Scanner sc = new Scanner(System.in);

System.out.println("Enter number is base : ");
int num = sc.nextInt();
System.out.println("Enter number is Power : ");
int pow = sc.nextInt();

int result = 1;
for(int i =1; i<=pow; i++) {
  result = result * num;

 
} System.out.println(result);
}
}