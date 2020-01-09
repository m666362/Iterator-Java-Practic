package org.richit.iterator_lib;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Iterator;
import java.util.LinkedList;

public class UrlsLibrary implements Iterable<String> {

    private LinkedList<String> urls = new LinkedList<String>(  );

    private class UrlIterator implements Iterator<String>{

        StringBuilder stringBuilder = new StringBuilder();
        int index = 0;
        @Override
        public boolean hasNext() {
            return index<urls.size();
        }

        @Override
        public String next() {
            try {
                URL url = new URL( urls.get( index ) );
                BufferedReader bufferedReader = new BufferedReader( new InputStreamReader( url.openStream() ) );
                String line = "empty";
                while ((line=bufferedReader.readLine()) != null){
                    stringBuilder.append( line );
                    stringBuilder.append( "\n" );
                }
                bufferedReader.close();
            } catch (Exception e) {
                System.out.println(e.toString());
            }
            index++;
            return stringBuilder.toString();
        }
    }

    public UrlsLibrary() {
        this.urls.add( "http://www.facebook.com" );
        this.urls.add( "http://www.google.com" );
        this.urls.add( "http://www.pinterest.com" );
    }

    @Override
    public Iterator<String> iterator() {
        return new UrlIterator();
    }
}
