package controller;


import service.RegistrationService;

// Controller - RegistrationController.java
// Ce contrôleur est responsable des actions liées à l'enregistrement, respectant le principe Contrôleur.

public class RegistrationController {
    private RegistrationService regService;

    public RegistrationController(RegistrationService regService) {
        this.regService = regService;
    }

    public boolean register(String username, String password) {
        return regService.register(username, password);
    }
}

