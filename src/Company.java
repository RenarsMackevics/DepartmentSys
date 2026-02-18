// Company.java
import java.util.ArrayList;

public class Company {

    private final ArrayList<Department> depts = new ArrayList<>();

    public void addDepartment(Department dept) {
        depts.add(dept);
    }

    public Department getDepartment(int index) {
        if (index < 0 || index >= depts.size()) return null;
        return depts.get(index);
    }

    public void printDepartmentList() {
        for (int i = 0; i < depts.size(); i++) {
            Department d = depts.get(i);
            System.out.println(i + ") " + d.getName() + " (" + d.getLocation() + ")");
        }
        if (depts.size() == 0) {
            System.out.println("(no departments yet)");
        }
    }

    public void printCompanyData() {
        if (depts.size() == 0) {
            System.out.println("(no departments yet)\n");
            return;
        }

        for (int i = 0; i < depts.size(); i++) {
            Department dept = depts.get(i);
            System.out.println("Department #" + i + ": " + dept.getName() + " (" + dept.getLocation() + ")");

            ArrayList<Employee> employees = dept.getEmployees();
            if (employees.size() == 0) {
                System.out.println("  (no employees)");
            } else {
                for (int j = 0; j < employees.size(); j++) {
                    Employee e = employees.get(j);
                    System.out.println("  - Name: " + e.getName() + " | ID: " + e.getID());
                }
            }
            System.out.println();
        }
    }
}
