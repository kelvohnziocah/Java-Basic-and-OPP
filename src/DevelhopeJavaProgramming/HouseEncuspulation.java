package DevelhopeJavaProgramming;

public class HouseEncuspulation {
    private static String address;
    private static int numberOfFloors;
    private static String [] residentsNames;
    public HouseEncuspulation (){
        this.address = address;
        this.numberOfFloors = numberOfFloors;
        this.residentsNames = residentsNames;
    }

    public String getAddress() {
        return address;
    }

    public int getNumberOfFloors() {
        return numberOfFloors;
    }

    public void setAddress(String houseAddress) {
        this.address = address;
    }

    public String[] getResidentsNames() {
        return residentsNames;
    }

    public void setResidentsNames(String[] residentsNames) {
        this.residentsNames = residentsNames;
    }

    public void setNumberOfFloors(int houseFloors) {
        this.numberOfFloors = numberOfFloors;
    }
    public void printDetails() {
        String residents = String.join(", ", residentsNames);
        System.out.printf("House Details:%nAddress: %s%nFloors: %d%nResidents: %s%n",
                getAddress(), getNumberOfFloors(), String.join(", ", getResidentsNames()));
    }
}
