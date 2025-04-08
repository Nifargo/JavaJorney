import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class DefaultLoggerFactory {
    public static Logger getLogger(Class<?> clazz) {
        return LoggerFactory.getLogger(clazz);
    }
}
