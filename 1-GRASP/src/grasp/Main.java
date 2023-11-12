// Main.java
package grasp;

public class Main {
    public static void main(String[] args) {
        // Cr�er une instance de la biblioth�que
        Library library = new Library();

        // Ajouter des livres � la biblioth�que (Principe Creator)
        Book book1 = new Book("Introduction to Java");
        Book book2 = new Book("Design Patterns");
        library.addBook(book1);
        library.addBook(book2);

        // V�rifier si un livre est disponible pour l'emprunt
        String bookTitle = "Introduction to Java";
        if (library.isBookAvailableForLoan(bookTitle)) {
            System.out.println("Le livre \"" + bookTitle + "\" est disponible pour l'emprunt.");
        } else {
            System.out.println("Le livre \"" + bookTitle + "\" n'est pas disponible pour l'emprunt.");
        }
    }
}
