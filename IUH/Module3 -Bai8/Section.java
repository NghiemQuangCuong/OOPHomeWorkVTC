import java.util.ArrayList;

public class Section 
{
    private String sectionNumber;
    private String semester;
    private String room;
    private Faculty faculty;
    private ArrayList<Enrolment> listEnrolment;

    public Section(String sectionNumber, String semester, String room, Faculty faculty)
    {
        this.sectionNumber = (!sectionNumber.trim().equals("")) ? sectionNumber : "null";
        this.semester = (!semester.trim().equals("")) ? semester : "null";
        this.room = (!room.trim().equals("")) ? room : "null";
        this.faculty = faculty;
        listEnrolment = new ArrayList<>();
    }

    public Section(String sectionNumber, String semester, String room, Faculty faculty, ArrayList<Enrolment> listEnrolment)
    {
        this.sectionNumber = (!sectionNumber.trim().equals("")) ? sectionNumber : "null";
        this.semester = (!semester.trim().equals("")) ? semester : "null";
        this.room = (!room.trim().equals("")) ? room : "null";
        this.faculty = faculty;
        this.listEnrolment = (listEnrolment == null) ? new ArrayList<>() : listEnrolment;
    }

    public String getSectionNumber() {
        return sectionNumber;
    }

    public void setSectionNumber(String sectionNumber) {
        this.sectionNumber = (!sectionNumber.trim().equals("")) ? sectionNumber : this.sectionNumber;
    }

    public String getSemester() {
        return semester;
    }

    public void setSemester(String semester) {
        this.semester = (!semester.trim().equals("")) ? semester : this.semester;
    }

    public String getRoom() {
        return room;
    }

    public void setRoom(String room) {
        this.room = (!room.trim().equals("")) ? room : this.room;
    }

    public Faculty getFaculty() {
        return faculty;
    }

    public void setFaculty(Faculty faculty) {
        this.faculty = faculty;
    }

    public ArrayList<Enrolment> getListEnrolment() {
        return listEnrolment;
    }

    public void setListEnrolment(ArrayList<Enrolment> listEnrolment) {
        this.listEnrolment = listEnrolment;
    }

    public String getInfo()
    {
        String result = "";
        result += "===== Thong tin hoc phan =====\n";
        result += "Ma hoc phan: " + sectionNumber + "\n";
        result += "Hoc ky: " + semester + "\n";
        result += "Phong hoc: " + room + "\n";
        result += "Giang vien: " + faculty.getFirstName() + " " + faculty.getLastName() 
                + " (Khoa : " + faculty.getOffice() + ")\n";
        result += "===== Danh sach hoc vien =====\n";
        result += String.format("%-15s %-25s %15s %15s\n", "Ma SV", "Ho ten", "Khoa nam", "Diem");
        for (Enrolment enrolment : listEnrolment)
            result += enrolment.getInfo() + "\n";
        result += "Tong so sinh vien: " + listEnrolment.size() +"\n";
        return result;
    }
}
