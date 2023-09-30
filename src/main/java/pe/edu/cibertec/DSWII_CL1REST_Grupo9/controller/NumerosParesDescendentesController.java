package pe.edu.cibertec.DSWII_CL1REST_Grupo9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.DSWII_CL1REST_Grupo9.model.NumerosParesDescendentesModel;
import pe.edu.cibertec.DSWII_CL1REST_Grupo9.request.NumerosParesDescendentesRequest;
import pe.edu.cibertec.DSWII_CL1REST_Grupo9.service.NumerosParesDescendentesService;

@RestController
public class NumerosParesDescendentesController {

    @Autowired
    private NumerosParesDescendentesModel numerosParesDescendentesService;

    @PostMapping("/calcularNumero")
    public int calcularNumero(@RequestBody NumerosParesDescendentesRequest numerosParesDescendentesRequest){
        return NumerosParesDescendentesService.calcularNumero(numerosParesDescendentesRequest.getNum1());
    }

}
