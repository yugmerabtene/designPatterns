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

 // M�thode pour obtenir le titre du livre
 public String getTitle() {
     return title;
 }

 // M�thode pour v�rifier si le livre est disponible
 public boolean isAvailable() {
     return available;
 }

 // M�thode pour d�finir l'�tat de disponibilit� du livre
 public void setAvailable(boolean available) {
     this.available = available;
 }
}
