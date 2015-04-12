package com.thecookiezen.http;

import lombok.extern.log4j.Log4j2;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.net.URL;

@Log4j2
public class ExampleClient implements Runnable {

    private final String url;

    public ExampleClient(String url) {
        this.url = url;
    }

    @Override
    public void run() {
        try {
            HttpURLConnection.setFollowRedirects(false);
            HttpURLConnection con = (HttpURLConnection) new URL(url).openConnection();
            con.setRequestMethod("HEAD");
            con.setConnectTimeout(10000);
            log.info("kod odpowiedzi : " + con.getResponseCode());
        } catch (SocketTimeoutException e) {
            log.info("SocketTimeoutException :(", e);
        } catch (IOException e) {
            log.info("IOException :(", e);
        } catch (Exception e) {
            log.info("Exception", e);
        }
    }
}
