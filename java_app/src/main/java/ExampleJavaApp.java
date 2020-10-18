package org.example;
import java.util.Scanner;

public class ExampleJavaApp
{
    static
    {
        System.loadLibrary("example_c_library");
    }

    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        System.out.println("enter something: ");
        String s = in.next();
        System.out.println("you entered : " + s);

        hello();
        sum(5);

        int n = product(5);
        System.out.println(n);
    }

    public static native void hello();
    public static native void sum(int n);
    public static native int product(int n);
}
