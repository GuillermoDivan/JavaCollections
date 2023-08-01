package Services;
import Entities.Book;
import java.util.HashSet;
import java.util.Scanner;

public class BookService {
    HashSet<Book> BookList = new HashSet<Book>();
    Scanner input = new Scanner(System.in).useDelimiter("\n");

    private void addBookToList(){
        boolean flag = true;
        do {
            System.out.println("Ingrese el título del libro.");
            String title = input.next();
            System.out.println("Ingrese el autor del libro.");
            String author = input.next();
            System.out.println("Ingrese el número total de copias del libro.");
            int totalCopies = input.nextInt();
            System.out.println("Ingrese el número de copias prestadas de este libro.");
            int borrowedCopies = input.nextInt();
            Book book = new Book(title, author, totalCopies, borrowedCopies);
            BookList.add(book);
            System.out.println("Desea agregar otro libro? Presione N para salir o cualquier letra para continuar.");
            if (input.next().equalsIgnoreCase("n")) {flag = false;}
        } while(flag);
        showBookList();
    }

    public void showBookList(){
        System.out.println(BookList);
    }

    private Book lookForBook(){
        System.out.println("Ingrese el título del libro.");
        for (Book b : BookList){
            if (input.next().equals(b.getTitle())) { return b; }
            else { System.out.println("El título buscado no se encuentra en la lista. Pruebe otro título.");
                borrowBook(); }
            } return null;
        }

   private boolean borrowBook(){
        boolean canBorrowBook = false;
        Book searchedBook = lookForBook();
        if (searchedBook != null) {
            if (searchedBook.getBorrowedCopies() < searchedBook.getTotalCopies()) {
                searchedBook.setBorrowedCopies(searchedBook.getBorrowedCopies()+1);
                System.out.println("Préstamo realizado exitosamente.");
                canBorrowBook = true;
            } else {
                System.out.println("No se pudo realizar el préstamo porque no quedan copias disponibles."); }
        } showBookList();
       return canBorrowBook;
   }

    private boolean returnBook(){
        boolean canReturnBook = false;
        Book givenBook = lookForBook();
        if (givenBook != null) {
            if (givenBook.getBorrowedCopies() > 0) {
                givenBook.setBorrowedCopies(givenBook.getBorrowedCopies()-1);
                System.out.println("Devolución realizada exitosamente.");
                canReturnBook = true;
            } else {
                System.out.println("No se pudo realizar la devolución porque no figuran préstamos realizados."); }
        } showBookList();
        return canReturnBook;
    }

    public void menuBookService(){
        int option;
        do {
            System.out.println("Ingrese la opción que desea realizar: " +
                    " 1) Agregar un libro a la lista. 2) Retirar un libro. 3) Devolver un libro. " +
                    "4) Ver la lista de libros. 5) Salir");
            option = input.nextInt();
            switch (option) {
                case 1: addBookToList(); break;
                case 2: borrowBook(); break;
                case 3: returnBook(); break;
                case 4: showBookList(); break;
                case 5: System.out.println("Saliendo del programa. Que tengas un lindo día."); break;
            }
        } while (option < 5 && option > 0);
    }
}
