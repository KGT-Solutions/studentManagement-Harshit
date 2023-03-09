package studentManagement;
import java.util.ArrayList;
import java.util.Scanner;

public class Student {
    String name;
    int rollNo;
    ArrayList<Subject> subjects=new ArrayList<>();
    float avgGradeOfStudent;
    
    Student(String name, int rollno, String[] subj, float[] marks){
        this.name=name;
        this.rollNo=rollno;
        for(int i=0;i<subj.length; i++){
            Subject subject =new Subject(subj[i], marks[i]);
            subjects.add(subject);
            avgGradeOfStudent+=marks[i];
        }
        avgGradeOfStudent=avgGradeOfStudent/subj.length;
    }


}
