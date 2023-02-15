package Arrays;

public class Main extends Player {
    public static void main(String[] args) {
        Ship shipOne = new Ship("Odnopalubnic", 1);
        System.out.println(shipOne.getShipName());
        System.out.println(shipOne.getShipSize());
        Ship shipTwo = new Ship("Dvuhpalubnilk", 2);
        System.out.println(shipTwo.getShipName());
        System.out.println(shipTwo.getShipSize());
        Ship shipOnlyNameOne = new Ship("Odnopalubnic");
        System.out.println(shipOnlyNameOne.getShipName());

    }
}
