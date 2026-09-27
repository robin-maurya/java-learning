package day13.practice;

public class SalaryValidationDemo {

    static void validateSalary(int salary)
        throws InvalidSalaryException {

        if (salary < 15000) {
            throw new InvalidSalaryException("Salary must be at least 15000");
        }

        System.out.println("Salary is valid");
    }


    public static void main(String[] args) {

        try{
            validateSalary(10000);
        } catch (InvalidSalaryException e ) {
            System.out.println(e.getMessage());
        }
    }

}
