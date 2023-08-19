package co.develhope.introduction;

public class IfStatementExer {
    public static void main(String[] args){
        String myName = "Kelvin";
        int myNameChars = myName.length();
        if (myNameChars % 2 == 0) {
            System.out.println("my name has even mumber of chars");
        }
        else {
           System.out.println ("my name has odd number of chars");
        }
    }
}
