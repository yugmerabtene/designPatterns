// Library.java
package grasp;

import java.util.ArrayList;
import java.util.List;

// Impl�mente les principes Creator (cr�e les instances de Book) et Information Expert (poss�de l'information sur les livres)
public class Library {
    // Utilisation du polymorphisme pour permettre la gestion de diff�rents types de livres si n�cessaire
    private List<Book> books;

    // Constructor
    public Library() {
        this.books = new ArrayList<>();
    }

    // Ajouter un livre � la biblioth�que
    public void addBook(Book book) {
        books.add(book);
    }

    // V�rifier si un livre est disponible pour l'emprunt
    public boolean isBookAvailableForLoan(String title) {
        for (Book book : books) {
            if (book.getTitle().equals(title) && book.isAvailable()) {
                return true;
            }
        }
        return false;
    }
}
