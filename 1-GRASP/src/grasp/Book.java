// Book.java
package grasp;

public class Book {
    private String title;
    private boolean available;

    // Constructeur pour initialiser le livre avec un titre et le marquer comme disponible
    public Book(String title) {
        this.title = title;
        this.available = true;
    }

    // Getter pour obtenir le titre du livre
    public String getTitle() {
        return title;
    }

    // Getter pour v�rifier si le livre est disponible
    public boolean isAvailable() {
        return available;
    }

    // Setter pour d�finir l'�tat de disponibilit� du livre
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
