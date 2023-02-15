package Arrays;

public class Ship {
    int size = 0;
    String name = "new";

    public Ship(String name, int size) {
        this.size = size;
        this.name = name;
    }

    public Ship(String name) {
        this.name = name;
    }
    public Ship(int size) {
        this.size = size;
         }

    public String getShipName() {
        return name;
    }

    public int getShipSize() {
        return size;
    }

}
