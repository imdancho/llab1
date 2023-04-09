import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
//        int[] arr = inp_arr(n);
//        int min = find_min(arr, n-1);
//        System.out.println(min);
    }

    // Declaring a function
    public static int[] inp_arr(int n) { //its a function to input values in our array
        Scanner sc = new Scanner(System.in);
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt(); // input values
        }
        return arr; //returns array
    }

    //PROBLEM_1 - Declaring a function to find minimum value
    public static int find_min(int[] arr, int n) {
        if (n == 0) {
            return arr[0];
        }
        int curr_min = find_min(arr, n-1); //we check all elements of array
        if (arr[n] < curr_min) {
            return arr[n];
        } else {
            return curr_min;
        }
    }

    //PROBLEM_2 - Declaring a function to find sum of the array
    public static int find_sum(int[] arr, int n) {
        if (n == 0) { //the last element
            return arr[0];
        }
        else {
            return arr[n] + find_sum(arr, n-1); //we sum all numbers in this array
        }
    }

    //PROBLEM_3 - Declaring a function to check is it prime or not
    static String is_Prime(int n, int tempp) { //its important to start from tempp=2
        if (n > 0 && n <= 2) return "Prime"; // in this its prime
        if (n % tempp == 0) { return "Composite"; }
        if (tempp * tempp > n) { return "Prime"; }
        tempp++; //increase temp variable
        return is_Prime(n, tempp);
    }

    //PROBLEM_4 - Declaring a function to find a factorial of the number
    static int factorial(int n) { //Declaring
        if (n == 1) { return 1; } //the last one (0-element)
        return n*factorial(n-1); // every time we multiply to the previous element in array
    }

    //PROBLEM_5 - Declaring a function to find fibonachi number by index
    static int fibonachi(int n){ //Declaring
        if (n == 0){ return 0; }
        if (n == 1){ return 1; }
        else{ return fibonachi(n - 1) + fibonachi(n - 2); } //check the next element
    }

    //PROBLEM_6 - Declaring a function to find power n of the number a
    static int power(int a, int n) { //Declaring
        if (n == 0) { return 1; } //a^0 = 1
        if (n == 1) { return a; } //a^1 = a
        return a * power(a,n-1); //here we multiply a to a n times
    }

    //PROBLEM_7 - Declaring a function to show array in reverse using recursion
    public static void reverse(int[] arr, int n) { //its important to start n=0
        if (n < arr.length) { //we compare it with the length of array
            reverse(arr, n + 1); //call itself
            System.out.print(arr[n] + " ");
        }
    }

    //PROBLEM_8 - Declaring a function to check if this string consists of only digits
    static boolean isDigit(String s) {
        if (s.charAt(0) < '1' || s.charAt(0) > '9') { //check if first symbol is digit
            return false;
        } else if (s.length() == 1) {
            // Single character string is a digit
            return true;
        } else {
            // Check if the substring starting from index 1 is also a digit
            return isDigit(s.substring(1));
        }
    }

    //PROBLEM_9 - Declaring a function to calculate it using our factorial functions
    static int C(int n, int r){ // n! / ( (n-r)! * r!
        int C1 = factorial(n-1) / (factorial(n-1-r+1) * factorial(r-1)); //we find C (k-1) (n-1)
        int C2 = factorial(n-1) / (factorial(n-1-r) * factorial(r)); //we find C (k) (n-1)
        int C = C1 + C2; //calculate C
        return C;
    }

    //PROBLEM_10 - Declaring a function to find GCD of two numbers
    static int GCD(int a, int b){ //Declaring
        if(b == 0){ return a; } //check if b is equal to 0
        return GCD(b, a % b); //calculate
    }

}
