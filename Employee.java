public class Employee {
    // Protected member variables
    protected int id;
    protected int age;
    protected String name;
    protected boolean isPermanent;
   // Constructor
    public Employee(int id, int age, String name, boolean isPermanent) {
        this.id = id;
        this.age = age;
        this.name = name;
        this.isPermanent = isPermanent;
    }
  // Main method
    public static void main(String[] args) {
        // 35.5 needs to be type casted to int
        int correctedAge = (int) 35.5;
    Employee emp = new Employee(1, correctedAge, "laxmi", true);
        System.out.println("Successfully started");
    }
}
