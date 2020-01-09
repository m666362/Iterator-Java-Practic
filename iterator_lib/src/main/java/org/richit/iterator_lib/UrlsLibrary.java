package org.richit.iterator_lib;

import java.util.Iterator;
import java.util.LinkedList;

public class UrlsLibrary implements Iterable<String> {

    private LinkedList<String> urls = new LinkedList<String>(  );

    public UrlsLibrary() {
        this.urls.add( "http://www.facebook.com" );
        this.urls.add( "http://www.google.com" );
        this.urls.add( "http://www.pinterest.com" );
    }

    @Override
    public Iterator<String> iterator() {
        return urls.iterator();
    }
}
