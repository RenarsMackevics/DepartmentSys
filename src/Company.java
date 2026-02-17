import java.util.ArrayList;
import java.util.Scanner;

public class Company {

    ArrayList<Department> depts = new ArrayList<>();

    Scanner sc = new Scanner(System.in);


    public void AddDepartment(Department dept) {
        depts.add(dept);
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

    public void printDepartmentData(){
        for(int i = 0; i < depts.size(); i++){
            Department dept = depts.get(i);
            System.out.println( i + ") "  + "Department Name: " + dept.getName());
        }
    }




}
