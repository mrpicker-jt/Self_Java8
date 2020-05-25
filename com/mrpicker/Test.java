package com.mrpicker;

import java.util.stream.IntStream;

public class Test {
    static class Cookie {
     static long counter;
     final long id=counter++;


        @Override
        public String toString() {
            return String.valueOf(id);
        }
    }

    public static void main(String[] args) {
        Class<Cookie> cookieClass = Cookie.class;
        IntStream.range(0,5).forEach(i -> {
            try {
                System.out.println(cookieClass.newInstance());
            } catch (InstantiationException e) {
                e.printStackTrace();
            } catch (IllegalAccessException e) {
                e.printStackTrace();
            }
        });
    }
}
