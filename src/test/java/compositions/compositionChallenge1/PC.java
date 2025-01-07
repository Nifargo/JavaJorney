package compositions.compositionChallenge1;

public class PC extends Product {

    Monitor monitor;

    public PC(String model, String manufacturer, Monitor monitor) {
        super(model, manufacturer);
        this.monitor = monitor;
    }

    public Monitor getMonitor() {
        return monitor;
    }
}
