package com.thecookiezen;

import com.thecookiezen.http.ExampleClient;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);

        while(true) {
            socketTimeoutExceptionExample("http://google.com:81");
            Thread.sleep(1000);
//            socketTimeoutExceptionExample("http://211.20.12.222/index.html");
        }
    }

    private static void socketTimeoutExceptionExample(String url) {
        new Thread(new ExampleClient(url)).start();
        new Thread(new ExampleClient(url)).start();
        new Thread(new ExampleClient(url)).start();
        new Thread(new ExampleClient(url)).start();
        new Thread(new ExampleClient(url)).start();
        new Thread(new ExampleClient(url)).start();
        new Thread(new ExampleClient(url)).start();
        new Thread(new ExampleClient(url)).start();
        new Thread(new ExampleClient(url)).start();
        new Thread(new ExampleClient(url)).start();
    }

}
