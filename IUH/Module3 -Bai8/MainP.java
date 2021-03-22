import java.util.ArrayList;

public class MainP 
{
    public static void main(String[] args) 
    {
        Enrolment enr1 = new Enrolment(new Student("Hoang", "Dung", "140211", 2014), "BT", "1", 8.5);
        Enrolment enr2 = new Enrolment(new Student("Tran", "Binh", "140511", 2014), "BT", "1", 9.5);
        Enrolment enr3 = new Enrolment(new Student("Le", "Huynh", "140811", 2014), "BT", "1", 7.0);
        Enrolment enr4 = new Enrolment(new Student("Ho", "Huyen", "140611", 2014), "BT", "1", 5.5);

        ArrayList<Enrolment> listEnrolment = new ArrayList<>();
        listEnrolment.add(enr1);
        listEnrolment.add(enr2);
        listEnrolment.add(enr3);
        listEnrolment.add(enr4);

        Faculty fac1 = new Faculty("Khanh", "Le Kim", "140224", "CNTT");
        Section sect1 = new Section("0602", "I (2015 - 2016)", "H5.01", fac1, listEnrolment);

        Course course = new Course("175", "OOP - Lap Trinh Huong Doi Tuong", 1500);
        course.addSection(sect1);

        course.printCourseInfo();
    }
    
}
