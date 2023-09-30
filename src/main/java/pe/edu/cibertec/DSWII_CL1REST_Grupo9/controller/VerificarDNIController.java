package pe.edu.cibertec.DSWII_CL1REST_Grupo9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.DSWII_CL1REST_Grupo9.request.VerificarDNIModel;
import pe.edu.cibertec.DSWII_CL1REST_Grupo9.model.VerificarDNIService;


@RestController
public class VerificarDNIController {

    @Autowired
    private VerificarDNIService verificarDNIService;

    @PostMapping("/verificarDNI")
    public String verificarDNI(@RequestBody VerificarDNIModel verificarDNIModel) {
        boolean debeRenovarDNI = verificarDNIService.debeRenovarDNI(verificarDNIModel.getAnoNacimiento());

        if (debeRenovarDNI) {
            return "Debes renovar tu DNI.";
        } else {
            return "No es necesario renovar tu DNI en este momento.";
        }
    }
}
