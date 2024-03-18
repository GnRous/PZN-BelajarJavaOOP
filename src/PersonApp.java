public class PersonApp {
  public static void main(String[] args) {

    var person1 = new Person("Dermawan", "Makassar");

    System.out.println(person1.name);
    System.out.println(person1.address);
    System.out.println(person1.country);

    person1.sayHello("Setiawan");

    Person person2 = new Person("Setiawan", "Makassar");

    Person person3;
    person3 = new Person("Joko", "Cirebon");
    person3.sayHello("Setiawan");
  }
}
