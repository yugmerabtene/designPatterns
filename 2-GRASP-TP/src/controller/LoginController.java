package controller;


// Controller - LoginController.java
// Ce contr�leur est responsable des actions li�es � la connexion, respectant le principe Contr�leur.

public class LoginController {
    private service.AuthenticationService authService;

    public LoginController(service.AuthenticationService authService) {
        this.authService = authService;
    }

    public boolean login(String username, String password) {
        return authService.authenticate(username, password);
    }
}
