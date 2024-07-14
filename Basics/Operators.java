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

        // System.out.println((a>b)?"A>B":"A<B");

        // int a = 22;
        // System.out.println("a = " + a + "\n++a = " + ++a + "\na = " + a);
        // System.out.println("a = " + a + "\na++ = " + a++ + "\na = " + a);

        // System.out.println("(a<b) && (a>b) : " + ((a<b) && (a>b)));
        // System.out.println("(a<=b) && (a==b) : " + ((a<=b) && (a==b)));
        // System.out.println("(a<b) || (a>b) : " + ((a<b) || (a>b)));
        // System.out.println("(a<=b) || (a==b) : " + ((a<=b) || (a==b)));
        // System.out.println("!(a<b) : " + !(a<b));

        // System.out.println((a & b) + "\n" + (a | b));
        //45 3
        //678 677
        //223 567
        //1 45

        System.out.println("-> " + (a >> b));
        //xor, left shift, right shift
        //17890 5
        //234 3
        //456 2
        //4 1
        //56478 8
        //345 5
        

        sc.close();
    }
}

/*
OPerators:

1. Arithmetic Operators -> +, -, *, / (quotient), % (remainder)
2. Conditional Operators (return boolean) -> <, >, <=, >=, ==, !=
3. Assignment Operators -> =, +=, -=, *=, /=, %=
4. Increment/Decrement Operators -> (pre/post) (inc/dec)
5. Logical Operators -> && (and), ||(or), !(not)
6. Bitwise Operators -> &, |, ^(xor), <<, >>
7. Ternary Operator -> (condition)?true:false

*/