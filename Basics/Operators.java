import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a, b;

        System.out.print("Enter a and b: ");
        a = sc.nextInt();
        b = sc.nextInt();

        // System.out.println(a + " + " + b + " = " + (a+b));
        // System.out.println(a + " - " + b + " = " + (a-b));

        // System.out.println(a + " > " + b + " = " + (a>b));
        // System.out.println(a + " < " + b + " = " + (a<b));
        // System.out.println(a + " >= " + b + " = " + (a>=b));    // ! a<b
        // System.out.println(a + " <= " + b + " = " + (a<=b));    // ! a>b
        // System.out.println(a + " == " + b + " = " + (a==b));
        // System.out.println(a + " != " + b + " = " + (a!=b));

        // System.out.println(a + ", " + b);
        // a += b; // a = a + b;
        // System.out.println(a + ", " + b);
        // b -= a;
        // System.out.println(a + ", " + b);
        // System.out.println(b-=a);

        System.out.println((a>b)?"A>B":"A<B");

        sc.close();
    }
}

/*
OPerators:

1. Arithmetic Operators -> +, -, *, / (quotient), % (remainder)
2. Conditional Operators (return boolean) -> <, >, <=, >=, ==, !=
3. Assignment Operators -> =, +=, -=, *=, /=, %=
4. Increment/Decrement Operators
5. Logical Operators
6. Bitwise Operators
7. Ternary Operator -> (condition)?true:false

*/