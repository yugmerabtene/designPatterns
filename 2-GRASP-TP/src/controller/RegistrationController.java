package controller;


import service.RegistrationService;

// Controller - RegistrationController.java
// Ce contr�leur est responsable des actions li�es � l'enregistrement, respectant le principe Contr�leur.

public class RegistrationController {
    private RegistrationService regService;

    public RegistrationController(RegistrationService regService) {
        this.regService = regService;
    }

    public boolean register(String username, String password) {
        return regService.register(username, password);
    }
}

