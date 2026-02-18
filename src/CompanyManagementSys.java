
import java.util.Scanner;

public class CompanyManagementSys {


    private final Scanner sc = new Scanner(System.in);
    private final Company company = new Company();

    public void start() {
        while (true) {
            System.out.println("=== Company-Management-System ===");
            System.out.println("1) Add Department");
            System.out.println("2) Add Employee to Department");
            System.out.println("3) Display Company structure");
            System.out.println("4) Exit");
            System.out.print("Enter Your Choice: ");

            int choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {
                case 1: {
                    System.out.print("Enter Department Name: ");
                    String deptName = sc.nextLine();
                    if(deptName.equals("")) {
                        System.out.println("Department Name can't  be empty");
                        break;
                    }

                    System.out.print("Enter Department Location: ");
                    String location = sc.nextLine();
                    if(location.equals("")) {
                        System.out.println("Department Location can't  be empty");
                        break;
                    }

                    Department dept = new Department(deptName, location);
                    company.addDepartment(dept);

                    System.out.println("Department added.\n");
                    break;
                }

                case 2: {
                    System.out.print("Enter Employee Name: ");
                    String empName = sc.nextLine();

                    System.out.print("Enter Employee ID: ");
                    int empID;
                    try {
                        empID = sc.nextInt();
                        sc.nextLine();
                    } catch (Exception e) {
                        System.out.println("Invalid input. ID must be a number.");
                        sc.nextLine();
                        break;
                    }

                    sc.nextLine();

                    Employee emp = new Employee(empName, empID);

                    company.printDepartmentList();
                    System.out.print("Enter department index: ");
                    int depIndex;
                    try{
                        depIndex = sc.nextInt();
                        sc.nextLine();
                    } catch (Exception e) {
                        System.out.println("Invalid input. Department Index be a number.");
                        sc.nextLine();
                        break;
                    }
                    sc.nextLine();

                    Department selected = company.getDepartment(depIndex);
                    if (selected != null) {
                        selected.addEmployee(emp);
                        System.out.println("Employee added.\n");
                    } else {
                        System.out.println("No such department.\n");
                    }
                    break;
                }

                case 3: {
                    company.printCompanyData();
                    break;
                }

                case 4: {
                    return;
                }

                default: {
                    System.out.println("Invalid choice.\n");
                    break;
                }
            }
        }
    }


}

