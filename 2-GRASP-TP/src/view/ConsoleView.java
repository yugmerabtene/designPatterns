package view;
import controller.DashboardController;
import controller.LoginController;
import controller.RegistrationController;

import java.util.Scanner;

// View - ConsoleView.java
// Cette vue en console est responsable de l'interaction avec l'utilisateur, respectant le principe Contrôleur.

public class ConsoleView {
    private Scanner scanner;
    private LoginController loginController;
    private RegistrationController registrationController;

    public ConsoleView(LoginController loginController, RegistrationController registrationController) {
        this.scanner = new Scanner(System.in);
        this.loginController = loginController;
        this.registrationController = registrationController;
    }

    // Affiche le menu principal et gère l'interaction avec l'utilisateur
    public void showMenu() {
        while (true) {
            System.out.println("1. Connexion");
            System.out.println("2. Inscription");
            System.out.println("3. Quitter");
            System.out.print("Choisissez une option : ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Nettoyer le caractère de nouvelle ligne

            switch (choice) {
                case 1:
                    handleLogin();
                    break;
                case 2:
                    handleRegistration();
                    break;
                case 3:
                    System.out.println("Au revoir !");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Option invalide. Veuillez réessayer.");
            }
        }
    }

    // Gère le processus de connexion
    private void handleLogin() {
        System.out.print("Nom d'utilisateur : ");
        String username = scanner.nextLine();

        System.out.print("Mot de passe : ");
        String password = scanner.nextLine();

        if (loginController.login(username, password)) {
            DashboardController.showDashboard(username);
        } else {
            System.out.println("Erreur d'authentification.");
        }
    }

    // Gère le processus d'enregistrement
    private void handleRegistration() {
        System.out.print("Nouveau nom d'utilisateur : ");
        String username = scanner.nextLine();

        System.out.print("Nouveau mot de passe : ");
        String password = scanner.nextLine();

        if (registrationController.register(username, password)) {
            DashboardController.showDashboard(username);
        } else {
            System.out.println("Erreur d'inscription.");
        }
    }
}

