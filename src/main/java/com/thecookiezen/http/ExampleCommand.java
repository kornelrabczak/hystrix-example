package com.thecookiezen.http;

import com.netflix.hystrix.HystrixCommand;
import com.netflix.hystrix.HystrixCommandGroupKey;
import com.netflix.hystrix.HystrixCommandProperties;
import lombok.extern.log4j.Log4j2;

@Log4j2
public class ExampleCommand extends HystrixCommand<String> {

    private final String url;

    public ExampleCommand(String url) {
        super(Setter.withGroupKey(HystrixCommandGroupKey.Factory.asKey("ExampleGroup"))
                .andCommandPropertiesDefaults(HystrixCommandProperties.
                        Setter()
                            .withExecutionIsolationThreadInterruptOnTimeout(false)
                            .withExecutionTimeoutInMilliseconds(2000)));
        this.url = url;
    }

    @Override
    protected String run() throws Exception {
        ExampleClient exampleClient = new ExampleClient(url);
        exampleClient.run();

        return null;
    }

    @Override
    protected String getFallback() {
        String msg = "Failure on " + url + "!";
        log.info(msg);
        return msg;
    }
}
