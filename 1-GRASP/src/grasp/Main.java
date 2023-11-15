// Main.java
package grasp;

// Implémente les principes Controller (contrôle le flux d'exécution), Polymorphism (utilisation du polymorphisme avec la liste de livres) et Pure Fabrication (la classe principale qui utilise les autres)
public class Main {
    public static void main(String[] args) {
        // Créer une instance de la bibliothèque (Principe Creator)
        Library library = new Library();

        // Ajouter des livres à la bibliothèque (Principe Creator)
        Book book1 = new Book("Introduction to Java");
        Book book2 = new Book("Design Patterns");
        library.addBook(book1);
        library.addBook(book2);

        // Vérifier si un livre est disponible pour l'emprunt (Principe Controller)
        String bookTitle = "Introduction to Java";
        if (library.isBookAvailableForLoan(bookTitle)) {
            System.out.println(String.format("Le livre \"%s\" est disponible pour l'emprunt.", bookTitle));
        } else {
            System.out.println(String.format("Le livre \"%s\" n'est pas disponible pour l'emprunt.", bookTitle));
        }
    }
}
