package DevelhopeJavaProgramming;

public class Person {
    private String name;
    private int age;
    public Person (String name, int age){
        this.name = name;
        this.age = age;
    }
    //getters and setters
    public String getName(){
        return name;
    }
    public int getAge(){
        return age;
    }
}
class Student extends Person{
    private int StudentsID;
    public Student(String name, int age, int StudentsID) {
        super(name, age);
        this.studentID = studentID;
    }
    public int getStudentsID(){
        return StudentsID;
    }
    public void displayStudentInformation(){
        System.out.println("Students Information")
        System.out.println("name:"+ getName());
        System.out.println("age:"+ getAge());
        System.out.println("Student ID:"+ getStudentsID());
    }
}
class Teacher extends Person{
    private String subject;
    public Teacher(String name, int age, String subject) {
        super(name, age);
        this.subject = subject;
    }
    public String getsubject(){
        return subject;
    }
    //method to display teachers information
    public void displayTeachersContent(){
        System.out.println("Teachers Information")
        System.out.println("name:"+ getName());
        System.out.println("age:"+ getAge());
        System.out.println("subject:"+ getsubject());
    }
}