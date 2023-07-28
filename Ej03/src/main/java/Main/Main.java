package Main;

import Services.StudentService;

public class Main {
    public static void main(String[] args) {
        StudentService service = new StudentService();
        service.addStudentToList();
        service.showStudentList();
        service.lookForStudent();
    }
}
