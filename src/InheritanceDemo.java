import java.util.ArrayList;

public class InheritanceDemo {

    public static void main(String[] args) {

        ArrayList<Worker> employees = new ArrayList<>();

        Worker mark = new Worker("Mark", "Smith", "000001",
                "Mr.", 1990, 44.0);
        Worker john = new Worker("John", "Johnson", "000002",
                "Mr.", 1980, 42.0);
        Worker sarah = new Worker("Sarah", "Conning", "000003",
                "Mrs.", 1993, 45.0);

        SalaryWorker mikey = new SalaryWorker("Mikey", "Mores",
                "000004", "Mr.", 1995, 0, 85000);
        SalaryWorker hannah = new SalaryWorker("Hannah", "Montanna",
                "000004", "Mrs.", 1996, 0, 95000);
        SalaryWorker leslie = new SalaryWorker("Leslie", "Marks",
                "000004", "Mrs.", 1995, 0, 88000);

        employees.add(mark);
        employees.add(john);
        employees.add(sarah);
        employees.add(mikey);
        employees.add(hannah);
        employees.add(leslie);

        for (Worker e:employees) {
            System.out.println(e.displayWeeklyPay(40));
            System.out.println(e.displayWeeklyPay(50));
            System.out.println(e.displayWeeklyPay(40));

        }

    }

}
