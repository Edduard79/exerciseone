public class TestProgrammers {

    public static void main(String[] args) {

        Programmer prog1 = new Programmer();
        Programmer prog2 = new Programmer();

        prog1.name = "Marta";
        prog2.name = "Federico";

        prog1.age = 23;
        prog2.age = 27;

        prog1.wearsGlasses = true;
        prog2.wearsGlasses = false;

        //Print programmer1 info.

        prog1.drinkCoffee();
        prog1.printDetails();

        System.out.println("==============================");

        //Print programmer2 info

        prog2.printDetails();
        prog2.hasGlasses();

    }

}
