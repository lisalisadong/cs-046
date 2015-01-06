package ps9.manager1;

public class Employee
{
    private String name;
    private double salary;

    /**
     * Creates a default constructor with a empty string for the name and a salary of 0.0
     */
    public Employee()
    {
        name = "";
        salary = 0.0;
    }
    /**
     * Constructor for objects of class Employee
     * @param name the nbame of the employee
     * @param salary the salary of the employee
     */
    public Employee(String name, double salary)
    {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Gets the name of this employee
     * @return the name of the employee
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * Gets the salary of the employee
     * @return the salary of the employee
     */
    public double getSalary()
    {
        return salary;
    }
    
    public void setSalary(double amount)
    {
        salary = amount;
    }
}