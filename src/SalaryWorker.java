public class SalaryWorker extends Worker {

    double annualSalary;
    public SalaryWorker(String firstName, String lastName, String ID, String title, int birthYear, double hourlyPayRate, double annualSalary) {
        super(firstName, lastName, ID, title, birthYear, hourlyPayRate);
        this.annualSalary = annualSalary;
    }
    @Override
    public double calculateWeeklyPay(double hoursWorked) {
        double returnPay;
        returnPay = annualSalary/52;
        return returnPay;
    }

    @Override
    public String displayWeeklyPay(double hoursWorked) {
        double weeklyPay;
        weeklyPay = annualSalary/52;

        return getFormalName() + "\nWeekly pay is $" + weeklyPay + "\n";
    }
}
