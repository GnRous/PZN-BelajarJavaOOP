public class PolymorphismApp {
  public static void main(String[] args) {


    Employee employee = new Employee("Derm");
    employee.sayHello("Setya");

    employee = new Manager("Derm");
    employee.sayHello("Setya");

    employee = new VicePresident("Derm");
    employee.sayHello("Setya");

    sayHello(new Employee("Derm"));
    sayHello(new Manager("Setya"));
    sayHello(new VicePresident("Wan"));
  }

  static void sayHello(Employee employee) {
    if (employee instanceof VicePresident) {
      VicePresident vicePresident = (VicePresident) employee;
      System.out.println("Hello VP " + employee.name);
    } else if (employee instanceof Manager) {
      Manager manager = (Manager) employee;
      System.out.println("Hello Manager " + employee.name);
    } else {
      System.out.println("Hello " + employee.name);
    }
  }
}
