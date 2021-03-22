import java.text.DecimalFormat;

public class ProjectLeader extends Programmer
{
    public ProjectLeader(int payrollNumber, String name, double basicMonthlySalary,
        String language)
    {
        super(payrollNumber, name, basicMonthlySalary, language);
    }

    @Override
    public double getMonthSalary()
    {
        return 1.4 * basicMonthlySalary;
    }

    @Override
    public String getInfo()
    {
        DecimalFormat df = new DecimalFormat("#,###,###.000");
        return String.format("%-15d %-25s %20s$ %25s %20s$", payrollNumber, name, df.format(basicMonthlySalary),
            language, df.format(getMonthSalary()));
    }
}
