import java.util.Scanner;

public class CompanyManagmentSys {

    Scanner sc = new Scanner(System.in);
    Company company = new Company();

    public void Start() {

        while (true) {

            System.out.println("===Company-Management-System=== \n " +
                    "1)Add Department: \n" +
                    "2)Add Employee to Department \n" +
                    "3)Display Company structure \n");
            System.out.print("Enter Your Choice: ");

            int choice = sc.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter Department Name: ");
                    String Deptname = sc.nextLine();

                    System.out.print("Enter Department Location: ");
                    String location = sc.nextLine();

                    Department dept = new Department(Deptname);
                    company.AddDepartment(dept);
                    System.out.println("Department added.\n");
                case 2:
                    System.out.print("Enter Employee Name: ");
                    String EmpName = sc.nextLine();
                    System.out.print("Enter Employee ID: ");
                    int EmpID = sc.nextInt();
                    Employee emp = new Employee(EmpName , EmpID);
                    company.printDepartmentData();
                    System.out.print("Enter ID of department: ");
                    int DepID = sc.nextInt();



                case 3:

                case 4:

            }

        }
    }

    public void printDepartments(Department dept) {

    }


}

