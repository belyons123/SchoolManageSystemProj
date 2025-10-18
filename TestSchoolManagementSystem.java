import java.io.*;
import java.util.*;
public class TestSchoolManagementSystem
{
    public static void main(String[]args)
    {
        System.out.println("Testing SchoolManagementSystem:\n");
        SchoolManagementSystem manager = new SchoolManagementSystem();
        String maxDept = manager.deptWithMaxStudents();
        System.out.println("Department with most students: "+maxDept);
        System.out.println();
        String minTeach = manager.teachWithLeastStu();
        System.out.println("Teacher advising fewest students: "+minTeach);
        System.out.println();
        System.out.println("Department chairs:");
        manager.printDeptChairs();
        System.out.println();
        System.out.println("Students Missing Nationality: "+ manager.numStuMissingNat());
        System.out.println();
        System.out.println("Course instructors:");
        manager.printCourseInstrs();
    }
}
