import java.util.*;
import java.io.*;
public class FileReader
{
    public ArrayList<Student> loadStudents(String fileName)
    {
        ArrayList<Student> Students= new ArrayList<>();
        File StuCSV = new File(fileName);
        try(Scanner inFS = new Scanner(StuCSV))
        {
            inFS.nextLine();
            while(inFS.hasNextLine())
            {
                String row = inFS.nextLine();
                String[]vals = row.split(",");
                int id = Integer.parseInt(vals[0]);
                String name = vals[1];
                String natnlty = vals[2];
                String email = vals[3];
                int deptID = Integer.parseInt(vals[4]);
                int advID = Integer.parseInt(vals[5]);
                Student stu = new Student(id, name, natnlty, email, deptID, advID);
                Students.add(stu);
            }
        }
        catch (IOException e)
        {
            System.out.println("Invalid file name: "+fileName);
        }
        return Students;
    }
    
    public ArrayList<Teacher> loadTeachers(String fileName)
    {
        ArrayList<Teacher> Teachers= new ArrayList<>();
        File TeachCSV = new File(fileName);
        try(Scanner inFS = new Scanner(TeachCSV))
        {
            inFS.nextLine();
            while(inFS.hasNextLine())
            {
                String row = inFS.nextLine();
                String[]vals = row.split(",");
                int id = Integer.parseInt(vals[0]);
                String name = vals[1];
                String email = vals[2];
                int deptID = Integer.parseInt(vals[3]);
                int roomNum = Integer.parseInt(vals[4]);
                Teacher teach = new Teacher(id, name, email, deptID, roomNum);
                Teachers.add(teach);
            }
        }
        catch (IOException e)
        {
            System.out.println("Invalid file name: "+fileName);
        }
        return Teachers;
    }
    
    public ArrayList<Course> loadCourses(String fileName)
    {
        ArrayList<Course> Courses = new ArrayList<>();
        File CourseCSV = new File(fileName);
        try(Scanner inFS = new Scanner(CourseCSV))
        {
            inFS.nextLine();
            while(inFS.hasNextLine())
            {
                String row = inFS.nextLine();
                String[]vals = row.split(",");
                int id = Integer.parseInt(vals[0]);
                String name = vals[1];
                int instrID = Integer.parseInt(vals[2]);
                Course crs = new Course(id, name, instrID);
                Courses.add(crs);
            }
        }
        catch (IOException e)
        {
            System.out.println("Invalid file name: "+fileName);
        }
        return Courses;
    }
    
    public ArrayList<Department> loadDepartments(String fileName)
    {
        ArrayList<Department> Departments = new ArrayList<>();
        File DeptCSV = new File(fileName);
        try(Scanner inFS = new Scanner(DeptCSV))
        {
            inFS.nextLine();
            while(inFS.hasNextLine())
            {
                String row = inFS.nextLine();
                String[]vals = row.split(",");
                int id = Integer.parseInt(vals[0]);
                String name = vals[1];
                int dcID = Integer.parseInt(vals[2]);
                Department dept = new Department(id, name, dcID);
                Departments.add(dept);
            }
        }
        catch (IOException e)
        {
            System.out.println("Invalid file name: "+fileName);
        }
        return Departments;
    }
}
