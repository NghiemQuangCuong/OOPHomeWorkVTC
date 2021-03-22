import java.text.DecimalFormat;

public class Administrator extends Employee
{
    private String department;

    public Administrator(int payrollNumber, String name, double basicMonthlySalary,
        String department)
    {
        super(payrollNumber, name, basicMonthlySalary);
        this.department = (!department.trim().equals("")) ? department : "null";
    }

    public void setDepartment(String department) 
    {
        this.department = (!department.trim().equals("")) ? department : this.department;
    }

    @Override
    public double getMonthSalary()
    {
        return 1.2 * basicMonthlySalary;
    }

    @Override
    public String getInfo()
    {
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        return String.format("%-15d %-25s %20s$ %25s %20s$", payrollNumber, name, df.format(basicMonthlySalary),
            department, df.format(getMonthSalary()));
    }
}
