package ps9.manager2;

import ps9.manager1.Employee;

// This problem builds on the class from the previous project.
//
// The manager class is a subclass of Employee. A Manager is different from an employee in that
// a Manager has a bonus. So we add that instance variable
//
// In the previous problem you added the code to complete the constructor
// Now override the getSalary method to return the total of the salary and bonus
//
public class Manager extends Employee
{
    private double bonus;

    /**
     * Constructs a Manager
     * @name the name of the manager
     * @salary the salary of this manager
     * @param theBonus the bonus for this Manager
     */
    public Manager(String name, double salary, double theBonus)
    {
        // TODO: complete the constructor
    	super(name, salary);
    	bonus = theBonus;
    }

    public double getBonus()
    {
        return bonus;
    }

     // Gets the total salary for this Manager
     // that is the salary + the bonus

    public double getSalary()
    {
        // TODO: finish the method implementation
    	return super.getSalary() + bonus;
    }
}