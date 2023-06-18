package co.develhope.introduction;

public class NumberOperations {
    public static void main(String[] args){
        int a = 15;
        a += 5;
        a -= 4;
        int b = a;
        b += 1;
        boolean oddNumber = (b%2 != 0); //checking if b is odd number
        int result = (b * b+1);
        boolean multipleOfThree = (result % 3 == 0);
        if (multipleOfThree && oddNumber) {
            System.out.println("True");
        }
        else {
            System.out.println("false");
        }
    }
}
