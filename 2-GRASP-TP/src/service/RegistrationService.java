package service;

import model.User;

//Model - RegistrationService.java
//Ce service est responsable de l'enregistrement des utilisateurs, respectant le principe Expert.

public class RegistrationService {
 private AuthenticationService authService;

 public RegistrationService(AuthenticationService authService) {
     this.authService = authService;
 }

 public boolean register(String username, String password) {
     // Utilisation du service d'authentification pour éviter la duplication des utilisateurs
     if (authService.authenticate(username, password)) {
         System.out.println("L'utilisateur existe déjà.");
         return false;
     }

     // Création d'un nouvel utilisateur
     User newUser = new User(username, password);

     // Ajout de l'utilisateur à la base de données
     authService.addUser(newUser);

     System.out.println("Inscription réussie.");
     return true;
 }
}
