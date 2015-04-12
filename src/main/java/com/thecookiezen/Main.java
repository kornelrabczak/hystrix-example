package com.thecookiezen;

import com.thecookiezen.http.ExampleClient;
import com.thecookiezen.http.ExampleCommand;

public class Main {

    public static void main(String[] args) throws InterruptedException {
        Thread.sleep(10000);

        while (true) {
            socketTimeoutExceptionHystrixExample("http://google.com:81");
            Thread.sleep(500);
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

    private static void socketTimeoutExceptionHystrixExample(String url) {
        new ExampleCommand(url).queue();
        new ExampleCommand(url).queue();
        new ExampleCommand(url).queue();
        new ExampleCommand(url).queue();
        new ExampleCommand(url).queue();
        new ExampleCommand(url).queue();
        new ExampleCommand(url).queue();
        new ExampleCommand(url).queue();
        new ExampleCommand(url).queue();
        new ExampleCommand(url).queue();
        new ExampleCommand(url).queue();
        new ExampleCommand(url).queue();
        new ExampleCommand(url).queue();
        new ExampleCommand(url).queue();
        new ExampleCommand(url).queue();
        new ExampleCommand(url).queue();
        new ExampleCommand(url).queue();
        new ExampleCommand(url).queue();
        new ExampleCommand(url).queue();
        new ExampleCommand(url).queue();
    }

}
