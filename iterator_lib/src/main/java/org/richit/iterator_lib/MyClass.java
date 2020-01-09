package org.richit.iterator_lib;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.swing.text.html.HTMLDocument;

public class MyClass {

    static String dot = "----------------";
    private static void heading(String heading) {
        System.out.println();
        System.out.println(dot + heading + dot);
        System.out.println();
    }

    public static void main(String[] args) {
        iteratorfun();
        implementingIterable();
        heading("Programme Ended");
    }

    private static void implementingIterable() {
        heading( "implementingIterable" );
        UrlsLibrary urlsLibrary = new UrlsLibrary();
        for (String url:urlsLibrary){
            System.out.println(url);
        }
    }

    private static void iteratorfun() {
        heading( "iteratorfun" );
        List<String> animals = new ArrayList<>(  );
        animals.add( "dog" );
        animals.add( "cat" );
        animals.add( "Mouse" );
        animals.add( "Lion" );
        animals.add( "Tiger" );

        Iterator<String> iterator = animals.iterator();
        while (iterator.hasNext()){
            String value = iterator.next();
            if(value.equals( "Mouse" )){
                iterator.remove();
            }
            System.out.println(value);
        }

        System.out.println();
        heading( "orginal" );
        for (String animal:animals){
            System.out.println(animal);
        }
    }

}
