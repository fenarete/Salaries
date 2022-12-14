public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int calculateWage(int extraHours){

        return baseSalary + (hourlyRate * extraHours);
    }

    public void setBaseSalary(int baseSalary) {
        if (baseSalary <= 0)
            throw new IllegalArgumentException("Salary cannot be zero or less.");
        this.baseSalary = baseSalary;
    }

    public int getBaseSalary() {

        return baseSalary;
    }

    public void setHourlyRate(int hourlyRate) {
        if (hourlyRate < 0)
            throw new IllegalArgumentException("Hourly rate cannot be less than zero.");
        this.hourlyRate = hourlyRate;
    }

    public int getHourlyRate() {

        return hourlyRate;
    }
}
