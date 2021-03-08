package employeeapp;
public class Main 
{
   public static void main(String[] args)
   {
        System.out.println("Welcome to Lambda School's Java Web 39!!!");
        Healthplan h1 = new Healthplan("My Healthplan 1");
        Healthplan h2 = new Healthplan("My Healthplan 2");
        Company c1 = new Company("Company A", 100);
        Company c2 = new Company("Company B", 100);
        System.out.println(c1.name);
//	public Employee(String fname, String lname, double salary, boolean has401K, int companyId, int healthPlanId)
        Employee emp1 = new Employee("Steve", "Green", 45000, true, c1.id, h1.getId());
        Employee emp2 = new Employee("May", "Ford", 80000, true, c1.id, h2.getId());
        Employee emp3 = new Employee("Doug", "Jones", 75000, true, c2.id, h2.getId());
        Employee emp4 = new Employee("John", "Jones", 80000, false, c2.id, h1.getId());
        c1.debt = c1.debt - 50;
        double steveraise = (emp1.getSalary() * 0.05) + emp1.getSalary();
        emp1.setSalary(steveraise);
        System.out.println(emp1.returnFullName() + " " + emp1.getSalary());
   }
}
