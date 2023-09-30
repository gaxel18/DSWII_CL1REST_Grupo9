package pe.edu.cibertec.DSWII_CL1REST_Grupo9.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pe.edu.cibertec.DSWII_CL1REST_Grupo9.request.EstacionamientoRequest;
import pe.edu.cibertec.DSWII_CL1REST_Grupo9.service.EstacionamientoService;

@RestController
public class EstacionamientoController {
    @Autowired
    private EstacionamientoService estacionamientoService;

    @PostMapping("/calcular_Total")
    public double calculateParkingFee(@RequestBody EstacionamientoRequest request) {
        return estacionamientoService.calcularTotal(request.getHoras(), request.getMinutos());
    }
}
