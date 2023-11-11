package controller;


// Controller - LoginController.java
// Ce contrôleur est responsable des actions liées à la connexion, respectant le principe Contrôleur.

public class LoginController {
    private service.AuthenticationService authService;

    public LoginController(service.AuthenticationService authService) {
        this.authService = authService;
    }

    public boolean login(String username, String password) {
        return authService.authenticate(username, password);
    }
}
