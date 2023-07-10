package co.develhope.introduction;

import java.util.HashMap;
import java.util.*;

public class StudentStatisticsStorage {
    public static void main(String[] args){
        studentDetails();
    }
    public static void studentDetails(){
        Map<String, Integer> studentDetails = new HashMap<>();
        studentDetails.put("nzioka", 70);
        studentDetails.put("Maron", 72);
        System.out.println(studentDetails);
    }

}
