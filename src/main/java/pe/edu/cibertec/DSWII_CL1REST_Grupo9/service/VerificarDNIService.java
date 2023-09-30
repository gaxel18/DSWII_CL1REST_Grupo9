package pe.edu.cibertec.DSWII_CL1REST_Grupo9.service;

import org.springframework.stereotype.Service;
import pe.edu.cibertec.DSWII_CL1REST_Grupo9.request.VerificarDNIModel;

@Service
public class VerificarDNIService {

    public int verificarDNI(int anoNacimiento){
        VerificarDNIModel verificarDNIModel = new VerificarDNIModel();
        return verificarDNIModel.verificarDNI(anoNacimiento);
    }

}
