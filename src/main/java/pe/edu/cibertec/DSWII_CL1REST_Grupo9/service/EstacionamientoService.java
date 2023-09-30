package pe.edu.cibertec.DSWII_CL1REST_Grupo9.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_CL1REST_Grupo9.model.EstacionamientoModel;

@Service
public class EstacionamientoService {
    public double calcularTotal(int horas, int minutos) {
        EstacionamientoModel model = new EstacionamientoModel();
        return model.calcularTotal(horas, minutos);
    }
}
