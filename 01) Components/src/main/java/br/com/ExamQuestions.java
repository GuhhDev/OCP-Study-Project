package br.com;

/**
 * OCP Java 21 Exam - Building Blocks Practice Questions
 * 
 * This class contains practice questions similar to those found in the actual OCP exam.
 * Each question focuses on building blocks concepts that are frequently tested.
 */
public class ExamQuestions {
    
    public static void main(String[] args) {
        System.out.println("=== OCP Java 21 - Building Blocks Practice Questions ===\n");
        
        question1();
        question2();
        question3();
        question4();
        question5();
    }
    
    /**
     * QUESTION 1: File Organization Order
     * What is the correct order of elements in a Java source file?
     */
    private static void question1() {
        System.out.println("QUESTION 1: File Organization Order");
        System.out.println("What is the correct order of elements in a Java source file?");
        System.out.println("A) import statements, package statement, class declaration");
        System.out.println("B) package statement, class declaration, import statements");
        System.out.println("C) class declaration, import statements, package statement");
        System.out.println("D) package statement, import statements, class declaration");
        System.out.println();
        System.out.println("ANSWER: D");
        System.out.println("EXPLANATION: The correct order is:");
        System.out.println("1. Package declaration (optional, maximum 1)");
        System.out.println("2. Import statements (optional, multiple allowed)");
        System.out.println("3. Class/Interface declarations");
        System.out.println("Any other order will result in a compilation error.");
        System.out.println("---------------------------------------------------\\n");
    }
    
    /**
     * QUESTION 2: Main Method Variations
     * Which of the following main method declarations are valid?
     */
    private static void question2() {
        System.out.println("QUESTION 2: Main Method Variations");
        System.out.println("Which of the following main method declarations are valid?");
        System.out.println("A) public static void main(String[] args)");
        System.out.println("B) static public void main(String... args)");
        System.out.println("C) public static final void main(String args[])");
        System.out.println("D) public void main(String[] args)");
        System.out.println("E) public static void main()");
        System.out.println();
        System.out.println("ANSWER: A, B, C");
        System.out.println("EXPLANATION:");
        System.out.println("A) ✓ Standard main method signature");
        System.out.println("B) ✓ 'public' and 'static' can be in any order, varargs allowed");
        System.out.println("C) ✓ 'final' is optional but allowed");
        System.out.println("D) ✗ Missing 'static' keyword");
        System.out.println("E) ✗ Missing String[] parameter");
        System.out.println("---------------------------------------------------\\n");
    }
    
    /**
     * QUESTION 3: JDK vs JRE vs JVM
     * Which statement about Java platform components is correct?
     */
    private static void question3() {
        System.out.println("QUESTION 3: Java Platform Components");
        System.out.println("Which statement about Java platform components is correct?");
        System.out.println("A) JRE includes the Java compiler (javac)");
        System.out.println("B) JVM is platform-independent");
        System.out.println("C) Since Java 9, JRE is no longer available as a separate download");
        System.out.println("D) JDK is only needed to run Java applications");
        System.out.println();
        System.out.println("ANSWER: C");
        System.out.println("EXPLANATION:");
        System.out.println("A) ✗ JRE does NOT include javac compiler");
        System.out.println("B) ✗ JVM is platform-specific, bytecode is platform-independent");
        System.out.println("C) ✓ Correct - Oracle stopped providing separate JRE downloads");
        System.out.println("D) ✗ JDK is needed for development and compilation, not just running");
        System.out.println("---------------------------------------------------\\n");
    }
    
    /**
     * QUESTION 4: Multiple Classes in Same File
     * What is true about having multiple classes in the same Java file?
     */
    private static void question4() {
        System.out.println("QUESTION 4: Multiple Classes in Same File");
        System.out.println("What is true about having multiple classes in the same Java file?");
        System.out.println("A) Only one class is allowed per file");
        System.out.println("B) Multiple public classes are allowed in the same file");
        System.out.println("C) At most one public class is allowed per file");
        System.out.println("D) The file name must match the first class declared");
        System.out.println();
        System.out.println("ANSWER: C");
        System.out.println("EXPLANATION:");
        System.out.println("A) ✗ Multiple classes are allowed in the same file");
        System.out.println("B) ✗ Only one public class is allowed per file");
        System.out.println("C) ✓ Correct - at most one public class per file");
        System.out.println("D) ✗ File name must match the public class name (if any)");
        System.out.println("---------------------------------------------------\\n");
    }
    
    /**
     * QUESTION 5: Compilation Process
     * What happens during Java compilation and execution?
     */
    private static void question5() {
        System.out.println("QUESTION 5: Compilation Process");
        System.out.println("What happens during Java compilation and execution?");
        System.out.println("A) javac creates machine code directly");
        System.out.println("B) .class files contain platform-specific code");
        System.out.println("C) javac creates bytecode that is platform-independent");
        System.out.println("D) JVM converts source code to machine code");
        System.out.println();
        System.out.println("ANSWER: C");
        System.out.println("EXPLANATION:");
        System.out.println("A) ✗ javac creates bytecode, not machine code");
        System.out.println("B) ✗ .class files contain platform-independent bytecode");
        System.out.println("C) ✓ Correct - javac creates platform-independent bytecode");
        System.out.println("D) ✗ JVM converts bytecode to machine code, not source code");
        System.out.println("---------------------------------------------------\\n");
    }
}

/**
 * Additional exam scenarios for practice
 */
class ExamScenarios {
    
    // SCENARIO 1: This would cause compilation error if uncommented
    // because package statement must come first
    /*
    import java.util.*;
    package br.com; // ERROR: package statement must come before imports
    */
    
    // SCENARIO 2: Valid main method variations for exam
    
    // This is valid - different parameter name
    public static void main(String[] parameters) {
        // Valid main method with different parameter name
    }
    
    // This is valid - final keyword
    public static final void main(String[] args) {
        // Valid main method with final keyword
    }
    
    // This is valid - different order of modifiers
    static public void main(String... args) {
        // Valid main method with different modifier order and varargs
    }
    
    // SCENARIO 3: These would be invalid main methods (commented out to avoid errors)
    /*
    void main(String[] args) {} // Missing public static
    public void main(String[] args) {} // Missing static
    public static void main() {} // Missing parameter
    public static int main(String[] args) { return 0; } // Wrong return type
    private static void main(String[] args) {} // Wrong access modifier
    */
}

/**
 * EXAM TIP: This class demonstrates package-private access
 * No access modifier means package-private (default access)
 */
class ExamTips {
    
    void showTips() {
        System.out.println("EXAM PREPARATION TIPS:");
        System.out.println("1. Memorize the file organization order");
        System.out.println("2. Know all valid main method signatures");
        System.out.println("3. Understand JDK/JRE/JVM differences clearly");
        System.out.println("4. Practice identifying compilation vs runtime errors");
        System.out.println("5. Remember: One .java file can produce multiple .class files");
        System.out.println("6. Watch for tricky questions about access modifiers");
        System.out.println("7. Know that since Java 9, no separate JRE download exists");
    }
}
