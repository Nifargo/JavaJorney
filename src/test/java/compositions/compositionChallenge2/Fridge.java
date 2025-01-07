package compositions.compositionChallenge2;

public class Fridge {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void makeSomeIce() {
        if (hasWorkToDo) {
            System.out.println("Fridge is making some ice");
            hasWorkToDo = false;
        } else {
            System.out.println("Fridge is not making any ice");
        }
    }
}
