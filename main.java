package studentManagement;

import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        StudentManage s1=new StudentManage();
        Scanner sc=new Scanner(System.in);
        int n;

        do {
            System.out.println();
            System.out.println("--------  WELCOME IN Student MANAGEMENT LIST---------");
            System.out.println();
            System.out.println();
            System.out.println("1.  Adding the student");
            System.out.println("2.  removing the student i ");
            System.out.println("3.  seraching of student ");
            System.out.println("4.  avg Grade of student ");
            System.out.println("5.  Display all students ");
            System.out.println("6.  Exit");
            n =sc.nextInt();
            switch (n)
            {
                case 1:
                    System.out.print("Enter your name -> ");
                    String studName=sc.nextLine();

                    System.out.print("Enter your Roll Number --> ");
                    int studRoll=sc.nextInt();

                    System.out.print("Enter the Number of subjects--> ");
                    int subNum=sc.nextInt();

                    String [] stuSubs=new String[subNum];
                    for(int i=0;i<subNum;i++){
                        stuSubs[i]=new nextLine();
                    }
                    float [] stuMarks=new float[subNum];
                    for(int i=0;i<subNum;i++){
                        stuMarks[i]=new nextFloat();
                    }
                    s1.addStudent(studName, studRoll, stuSubjs, stuMarks);
                    break;
                case 2:
                    System.out.print("Roll Number of the student");
                    int rollNum=sc.nextInt();
                    s1.removestudent(rollNum);
                    break;
                case 3:
                    System.out.print("Roll Number of student");
                    int rollNum3=sc.nextInt();
                    s1.searching(rollNum3);
                    break;
                case 4:
                    System.out.print("Grade for all ");
                    s1.averageGrade(rollNum2);
                    break;
                case 5:
                    s1.display();
                    break;
                case 6:
                    System.out.println("Type bitween 1-6");
                    break;
            }

        }
        while (n != 6);
    }
}
