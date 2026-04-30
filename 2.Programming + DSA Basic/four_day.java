Time & Space Complexity

Complexity	      Meaning	      Speed
O(1)	            Constant	    ⚡ Fastest
O(log n)	        Logarithmic	   🚀 Fast
O(n)	            Linear	      👍 Normal
O(n log n)        Log Linear	   😊Good
O(n²)            	Quadratic	     🐢 Slow
O(2ⁿ)	            Exponential	   💀 Very Slow

O(1)
int a=10;
System.out.println(a);

O(log n)
 for (int i=1; i<=n; i=i*2){
  System.out.println(i);
 }

O(n) 
for(int i=1; i<=n; i++){
    System.out.println(i);
}

O(n log n) 
for (int i=1; i<=n; i++) {
  for (int j=1; j<=n; j=j*2) {
    System.out.println(i + " "+ j);
  }
}

O(n²)
for (int i=1; i<=n; i++){
  for (int j=1; j<=n; j++){
    System.out.println(i + " "+j);
  }
}

O(2ⁿ)
static int fib(int n){

    if(n <= 1)
        return n;

    return fib(n-1) + fib(n-2);
}

Space Complexity: 

Complexity	      Meaning	      Space
O(1)	            Constant	    ⚡ Fastest
O(log n)	        Logarithmic	   🚀fast
O(n)	            Linear	      👍normal
O(n log n)        Log Linear	   😊good
O(n²)            	Quadratic	     🐢slow
O(2ⁿ)	            Exponential	   💀very slow

O(1)
int a = 10;
int b = 20;
int sum = a + b;

O(log n)
static void fun(int n){
    if(n <= 1) return;
    fun(n/2);
}

O(n)
int arr[] = new int[n];

O(n log n)
// not full code, just idea
divide array → recursion depth = log n
at each level → use temp array of size n

O(n²)
int matrix[][] = new int[n][n];

O(2ⁿ)
static int fib(int n){

    if(n <= 1)
        return n;

    return fib(n-1) + fib(n-2);
} 


