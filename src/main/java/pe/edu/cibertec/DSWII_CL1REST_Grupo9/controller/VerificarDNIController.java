package pe.edu.cibertec.DSWII_CL1REST_Grupo9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.DSWII_CL1REST_Grupo9.model.Persona;
import pe.edu.cibertec.DSWII_CL1REST_Grupo9.service.VerificarDNIService;


@RestController
@RequestMapping("/verificarDNI")
public class VerificarDNIController {

    @Autowired
    private VerificarDNIService verificarDNIService;

    @PostMapping
    public String verificarDNI(@RequestBody Persona persona) {
        boolean debeRenovarDNI = verificarDNIService.debeRenovarDNI(persona.getAnoNacimiento());

        if (debeRenovarDNI) {
            return "Debes renovar tu DNI.";
        } else {
            return "No es necesario renovar tu DNI en este momento.";
        }
    }
}
