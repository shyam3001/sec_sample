package org.example;

public class ExampleJavaApp
{
    static
    {
        System.loadLibrary("example_c_library");
    }

    public static void main(String[] args)
    {
        hello();
        sum(5);
    }

    public static native void hello();
    public static native void sum(int n);
}
