package vit.placement.java;

public class Class {

    public int noOfStudents;
    public static String schoolName = "Excellent";

    public Class(int noOfStudents){
        this.noOfStudents = noOfStudents;
    }

    public static int schoolNameLength(){
        return schoolName.length();
    }

}
