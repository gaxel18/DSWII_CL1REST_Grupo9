package pe.edu.cibertec.DSWII_CL1REST_Grupo9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import pe.edu.cibertec.DSWII_CL1REST_Grupo9.model.AlmacenModel;
import pe.edu.cibertec.DSWII_CL1REST_Grupo9.request.AlmacenRequest;

@RestController
public class AlmacenController {
    @Autowired
    private AlmacenModel almacenService;

    @PostMapping("/calcularPrecioTotal")
    public double calcularPrecioTotal(@RequestBody AlmacenRequest almacenRequest) {
        return almacenService.calcularPrecioTotal(almacenRequest.getPrecio(), almacenRequest.getCantidad());
    }
}
