// Main.java
package grasp;

// Impl�mente les principes Controller (contr�le le flux d'ex�cution), Polymorphism (utilisation du polymorphisme avec la liste de livres) et Pure Fabrication (la classe principale qui utilise les autres)
public class Main {
    public static void main(String[] args) {
        // Cr�er une instance de la biblioth�que (Principe Creator)
        Library library = new Library();

        // Ajouter des livres � la biblioth�que (Principe Creator)
        Book book1 = new Book("Introduction to Java");
        Book book2 = new Book("Design Patterns");
        library.addBook(book1);
        library.addBook(book2);

        // V�rifier si un livre est disponible pour l'emprunt (Principe Controller)
        String bookTitle = "Introduction to Java";
        if (library.isBookAvailableForLoan(bookTitle)) {
            System.out.println(String.format("Le livre \"%s\" est disponible pour l'emprunt.", bookTitle));
        } else {
            System.out.println(String.format("Le livre \"%s\" n'est pas disponible pour l'emprunt.", bookTitle));
        }
    }
}
