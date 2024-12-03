public class DataTypeOperators {
    
    public static final double PI = 3.14;

    public static void main(String[] args) {
        
        int num1 = 10;
        int num2 = 5;
        double price = 99.99;
        double same =99.99;
        char grade = 'A';
        boolean isAvailable = true;

        System.out.println("Integer 1: " + num1);
        System.out.println("Integer 2: " + num2);
        System.out.println("Double price: " + price);
        System.out.println("Char grade: " + grade);
        System.out.println("Boolean availability: " + isAvailable);
        System.out.println("Constant PI: " + PI);

        int sum = num1 + num2;        
        int diff = num1 - num2;       
        int product = num1 * num2;    
        double res = price/same; 
        int remainder = num1 % num2; 

        System.out.println("\nArithmetic Operators:");
        System.out.println("Sum: " + sum);
        System.out.println("Difference: " + diff);
        System.out.println("Product: " + product);
        System.out.println("Double res: " + res);
        System.out.println("Remainder: " + remainder);

        // Demonstrating Relational Operators
        boolean isEqual = num1 == num2;   // Equals to
        boolean isNotEqual = num1 != num2; // Not equals to
        boolean isGreater = num1 > num2;   // Greater than
        boolean isLess = num1 < num2;      // Less than
        boolean isGreaterOrEqual = num1 >= num2; // Greater than or equal to
        boolean isLessOrEqual = num1 <= num2;    // Less than or equal to

        System.out.println("\nRelational Operators:");
        System.out.println("Is num1 equal to num2? " + isEqual);
        System.out.println("Is num1 not equal to num2? " + isNotEqual);
        System.out.println("Is num1 greater than num2? " + isGreater);
        System.out.println("Is num1 less than num2? " + isLess);
        System.out.println("Is num1 greater or equal to num2? " + isGreaterOrEqual);
        System.out.println("Is num1 less or equal to num2? " + isLessOrEqual);

        // Demonstrating Logical Operators
        boolean andResult = isAvailable && (num1 > num2);  // Logical AND
        boolean orResult = isAvailable || (num1 < num2);   // Logical OR
        boolean notResult = !isAvailable;                   // Logical NOT

        System.out.println("\nLogical Operators:");
        System.out.println("Logical AND (isAvailable AND num1 > num2): " + andResult);
        System.out.println("Logical OR (isAvailable OR num1 < num2): " + orResult);
        System.out.println("Logical NOT (not isAvailable): " + notResult);
    }
}
