import java.time.YearMonth;

abstract public class BaseEmployee {

    String name;
    String surname;
    int baseSalary;
    private int yearOfEmployment;
    final int DEFAULT_BASE_SALARY = 3000;
    int currentYear = YearMonth.now().getYear();

    public BaseEmployee(String name, String surname, int baseSalary, int yearOfEmployment){
        this.name = name;
        this.surname = surname;
        this.baseSalary = baseSalary;
        this.yearOfEmployment = yearOfEmployment;
    }

    abstract int calculateMonthlySalary();

    public int getBaseSalary(){
        return this.baseSalary;
    }

    public int getLenghtOfEmployment(){
        return this.currentYear - this.yearOfEmployment;
    }


}

