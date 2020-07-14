public class Course {
   // TODO: Declare private fields - courseNumber, courseTitle
    private String courseNumber, courseTitle = "";

   // TODO: Define mutator methods - 
   //       setCourseNumber(), setCourseTitle()
    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public void setCourseTitle(String courseTitle) {
        this.courseTitle = courseTitle;
    }
   // TODO: Define accessor methods - 
   //       getCourseNumber(), getCourseTitle()
    public String getCourseNumber() {
        return this.courseNumber;
    }
    
    public String getCourseTitle() {
        return this.courseTitle;
    }
   // TODO: Define printInfo()
    public void printInfo() {
        System.out.printf("Course Information: \n");
        System.out.printf("   Course Number: %s\n",getCourseNumber());
        System.out.printf("   Course Title: %s\n",getCourseTitle());
    }
}