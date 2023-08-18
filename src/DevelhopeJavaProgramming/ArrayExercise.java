package DevelhopeJavaProgramming;

public class ArrayExercise {
    public static void main(String[] args){
        String[] carBrands = {"BMW", "Ford", "Toyota", "Mercedes-Benz", "Tesla"};
        System.out.println("the famous car brands are:");
        for (int n = 0; n < carBrands.length; n++ ) {
            System.out.println(carBrands[n]);
        }
        System.out.println("Third member of the brand is" + carBrands[2]);
        int[] primeNumbers = new int[6];
        primeNumbers[0] = 2;
        primeNumbers[1] = 3;
        primeNumbers[2] = 5;
        primeNumbers[3] = 7;
        primeNumbers[4] = 11;
        primeNumbers[5] = 13;
        for (int primeNumber: primeNumbers){
            System.out.println(primeNumber);
        }
    }
}
