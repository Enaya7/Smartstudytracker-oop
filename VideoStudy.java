class VideoStudy extends Study {

    // Runtime Polymorphism (Method Overriding)
    void startStudy() {
        System.out.println(getSubject() + " video lesson started.");
    }
    // Extra method
    void videostudying(){
        System.out.println("video lesson time...");
    }
      // Extra method
    void pauseVideo() {
        System.out.println("Video paused for short break.");
    }
}
