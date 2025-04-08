import lombok.extern.slf4j.Slf4j;

@Slf4j
public class Main {
    public static void main(String[] args) {

        var customLogger = CustomLoggerFactory.getLogger(Main.class);

        log.info("This is a default logger");
        customLogger.info("This is a shaded SLF4J log");
    }
}
