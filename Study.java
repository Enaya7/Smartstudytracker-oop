class Study {

    // Encapsulation
    private String subject;
    private int hours;
    private boolean completed;

    // Setter for subject
    public void setSubject(String subject) {
        this.subject = subject;
    }

    // Getter for subject
    public String getSubject() {
        return subject;
    }

    // Setter for hours
    public void setHours(int hours) {
        if(hours > 0) {
            this.hours = hours;
     }
     else{
       System.out.println("invalid input");
     }
    }

    // Getter for hours
    public int getHours() {
        return hours;
    }

    // Setter for completed
    public void setCompleted(boolean completed) {
        this.completed = completed;
    }

    // Getter for completed
    public boolean getCompleted() {
        return completed;
    }
// Normal method
    void startStudy() {
        System.out.println(subject + " study session started.");
    }

    // Extra method
    void showStatus() {
        if(completed == true) {
            System.out.println(subject + " study is completed.");
        }
        else {
            System.out.println(subject + " study is not completed.");
        }
    }
  // Method Overloading
    void completeTask() {
        System.out.println("Task completed.");
    }

    void completeTask(String taskName) {
        System.out.println(taskName + " completed.");
    }
}
