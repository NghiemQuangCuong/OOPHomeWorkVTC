import java.text.DecimalFormat;

public class Programmer extends Employee
{
    public String language;

    public Programmer(int payrollNumber, String name, double basicMonthlySalary,
         String language)
    {
        super(payrollNumber, name, basicMonthlySalary);

        this.language = (!language.trim().equals("")) ? language : "null";
    }

    @Override
    public double getMonthSalary()
    {
        return (language.equals("Java")) ? 1.2 * basicMonthlySalary : basicMonthlySalary;
    }

    @Override
    public String getInfo()
    {
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        return String.format("%-15d %-25s %20s$ %25s %20s$", payrollNumber, name, df.format(basicMonthlySalary),
            language, df.format(getMonthSalary()));
    }
}
