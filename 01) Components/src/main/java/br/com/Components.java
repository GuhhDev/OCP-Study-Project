package br.com;

/**
 * OCP Java 21 Exam - Building Blocks
 * 
 * EXAM FOCUS AREAS:
 * 1. Java Class Structure and File Organization
 * 2. Main Method Variations
 * 3. Java Platform Components (JDK, JRE, JVM)
 * 4. Compilation Process
 * 5. Package and Import Statements Order
 */
public class Components {
    
    // EXAM TOPIC 1: Main Method Variations
    // The main method can have different valid signatures
    
    // Standard main method
    public static void main(String[] args) {
        System.out.println("=== OCP Java 21 - Building Blocks Study Guide ===");
        
        demonstrateJavaPlatformComponents();
        demonstrateFileStructure();
        demonstrateMainMethodVariations();
        demonstrateCompilationProcess();
    }
    
    // EXAM TOPIC 2: Java Platform Components
    private static void demonstrateJavaPlatformComponents() {
        System.out.println("\n--- Java Platform Components (EXAM FOCUS) ---");
        
        System.out.println("JDK (Java Development Kit):");
        System.out.println("  ✓ Contains compiler (javac), runtime (java), and tools");
        System.out.println("  ✓ Required for development and compilation");
        System.out.println("  ✓ Includes JRE + development tools");
        
        System.out.println("\nJRE (Java Runtime Environment) - Historical:");
        System.out.println("  ✓ Used only to RUN Java applications");
        System.out.println("  ✓ Does NOT include compiler (javac)");
        System.out.println("  ✓ Since Java 9: No separate JRE download available");
        System.out.println("  ✓ Use jlink to create custom runtime images");
        
        System.out.println("\nJVM (Java Virtual Machine):");
        System.out.println("  ✓ Executes bytecode (.class files)");
        System.out.println("  ✓ Platform-specific implementation");
        System.out.println("  ✓ Enables 'Write Once, Run Anywhere'");
        System.out.println("  ✓ Handles memory management and garbage collection");
        
        System.out.println("\nKey Commands for Exam:");
        System.out.println("  javac: Compiles .java to .class bytecode");
        System.out.println("  java: Launches JVM to execute bytecode");
        System.out.println("  jar: Creates/manages JAR files");
        System.out.println("  javadoc: Generates API documentation");
        System.out.println("  jlink: Creates custom runtime images (Java 9+)");
    }
    
    // EXAM TOPIC 3: File Structure and Organization
    private static void demonstrateFileStructure() {
        System.out.println("\n--- Java File Structure (EXAM CRITICAL) ---");
        System.out.println("Correct order in .java files:");
        System.out.println("1. Package declaration (optional, max 1)");
        System.out.println("2. Import statements (optional, multiple allowed)");
        System.out.println("3. Class/Interface declarations");
        System.out.println("\nEXAM TRAP: Wrong order = Compilation error!");
        
        System.out.println("\nClass Structure Rules:");
        System.out.println("  ✓ One public class per file maximum");
        System.out.println("  ✓ File name must match public class name");
        System.out.println("  ✓ Multiple non-public classes allowed in same file");
        System.out.println("  ✓ Package-private classes don't require public keyword");
    }
    
    // EXAM TOPIC 4: Main Method Variations (Critical for Exam)
    private static void demonstrateMainMethodVariations() {
        System.out.println("\n--- Main Method Variations (EXAM FOCUS) ---");
        System.out.println("Valid main method signatures:");
        System.out.println("  ✓ public static void main(String[] args)");
        System.out.println("  ✓ public static void main(String args[])");
        System.out.println("  ✓ public static void main(String... args)");
        System.out.println("  ✓ static public void main(String[] args) // order flexible");
        System.out.println("  ✓ public static final void main(String[] args) // final allowed");
        
        System.out.println("\nEXAM TRAPS - Invalid main methods:");
        System.out.println("  ✗ void main(String[] args) // missing public static");
        System.out.println("  ✗ public void main(String[] args) // missing static");
        System.out.println("  ✗ public static void main() // missing parameter");
        System.out.println("  ✗ public static int main(String[] args) // wrong return type");
        
        System.out.println("\nKey Points:");
        System.out.println("  • 'public' and 'static' can be in any order");
        System.out.println("  • 'final' is optional but allowed");
        System.out.println("  • Parameter name can be anything (not just 'args')");
        System.out.println("  • String[] args is required (array of String)");
    }
    
    // EXAM TOPIC 5: Compilation Process
    private static void demonstrateCompilationProcess() {
        System.out.println("\n--- Java Compilation Process (EXAM KNOWLEDGE) ---");
        System.out.println("Step-by-step process:");
        System.out.println("1. Write .java source files");
        System.out.println("2. javac compiles to .class bytecode files");
        System.out.println("3. java command starts JVM");
        System.out.println("4. JVM loads and verifies .class files");
        System.out.println("5. JVM interprets/compiles bytecode to machine code");
        System.out.println("6. Program executes");
        
        System.out.println("\nEXAM FACTS:");
        System.out.println("  • Bytecode is platform-independent");
        System.out.println("  • JVM is platform-specific");
        System.out.println("  • .class files contain bytecode, not source code");
        System.out.println("  • One .java file can produce multiple .class files");
    }
}

/**
 * EXAM TOPIC: Multiple classes in same file
 * This is allowed as long as only one is public
 */
class ExamHelper {
    // This class demonstrates that multiple classes can exist in the same file
    // as long as only one is public
    
    static void showExamTips() {
        System.out.println("\n--- EXAM TIPS ---");
        System.out.println("• Pay attention to file organization order");
        System.out.println("• Know all valid main method signatures");
        System.out.println("• Understand JDK vs JRE vs JVM differences");
        System.out.println("• Remember: Since Java 9, no separate JRE download");
        System.out.println("• Watch for compilation vs runtime concepts");
    }
}

/**
 * EXAM TOPIC: Package-private class
 * No access modifier = package-private
 */
class PackagePrivateExample {
    // This class is package-private (default access)
    // Can be accessed by classes in the same package only
    
    void demonstrateAccess() {
        System.out.println("Package-private class example");
    }
}