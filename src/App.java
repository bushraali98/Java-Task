public class App {
    public static void main(String[] args) throws Exception {
        FullTimeEmployee employee = new FullTimeEmployee("Ahmad", "Accountent", 5000, 5, "Bachelor Degree");
        double fullTimeSalary = employee.calculateSalary();
        double fullTimeBonus = employee.calculateBonus();

        PartTimeEmployee Employee = new PartTimeEmployee("Sara", "Assistant", 3000, 3, "Diploma");
        double partTimeSalary = Employee.calculateSalary();
        double partTimeBonus = Employee.calculateBonus();

        System.out.println("Full-Time Employee: ");
        System.out.println("Salary: $" + fullTimeSalary);
        System.out.println("Bonus: $" + fullTimeBonus);

        System.out.println("\nPart-Time Employee: ");
        System.out.println("Salary: $" + partTimeSalary);
        System.out.println("Bonus: $" + partTimeBonus);
    }
}
