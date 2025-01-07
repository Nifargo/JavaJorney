package compositions.compositionChallenge2;

public class Main {
    public static void main(String[] args) {

        SmartKitchen smartKitchen = new SmartKitchen();

        smartKitchen.getFridge().setHasWorkToDo(true);
        smartKitchen.getFridge().makeSomeIce();

        smartKitchen.getOven().setHasWorkToDo(true);
        smartKitchen.getOven().bakeSomeCookies();

        smartKitchen.getMicrowave().setHasWorkToDo(true);
        smartKitchen.getMicrowave().makeSomeLunch();
    }
}
