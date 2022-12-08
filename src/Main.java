public class Main {
    public static void main (String[] args) {
        var employee = new Employee();
        employee.setBaseSalary(50);
        employee.setHourlyRate(20);
        int wage = employee.calculateWage(5);
        System.out.println("The wage is: " + wage + ".");
    }
}