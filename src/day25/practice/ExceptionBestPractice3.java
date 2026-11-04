package day25.practice;

public class ExceptionBestPractice3 {

    // Method jo validation aur exception throwing handle karta hai (Interview Best Practice)
    public static double calculateSalary(String salaryInput) {
        double salary;

        try {
            // String ko number mein convert karna
            salary = Double.parseDouble(salaryInput);
        } catch (NumberFormatException e) {
            // Exception Translation/Wrapping: Original exception ko catch karke
            // business-specific exception throw karna.
            throw new IllegalArgumentException("Invalid input: Salary numeric format mein honi chahiye.", e);
        }

        // Business logic validation (Fail-Fast Principle)
        if (salary < 0) {
            throw new IllegalArgumentException("Invalid input: Salary negative nahi ho sakti.");
        }

        return salary;
    }

    public static void main(String[] args) {
        // 3 alag-alag test cases
        String[] testCases = {"50000", "-15000", "Pachaas Hazaar"};

        for (String testCase : testCases) {
            System.out.println("Input: " + testCase);
            try {
                double processedSalary = calculateSalary(testCase);
                System.out.println("Success! Salary processed: ₹" + processedSalary);
            } catch (IllegalArgumentException e) {
                System.err.println("Validation Failed: " + e.getMessage());
            }
            System.out.println("-------------------------");
        }
    }
}
