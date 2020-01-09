package org.richit.iterator_lib;

public class MyClass {

    static String dot = "----------------";
    private static void heading(String heading) {
        System.out.println();
        System.out.println(dot + heading + dot);
        System.out.println();
    }

    public static void main(String[] args) {
        heading("Programme Started");
    }

}
