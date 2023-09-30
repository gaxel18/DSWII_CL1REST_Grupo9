package pe.edu.cibertec.DSWII_CL1REST_Grupo9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.DSWII_CL1REST_Grupo9.request.NotaRequest;
import pe.edu.cibertec.DSWII_CL1REST_Grupo9.service.NotasService;

@RestController
public class NotasController {

    @Autowired
    private NotasService notasService;

    @PostMapping("/calcularPromedio")
    public double calcularPromedio(@RequestBody NotaRequest request){
        return notasService.calcularPromedio(request.getNotas());
    }
}
