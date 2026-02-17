import java.util.ArrayList;
import java.util.Scanner;

public class Department {

    private String name;

    ArrayList<Employee> employees = new ArrayList<>();

    public Department(String name, String) {
        this.name = name;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ArrayList<Employee> getEmployees() {
        return employees;
    }


    public void  addEmployee(Employee employee , Scanner sc) {

        System.out.println("Enter Employee name: ");
        String name = sc.nextLine();
        sc.nextLine();
        System.out.println("Enter Employee ID: ");
        int id = sc.nextInt();

        Employee emp = new Employee(name, id);

        employees.add(emp);

    }

    public void printEmployees() {
        for (int i = 0 ; i < employees.size(); i++) {
            System.out.println(employees.get(i).getName() + " " + employees.get(i).getID());
        }
    }





}
