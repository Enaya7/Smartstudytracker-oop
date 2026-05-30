import java.util.Scanner;

public class MainSt {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        // USER INPUT SECTION

        System.out.println(" SMART STUDY TRACKER ");

        System.out.println("Enter subject:");
        String subject = input.nextLine();

        System.out.println("Enter study unit/topic:");
        String unit = input.nextLine();

        System.out.println("Enter planned study hours:");
        int plannedHours = input.nextInt();

        System.out.println("Enter completed study hours:");
        int completedHours = input.nextInt();

        System.out.println();

        // OBJECT CREATION
        CodingStudy coding1 = new CodingStudy();
        ReadingStudy reading1 = new ReadingStudy();
        VideoStudy video1 = new VideoStudy();

        // SETTING VALUES
        coding1.setSubject(subject);
        coding1.setHours(completedHours);
        coding1.setCompleted(completedHours >= plannedHours);

        reading1.setSubject("Ethics Reading");
        reading1.setHours(2);
        reading1.setCompleted(false);

        video1.setSubject("Database Tutorial");
        video1.setHours(1);
        video1.setCompleted(true);

        // DISPLAYING INFORMATION
        System.out.println(" CURRENT STUDY PLAN ");

        System.out.println("Subject: " + coding1.getSubject());
        System.out.println("Unit: " + unit);
        System.out.println("Planned Hours: " + plannedHours);
        System.out.println("Completed Hours: " + completedHours);

        System.out.println();

        // REMINDER SYSTEM
        if(completedHours < plannedHours) {

            System.out.println("You are behind your study plan.");
            System.out.println("Reminder: Please continue studying " + unit);

        } else {

            System.out.println("Great job! You completed your study target.");
        }

        System.out.println();
        // DISPLAY OTHER STUDY TYPES
        System.out.println("===== OTHER STUDY TYPES =====");

        System.out.println("Reading Subject: " + reading1.getSubject());
        System.out.println("Video Subject: " + video1.getSubject());

        System.out.println();

        // RUNTIME POLYMORPHISM
        Study s1 = new CodingStudy();
        s1.setSubject(subject);
        s1.startStudy();

        Study s2 = new ReadingStudy();
        s2.setSubject("History Reading");
        s2.startStudy();

        Study s3 = new VideoStudy();
        s3.setSubject("Networking Video");
        s3.startStudy();

        System.out.println();

    // method overloading
        coding1.completeTask();
        coding1.completeTask(unit);
        coding1.debugCode();
        coding1.debugCode("un excepted syntax");
        System.out.println();

        // STUDY STATUS
        coding1.showStatus();
        reading1.showStatus();
        video1.showStatus();
        System.out.println();

        // EXTRA SPECIFIC METHODS
        coding1.writeProgram();
        System.out.println();

        reading1.openBookstudy();
        reading1.takeNotes();
        System.out.println();

        video1.videostudying();
        video1.pauseVideo();
        System.out.println();

        // SIMPLE LOOP AND IF CONDITIONS
      if(completedHours < plannedHours) {

    // Warning reminder
    System.out.println("You are behind your study plan.");
    System.out.println();

    // Repeated study reminders
    for(int i = 1; i <= 3; i++) {

        System.out.println("Reminder " + i +
        ": Please continue studying " + unit);
    }

}
        System.out.println();

        input.close();
    }
}