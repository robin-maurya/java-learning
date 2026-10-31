package day24.practice;

public class Practice2EmployeeRole {

    enum EmployeeRole {
        DEVELOPER(60000),
        TESTER(45000),
        MANAGER(80000),
        HR(40000);

        private  final int salary;

        EmployeeRole(int salary) {
            this.salary = salary;
        }

        public int getSalary() {
            return salary;
        }
    }

    public static void main(String[] args) {

        EmployeeRole details = EmployeeRole.DEVELOPER;

        System.out.println("Employee Role: "+details);
        System.out.println("Employee Salary: " +details.getSalary());
    }
}
