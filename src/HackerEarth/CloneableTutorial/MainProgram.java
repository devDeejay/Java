package CloneableTutorial;

public class MainProgram {

    public static void main(String[] args) throws CloneNotSupportedException {

        StormTrooper stormTrooper1 = new StormTrooper();
        StormTrooper stormTrooper2 = stormTrooper1;
        StormTrooper stormTrooper3 = (StormTrooper) stormTrooper1.clone();

        // Default Master is Darth Vader
        // Default color is White

        System.out.println("StormTrooper 1 : " + stormTrooper1.master + " : " + stormTrooper1.color);
        System.out.println("StormTrooper 2 : " + stormTrooper2.master + " : " + stormTrooper2.color);
        System.out.println("StormTrooper 3 : " + stormTrooper3.master + " : " + stormTrooper3.color);
        System.out.println();

        // Changing the object1 now will not affect our new Cloned object 3 as it is already clones initially and is kept aside now.
        stormTrooper1.color = "black";
        stormTrooper1.master = "Skywalker";

        System.out.println("StormTrooper 1 : " + stormTrooper1.master + " : " + stormTrooper1.color);
        System.out.println("StormTrooper 2 : " + stormTrooper2.master + " : " + stormTrooper2.color);
        System.out.println("StormTrooper 3 : " + stormTrooper3.master + " : " + stormTrooper3.color);
        System.out.println();

        // Cloning A new object once the master and color has been changed for object1
        StormTrooper stormTrooper4 = (StormTrooper) stormTrooper1.clone();
        System.out.println("StormTrooper 4 : " + stormTrooper4.master + " : " + stormTrooper4.color);

    }

}
