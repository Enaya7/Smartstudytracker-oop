class ReadingStudy extends Study {

    // Runtime Polymorphism (Method Overriding)
    void startStudy() {
        System.out.println(getSubject() + " reading session started.");
    }
      // Extra method
    void openBookstudy() {
        System.out.println("Opening study book...");
    }

    // Extra method
    void takeNotes() {
        System.out.println("Taking important notes...");
    }
}
