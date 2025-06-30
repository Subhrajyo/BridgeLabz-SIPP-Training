import java.util.ArrayList;

class Professor {
    String name;

    Professor(String name) {
        this.name = name;
    }
}

class Course {
    String name;
    Professor professor;
    ArrayList<Student> students = new ArrayList<>();

    Course(String name) {
        this.name = name;
    }

    void assignProfessor(Professor prof) {
        this.professor = prof;
    }

    void enrollStudent(Student student) {
        students.add(student);
    }
}

class Student {
    String name;

    Student(String name) {
        this.name = name;
    }

    void enrollCourse(Course course) {
        course.enrollStudent(this);
    }
}