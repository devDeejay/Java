package CloneableTutorial;

public class StormTrooper implements Cloneable {

    String color = "White";
    String master = "Darth Vader";

    StormTrooper() {
        System.out.println("Welcome to the Dark Side");
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        StormTrooper trooper = null;
        try {
            trooper = (StormTrooper) super.clone();
            // New Object master will be the same as cloning object's Master
            trooper.master = this.master;
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return trooper;
    }
}
