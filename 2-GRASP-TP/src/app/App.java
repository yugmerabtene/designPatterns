package app;
import model.User;
import controller.LoginController;
import controller.RegistrationController;
import service.RegistrationService;
import view.ConsoleView;

// App - App.java
// Cette classe représente le point d'entrée de l'application.

public class App {
    public static void main(String[] args) {
        // Initialisation des services et des contrôleurs
        service.AuthenticationService authService = new service.AuthenticationService();
        RegistrationService regService = new service.RegistrationService(authService);
        LoginController loginController = new LoginController(authService);
        RegistrationController registrationController = new RegistrationController(regService);

        // Initialisation de la vue
        ConsoleView consoleView = new ConsoleView(loginController, registrationController);

        // Exemple d'ajout d'utilisateur
        authService.addUser(new model.User("utilisateur1", "motdepasse1"));

        // Affichage du menu principal
        consoleView.showMenu();
    }
}
