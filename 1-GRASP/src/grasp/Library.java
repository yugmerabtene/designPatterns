package grasp;

import java.util.HashMap;
import java.util.Map;

// Library.java
public class Library {
    private Map<String, Book> books;

    // Constructeur pour initialiser la bibliothèque avec une collection de livres
    public Library() {
        this.books = new HashMap<>();
    }

    // Méthode pour ajouter un livre à la bibliothèque
    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    // Méthode pour vérifier si un livre est disponible pour l'emprunt
    public boolean isBookAvailableForLoan(String title) {
        Book book = books.get(title);
        return book != null && book.isAvailable();
    }
}
