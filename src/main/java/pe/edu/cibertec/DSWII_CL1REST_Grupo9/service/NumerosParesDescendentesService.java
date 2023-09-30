package pe.edu.cibertec.DSWII_CL1REST_Grupo9.service;

import pe.edu.cibertec.DSWII_CL1REST_Grupo9.model.NumerosParesDescendentesModel;

public class NumerosParesDescendentesService {
    public int calcularNumero(int num1){
        NumerosParesDescendentesModel numerosParesDescendentesModel = new NumerosParesDescendentesModel();
        return numerosParesDescendentesModel.calcularNumero(num1);
    }
}
