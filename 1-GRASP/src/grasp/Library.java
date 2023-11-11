package grasp;

import java.util.HashMap;
import java.util.Map;

// Library.java
public class Library {
    private Map<String, Book> books;

    // Constructeur pour initialiser la biblioth�que avec une collection de livres
    public Library() {
        this.books = new HashMap<>();
    }

    // M�thode pour ajouter un livre � la biblioth�que
    public void addBook(Book book) {
        books.put(book.getTitle(), book);
    }

    // M�thode pour v�rifier si un livre est disponible pour l'emprunt
    public boolean isBookAvailableForLoan(String title) {
        Book book = books.get(title);
        return book != null && book.isAvailable();
    }
}
