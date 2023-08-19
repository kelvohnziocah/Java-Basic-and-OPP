package co.develhope.introduction;

public class StringHandling {
    public static void main (String[] args) {
        String string1 = "Hello";
        String string2 = "How  are you?";
        String charArray = string1.substring(0, 1) + string2.substring(10, 11);
        System.out.println("new string is" + charArray);
    }
}
