package Services;

import Entities.Student;

import java.util.ArrayList;
import java.util.Scanner;

public class StudentService {
    ArrayList <Student> studentList = new ArrayList<>();
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    public void addStudentToList(){
        boolean flag = true;
        do{
            Student st = new Student();
            System.out.println("Ingrese el nombre del alumnx");
            st.setName(input.next());
            ArrayList<Integer> auxGrades = new ArrayList<>();
            for(int i = 0; i < 3; i++){
                System.out.println("Ingrese la " + (i+1) +"° nota del alumnx");
                auxGrades.add(input.nextInt());
            }
            st.setGrades(auxGrades);
            studentList.add(st);
            System.out.println("Presione N para salir o cualquier otra letra para continuar agregando alumnxs.");
            if (input.next().equalsIgnoreCase("n")) {flag = false; }
        } while(flag);
    }

    public void lookForStudent() {
        boolean notFound = false;
        System.out.println("Ingrese el nombre de le alumnx para calcular su nota");
        String searchedStudent = input.next();
        for (int i = 0; i < studentList.size(); i++) {
            if (searchedStudent.equalsIgnoreCase(studentList.get(i).getName())) {
                finalGrade(searchedStudent); break;
            } else { notFound = true; }
        }
        if (notFound) {System.out.println("No se encontró dicho nombre en la lista."); }
    }

    public int finalGrade(String searchedStudent){
        int finalGrade = 0;
        for (int i = 0; i < studentList.size(); i++) {
            if (searchedStudent.equalsIgnoreCase(studentList.get(i).getName())) {
                finalGrade = (studentList.get(i).getGrades().get(0) +
                        studentList.get(i).getGrades().get(1) + studentList.get(i).getGrades().get(2)) / 3;
            }
        }
        System.out.println("La nota promedio de "+ searchedStudent+ " es "+ finalGrade +".");
    return finalGrade;
    }


    public void showStudentList(){
        for (int i = 0; i < studentList.size(); i++) {
            System.out.println("["+ studentList.get(i).getName() + "]");
        }
    }
}
