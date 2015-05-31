package mg.solr.twitter.feed.importer;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.aop.interceptor.AsyncUncaughtExceptionHandler;

import java.lang.reflect.Method;

public class TweetsImporterAsyncUncaughtExceptionHandler implements AsyncUncaughtExceptionHandler {

    private static final Logger LOGGER = LoggerFactory.getLogger(TweetsImporterAsyncUncaughtExceptionHandler.class);
    @Override
    public void handleUncaughtException(Throwable throwable, Method method, Object... objects) {
        LOGGER.error("Async exception occured while importing tweets ", throwable);
    }
}
