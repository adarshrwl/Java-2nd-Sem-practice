class TheEmployee {
    private String Firstname;
    private String Lastname;
    private int Salary;

    public String getFirstname() {
        return Firstname;
    }

    public String getLastname() {
        return Lastname;
    }

    public int getSalary() {
        return Salary;
    }

    public void setFirstname(String fname) {
        this.Firstname = fname;
    }

    public void setLastname(String lname) {
        this.Lastname = lname;
    }

    public void setSalary(int Salary) {
        this.Salary = Salary;
    }

}

public class emp {
    public static void main(String[] args) {
        TheEmployee emp = new TheEmployee();
        emp.setFirstname("Adarsh ");
        emp.setLastname("Rawal");
        emp.setSalary(100000000);
        System.out.println(emp.getFirstname());
        System.out.println(emp.getLastname());
        System.out.println(emp.getSalary());
        System.out.println(emp.getClass());
    }

}
