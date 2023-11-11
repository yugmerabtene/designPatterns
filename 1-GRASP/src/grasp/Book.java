package grasp;

//Book.java
public class Book {
 private String title;
 private boolean available;

 // Constructeur pour initialiser le livre avec un titre et le marquer comme disponible
 public Book(String title) {
     this.title = title;
     this.available = true;
 }

 // Méthode pour obtenir le titre du livre
 public String getTitle() {
     return title;
 }

 // Méthode pour vérifier si le livre est disponible
 public boolean isAvailable() {
     return available;
 }

 // Méthode pour définir l'état de disponibilité du livre
 public void setAvailable(boolean available) {
     this.available = available;
 }
}
