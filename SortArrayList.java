import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class SortArrayList {

    public static void main(String[] args) {
        ArrayList<Student> arraylist = new ArrayList<Student>();
        arraylist.add(new Student(101, "Zues", 26));
        arraylist.add(new Student(505, "Abey", 24));
        arraylist.add(new Student(809, "Vignesh", 32));

        /*Sorting based on Student Name*/
        System.out.println("Student Name Sorting:");
        Collections.sort(arraylist, Student.StuNameComparator);

        for(Student str: arraylist){
            System.out.println(str);
        }

        /* Sorting on Rollno property*/
        System.out.println("RollNo Sorting:");
        Collections.sort(arraylist, Student.StuRollno);
        for(Student str: arraylist){
            System.out.println(str);
        }

    }

}

class Student{
    int rollno;
    String name;
    int age;
    Student(int rollno, String name, int age){
        this.rollno = rollno;
        this.name = name;
        this.age = age;
    }

    public String toString(){
        return rollno+" "+name+" "+age;
    }

    /*Comparator for sorting the list by Student Name*/
    public static Comparator<Student> StuNameComparator = new Comparator<Student>() {

        public int compare(Student s1, Student s2) {
            String StudentName1 = s1.name.toUpperCase();
            String StudentName2 = s2.name.toUpperCase();

            //ascending order
            return StudentName1.compareTo(StudentName2);

            //descending order
            //return StudentName2.compareTo(StudentName1);
        }};

    /*Comparator for sorting the list by roll no*/
    public static Comparator<Student> StuRollno = new Comparator<Student>() {

        public int compare(Student s1, Student s2) {

            int rollno1 = s1.rollno;
            int rollno2 = s2.rollno;

            /*For ascending order*/
            return rollno1-rollno2;

            /*For descending order*/
            //rollno2-rollno1;
        }};
}