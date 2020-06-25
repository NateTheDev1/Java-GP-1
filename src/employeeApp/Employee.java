package employeeApp;

public class Employee {
    // Fields
    // Static keyword purpose: 1. Static shared across all the objects 2. If it changes it changes for all objects
    private static int maxId = 0;
    private int id;
    private String fname;
    private String lname;
    private double salary;
    private boolean has401K;
    private int companyId;
    private int healthPlanId;


    // Constructor with initial values
    public Employee(String fname, String lname, double salary, boolean has401K, int companyId, int healthPlanId)
    {
        // Save these, only exists in this method so you need to save it
        maxId++;
        // Dont have to use this, theres no confusion with params
        id = maxId;
        this.fname = fname;
        this.lname = lname;
        this.salary = salary;
        this.has401K = has401K;
        this.companyId = companyId;
        this.healthPlanId = healthPlanId;
    }

    // Getter Methods
    public int getId()
    {
        return id;
    }

    public String getFname()
    {
        return fname;
    }
    
    public String getLname()
    {
        return lname;
    }

    public double getSalary()
    {
        return salary;
    }

    public boolean getHas401K()
    {
        return has401K;
    }

    public int getCompanyId()
    {
        return companyId;
    }

    public int getHealthPlanId()
    {
        return healthPlanId;
    }

    // Setter Methods
    // void means it returns nothing
    public void setFname(String fname)
    {
        this.fname = fname;
    }

    public void setLname(String lname)
    {
        this.lname = lname;
    }

    public void setSalary(double salary)
    {
        this.salary = salary;
    }

    public void setHas401K(boolean has401K)
    {
        this.has401K = has401K;
    }

    public void setCompanyId(int companyId)
    {
        this.companyId = companyId;
    }

    public void setHealthPlanId(int healthPlanId)
    {
        this.healthPlanId = healthPlanId;
    }

    // other method
    public String getName()
    {
        // Single quotes are for characters, double quotes are for Strings
        return fname + " " + lname;
    }
}