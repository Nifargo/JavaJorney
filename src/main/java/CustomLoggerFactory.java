import custom.slf4j.Logger;
import custom.slf4j.LoggerFactory;

public class CustomLoggerFactory {
    public static Logger getLogger(Class<?> clazz) {
        return LoggerFactory.getLogger(clazz);
    }
}