// Book.java
package grasp;

// Implémente les principes Information Expert (contient l'information sur le livre), Creator (crée l'instance de Book) et High Cohesion (fonctionnalités liées regroupées)
public class Book {
    private final String title;
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

    // Getter pour vérifier si le livre est disponible
    public boolean isAvailable() {
        return available;
    }

    // Setter pour définir l'état de disponibilité du livre
    public void setAvailable(boolean available) {
        this.available = available;
    }
}
