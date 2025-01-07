package compositions.compositionChallenge1;

public class Task {
    public static void main(String[] args) {

        Monitor monitor = new Monitor("Monitor is on");

        PC pc = new PC("HP Pavilion", "HP", monitor);
        System.out.println(pc.getMonitor());
    }
}
