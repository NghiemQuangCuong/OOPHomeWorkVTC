import java.util.ArrayList;

public class Course 
{
    private String courseNumber;
    private String courseTitle;
    private int credits;
    private ArrayList<Section> section;

    public Course(String courseNumber, String courseTitle, int credits)
    {
        this.courseNumber = (!courseNumber.trim().equals("")) ? courseNumber : "null";
        this.courseTitle = (!courseTitle.trim().equals("")) ? courseTitle : "null";
        this.credits = (credits > 0) ? credits : 0;
        section = new ArrayList<>();
    }

    public void addSection(String sectionNumber, String semester, String room, Faculty faculty, ArrayList<Enrolment> listEnrolment)
    {
        section.add(new Section(sectionNumber, semester, room, faculty, listEnrolment));
    }

    public void addSection(Section sec)
    {
        section.add(sec);
    }

    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = (!courseNumber.trim().equals("")) ? courseNumber : this.courseNumber;
    }

    public String getCourseTitle() {
        return courseTitle;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = (!courseTitle.trim().equals("")) ? courseTitle : this.courseTitle;
    }

    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = (credits > 0) ? credits : this.credits;
    }

    public ArrayList<Section> getSection() {
        return section;
    }

    public void printCourseInfo()
    {
        System.out.println("Khoa hoc : " + courseTitle + "(" + section.size() + "TC)");
        for (Section sec : section)
            System.out.println(sec.getInfo());
    }
}
