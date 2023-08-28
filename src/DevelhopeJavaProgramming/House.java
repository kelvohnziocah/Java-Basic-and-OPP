package DevelhopeJavaProgramming;

public class House {
    private String address;
    private int numberOfFloors;
    public House(String address, int numberOfFloors){
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        System.out.println("Constructor has been created");
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setNumberOfFloors(int numberOfFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    public static void main(String[] args){
        String houseAddress;
        int houseFloors;
        House house = new House("Street 1", 8);
        House house1 = new House("street 3", 3);
        System.out.println("the street is" + house.getAddress() + "number of floors" + house.getNumberOfFloors());
        System.out.println("the street is" + house1.getAddress() + "number of floors" + house1.getNumberOfFloors());

    }

}

