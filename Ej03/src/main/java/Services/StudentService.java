package Services;

import Entities.Student;
import java.util.ArrayList;
import java.util.Scanner;


/*En el servicio de Alumno deberemos tener un bucle que crea un objeto Alumno. Se pide
toda la información al usuario y ese Alumno se guarda en una lista de tipo Alumno y se le
pregunta al usuario si quiere crear otro Alumno o no.
Después de ese bucle tendremos el siguiente método en el servicio de Alumno:
Método notaFinal(): El usuario ingresa el nombre del alumno que quiere calcular su nota
final y se lo busca en la lista de Alumnos. Si está en la lista, se llama al método. Dentro
del método se usará la lista notas para calcular el promedio final de alumno. Siendo este
promedio final, devuelto por el método y mostrado en el main.
* */

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
