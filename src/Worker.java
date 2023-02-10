public class Worker extends Person {
    private double hourlyPayRate;

    public Worker(String firstName, String lastName, String ID, String title, int birthYear, double hourlyPayRate) {
        super(firstName, lastName, ID, title, birthYear);
        this.hourlyPayRate = hourlyPayRate;
    }

    public double calculateWeeklyPay(double hoursWorked) {
        double returnPay;
        returnPay = hoursWorked * hourlyPayRate;
        return returnPay;
    }

    public String displayWeeklyPay(double hoursWorked) {
        double overTime = 0;
        double regPay;
        double overTimePay;
        double totalPay;

        if (hoursWorked > 40) {
            overTime = hoursWorked-40;
            hoursWorked = 40;
        }

        regPay = hoursWorked * hourlyPayRate;
        overTimePay = overTime*(1.5*hourlyPayRate);
        totalPay = regPay+overTimePay;

        return getFormalName() + "\n" +
                hoursWorked + " hours regular pay $" + regPay +
                "\n" + overTime + " hours overtime pay $"
                + overTimePay + "\nTotal $" + totalPay + "\n";
    }
}