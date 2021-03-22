import java.text.DecimalFormat;

public class MainP 
{
    public static void main(String[] args) 
    {
        Programmer emp1 = new Programmer(100, "John", 3000, "C/C++");
        Programmer emp2 = new Programmer(101, "Smith", 2750, "C#");
        Programmer emp3 = new Programmer(102, "Tim", 2600, "Java");
        Administrator emp4 = new Administrator(103, "Jenn", 3500, "UX/UI");
        Administrator emp5 = new Administrator(104, "Grunt", 3600, "Tools");
        Administrator emp6 = new Administrator(105, "Paul", 3400, "Marketing");
        ProjectLeader emp7 = new ProjectLeader(106, "Adam", 3100, "Kotlin");
        ProjectLeader emp8 = new ProjectLeader(107, "Mint", 3000, "Swift");
        ProjectLeader emp9 = new ProjectLeader(108, "Lorance", 2900, "PHP");
        ProjectLeader emp10 = new ProjectLeader(108, "&&&&&&", 2900, "&&&");

        SoftwareHouse sh = new SoftwareHouse("M&T");
        sh.addEmployee(emp1);
        sh.addEmployee(emp2);
        sh.addEmployee(emp3);
        sh.addEmployee(emp4);
        sh.addEmployee(emp5);
        sh.addEmployee(emp6);
        sh.addEmployee(emp7);
        sh.addEmployee(emp8);
        sh.addEmployee(emp9);
        sh.addEmployee(emp10);

        System.out.println("----------------------------------------------------------");
        sh.displayAllStaff();
        System.out.println("----------------------------------------------------------");
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        System.out.printf("Total money: %20s$\n", df.format(sh.getMonthlySalaryBill()));
        System.out.println("----------------------------------------------------------");
        sh.sortAllStaffByName();
        sh.displayAllStaff();
        System.out.println("----------------------------------------------------------");
        sh.displayListProgrammer();
        System.out.println("----------------------------------------------------------");
        sh.updateDepartmentForAdmin(105, "New Marketing");
        sh.displayAllStaff();
        System.out.println("----------------------------------------------------------");
        
    }
}
