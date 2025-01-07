package compositions.compositionChallenge1;

public class Monitor {
    String msg;

    public Monitor(String msg) {
        this.msg = msg;
    }

    public void display(String msg) {
        System.out.println(msg);
    }

    @Override
    public String toString() {
        return "Monitor{" +
                "msg='" + msg + '\'' +
                '}';
    }
}
