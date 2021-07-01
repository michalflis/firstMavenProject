public class TicketSeller extends BaseEmployee {

    public TicketSeller(String name, String surname, int baseSalary, int yearOfEmployment) {
        super(name, surname, baseSalary, yearOfEmployment);
    }

    int calculateMonthlySalary() {
        if (baseSalary <= 0) {
            baseSalary = DEFAULT_BASE_SALARY;
        }
        return baseSalary;

    }
}
