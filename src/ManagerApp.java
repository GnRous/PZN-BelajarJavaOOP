public class ManagerApp {
  public static void main(String[] args) {

    var manager = new Manager();
    manager.name = "Derm";
    manager.sayHello("Setya");

    var vp = new VicePresident();
    vp.name = "Joko";
    vp.sayHello("Setya");
  }
}
