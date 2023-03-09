package studentManagement;

import java.util.ArrayList;
import java.util.Scanner;


public class StudentManage{

    ArrayList<Student> studentsList=new ArrayList<>();

    //function for adding the student into student list
    public void addStudent(String name, int roll, String[] subj, float [] marks)
    {
        Student stud=new Student(name, roll, subj, marks);
        studentsList.add(temp);
    }

     // removing the student from the student list
     public void removestudent(int rollNum)
     {
         for (int i = 0; i <list.size(); i++)
         {
             if(list.get(i).rollNo==rollNum)
                 list.remove(i);
         }
     }


      //function for the getting the index
    public int getIndex(int rollNum)
    {
        for (int i = 0; i <list.size(); i++)
        {
            if(list.get(i).rollNo==(rollNum))
                return i;
        }
        return -1;
    }
    //function for searching
    public void searching(int rollNum)
    {
        int i=getIndex(rollNum);
        if(i== -1){
            return;
        }
        System.out.println("Searched Student Name & RollNo" + list.get(i).name + list.get(i).rollNo)
    }

    

    // display all students
    for(int i=0;i<studentsList.size();i++){
        Student stud=studentsList.get(i);
        System.out.println("Name :"+ stud.name + " Roll No :" + stud.rollNo)
    }



    // avg grades of all students
    public void averageGradeall()
    {
        float sum=0;  //for couting the grade
        for (int i = 0; i < studentsList.size(); i++) {
              sum+=list.get(i).avgGradeOfStudent;
        }
        float avg=sum / list.size();
        System.out.println("The average garde of all students  - "+avg);
    }
   
}
