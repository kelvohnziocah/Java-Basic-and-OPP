package DevelhopeJavaProgramming;

import static java.lang.System.exit;

public class WhileLoopExercise {
    public static void main(String[] args){
        double exchangeRate = 1 + (Math.random() * 0.2);
        int numberOfDays = 0;
        int totalPounds = 10000;
        while (totalPounds > 0){
            numberOfDays ++;
            exchangeRate = 1 + (Math.random() * 0.2);
            if (totalPounds >= 0 && exchangeRate > 1.15){
                totalPounds -= 1000;
            }
        }
        System.out.println("Total number of Days is:" +numberOfDays);
    }
}
