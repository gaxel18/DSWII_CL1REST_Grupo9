package pe.edu.cibertec.DSWII_CL1REST_Grupo9.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_CL1REST_Grupo9.model.NotaModel;

@Service
public class NotasService {
    public double calcularPromedio(double[] notas){
        NotaModel model = new NotaModel();
        return model.calcularPromedio(notas);
    }
}
