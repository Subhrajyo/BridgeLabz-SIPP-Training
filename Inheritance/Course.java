// Base class: Course
class Course {
    String courseName;
    int duration; // in weeks

    Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    void displayInfo() {
        System.out.println("Course Name: " + courseName);
        System.out.println("Duration: " + duration + " weeks");
    }
}

// Subclass: OnlineCourse
class OnlineCourse extends Course {
    String platform;
    boolean isRecorded;

    OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Platform: " + platform);
        System.out.println("Recorded: " + (isRecorded ? "Yes" : "No"));
    }
}

// Sub-subclass: PaidOnlineCourse
class PaidOnlineCourse extends OnlineCourse {
    double fee;
    double discount; // in percentage

    PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    @Override
    void displayInfo() {
        super.displayInfo();
        System.out.println("Fee: ₹" + fee);
        System.out.println("Discount: " + discount + "%");
        double finalPrice = fee - (fee * discount / 100);
        System.out.println("Final Price After Discount: ₹" + finalPrice);
    }
}
 class CourseSystem {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse(
                "Java Programming",
                6,
                "Udemy",
                true,
                2000.0,
                25.0
        );

        poc.displayInfo();
    }
}

