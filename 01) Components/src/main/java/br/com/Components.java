package br.com;

public class Components {
    public static void main(String[] args) {

    /*
      Major Components of Java
        The Java Development Kit (JDK) contains the minimum software you need to do Java development.
        Key commands include the following:
            javac: Converts .java source files into .class bytecode
            java: Executes the program
            jar: Packages files together
            javadoc: Generates documentation
        The javac program generates instructions in a special format called bytecode that the java command can run.
        Then java launches the Java Virtual Machine (JVM) before running the code. The JVM knows how to run bytecode on
        the actual machine it is on. You can think of the JVM as a special magic box on your machine that knows how to
        run your '.class' file within your particular operating system and hardware.

      Where Did the JRE Go?
        In Java 8 and earlier, you could download a Java Runtime Environment (JRE) instead of the full JDK. The JRE
        was a subset of the JDK that was used for running a program but could not compile one. Now, people can use the
        full JDK when running a Java program. Alternatively, developers can supply an executable that contains the
        required pieces that would have been in the JRE.

        JRE (Java Runtime Environment)
           - Used to RUN Java applications.
           - Does NOT include the compiler (javac), so it can't compile code.
           - Lighter than JDK.

         JDK (Java Development Kit)
           - Used to RUN and COMPILE Java applications.
           - Includes JRE + development tools like javac, javadoc, etc.
    */

        System.out.println("Components");

        System.out.printf("Hello and welcome!");

        for (int i = 1; i <= 5; i++) {
            //TIP Press <shortcut actionId="Debug"/> to start debugging your code. We have set one <icon src="AllIcons.Debugger.Db_set_breakpoint"/> breakpoint
            // for you, but you can always add more by pressing <shortcut actionId="ToggleLineBreakpoint"/>.
            System.out.println("i = " + i);
        }
    }
}