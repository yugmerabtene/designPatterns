// Library.java
package grasp;

import java.util.ArrayList;
import java.util.List;

// Implémente les principes Creator (crée les instances de Book) et Information Expert (possède l'information sur les livres)
public class Library {
    // Utilisation du polymorphisme pour permettre la gestion de différents types de livres si nécessaire
    private List<Book> books;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // Ajouter un livre à la bibliothèque
    public void addBook(Book book) {
        books.add(book);
    }

    // Vérifier si un livre est disponible pour l'emprunt
    public boolean isBookAvailableForLoan(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                return true;
            }
        }
        return false;
    }
}
