class CodingStudy extends Study {
    // V3.0: INHERITANCE OR IS-A RELATION SHIP
    // V4.0: Runtime Polymorphism (Method Overriding)
    void startStudy() {
        System.out.println(getSubject() + " coding practice started.");
    }
      // NO PARAMETER: GENERAL DEBUGGING BEHAVIOUR
    void debugCode() {
        System.out.println("Fixing coding errors...");
    }
    // compile time polymorphism or method over loading by using child class
    void debugCode(String errorType) {
        System.out.println("Fixing specific " + errorType + " exceptions in code.");
    }
    // Extra method
    void writeProgram() {
        System.out.println("Writing Java program...");
    }
}
