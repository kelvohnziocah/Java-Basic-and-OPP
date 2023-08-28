package DevelhopeJavaProgramming;

import java.util.Scanner;

public class TesterHouseEncus {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        HouseEncuspulation house = new HouseEncuspulation();

        System.out.println("please add the address");
        String houseAddress = scanner.nextLine();
        house.setAddress(houseAddress);

        System.out.println("please add the number of Floors");
        int houseFloors = scanner.nextInt();
        house.setNumberOfFloors(houseFloors);

        scanner.nextLine();

        System.out.println("please add residents names separated by commas");
        String residentsInput = scanner.nextLine();
        String[] residentsNames = residentsInput.split(",");
        house.setResidentsNames(residentsNames);

        house.printDetails();

        scanner.close();
    }
}
