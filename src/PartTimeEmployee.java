public class PartTimeEmployee extends Employee {
    public PartTimeEmployee(String name, String position, double Salary, int experience, String educationalLevel) {
        super(name, position, Salary, experience, educationalLevel);
    }

    @Override
    public double calculateBonus() {
        return getBasicSalary() * 0.015;
    }
}
