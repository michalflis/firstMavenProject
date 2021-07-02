public class Manager extends BaseEmployee {

    public int bonus = 500;
    final static int DEFAULT_MANAGER_SALARY = 5000;
    int monthlySalary;

    public Manager(String name, String surname, int baseSalary, int yearOfEmployment) {
        super(name, surname, baseSalary, yearOfEmployment);

    }

     int calculateMonthlySalary() {
         if (baseSalary <= 0) {
             baseSalary = DEFAULT_MANAGER_SALARY;
         }

         return monthlySalary = baseSalary + this.bonus;

    }

    public void setBonus(int bonus) {
        this.bonus = bonus;
    }

}
