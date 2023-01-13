public class Tester {

    public static void main(String[] args){

    House house1 = new House();
        house1.address = "Via con strada n.5";
        house1.numberOfFloors = 2;

        System.out.println("Address house1: " + house1.address);
        System.out.println("Floors: " + house1.numberOfFloors);

    House house2 = new House();
        house2.address = "Via senza strda n.43";
        house2.numberOfFloors = 3;

        System.out.println("Address house2: " +  house2.address);
        System.out.println("Floors: " + house2.numberOfFloors);


    }

}
