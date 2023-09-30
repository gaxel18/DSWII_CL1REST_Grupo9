package pe.edu.cibertec.DSWII_CL1REST_Grupo9.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_CL1REST_Grupo9.model.AlmacenModel;

@Service
public class AlmacenService {
    public double calcularPrecioTotal(double precio, int cantidad) {
        AlmacenModel almacenModel = new AlmacenModel();
        return almacenModel.calcularPrecioTotal(precio, cantidad);
    }
}
