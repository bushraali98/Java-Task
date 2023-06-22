public abstract class Employee {
    // creating the required fileds for the employee
    private String name;
    private String position;
    private double Salary;
    private int experience;
    private String educationalLevel;

    //Assigning values 
    public Employee(String name, String position, double Salary, int experience, String educationalLevel) {
    this.name = name;
    this.position = position;
    this.Salary = Salary;
    this.experience = experience;
    this.educationalLevel = educationalLevel;
    }

    // function to caculate the salary
    public double calculateSalary() {
    double salary = Salary + (Salary * 0.05 * experience);

    if (educationalLevel.equalsIgnoreCase("Bachelor Degree")) {
        salary += 500;
    } else if (educationalLevel.equalsIgnoreCase("Diploma")) {
        salary += 250;
    }
    return salary;
    }

    public abstract double calculateBonus();

    // Definig Getters and Setters
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPosition() {
        return position;
    }

    public void setPosition(String position) {
        this.position = position;
    }

    public double getBasicSalary() {
        return Salary;
    }

    public void setBasicSalary(double basicSalary) {
        this.Salary = basicSalary;
    }

    public int getExperience() {
        return experience;
    }

    public void setExperience(int experience) {
        this.experience = experience;
    }

    public String getEducationalLevel() {
        return educationalLevel;
    }

    public void setEducationalLevel(String educationalLevel) {
        this.educationalLevel = educationalLevel;
    }

}
