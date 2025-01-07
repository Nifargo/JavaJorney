package compositions.compositionChallenge2;

public class Microwave {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void makeSomeLunch() {
        if (hasWorkToDo) {
            System.out.println("Microwave is making some lunch");
            hasWorkToDo = false;
        } else {
            System.out.println("Microwave is not making any lunch");
        }
    }
}
