import java.util.ArrayList;
import java.util.Scanner;

public class Company {


    ArrayList<Department> depts = new ArrayList<>();


    public void AddDepartment(Department dept , Scanner sc){

        System.out.println("Enter Department Name");
        String name = sc.nextLine();

        Department department = new Department(name);

        depts.add(department);
    }

    public void printCompanyData(){
        for(int i = 0; i < depts.size(); i++){
            Department dept = depts.get(i);

            System.out.println("Department Name: " + dept.getName());

            ArrayList<Employee> employees = dept.getEmployees();

            for (int j = 0; j < employees.size(); j++){
                Employee employee = employees.get(j);

                System.out.println("Employee Name: " + employee.getName()  + " | " + employees.get(j).getID());
            }
            System.out.println();

        }
    }



}
