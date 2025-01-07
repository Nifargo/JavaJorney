package compositions.compositionChallenge2;

public class Oven {

    private boolean hasWorkToDo;

    public void setHasWorkToDo(boolean hasWorkToDo) {
        this.hasWorkToDo = hasWorkToDo;
    }

    public void bakeSomeCookies() {
        if (hasWorkToDo) {
            System.out.println("Oven is baking some cookies");
            hasWorkToDo = false;
        } else {
            System.out.println("Oven is not baking any cookies");
        }
    }
}
