package ws;


import jakarta.jws.WebMethod;
import jakarta.jws.WebParam;
import jakarta.jws.WebService;

import java.util.Date;
import java.util.List;

@WebService(serviceName = "BanqueWS")
public class BanqueService {
    @WebMethod(operationName = "ConversionEuroToDH")
    public double conversion(@WebParam(name = "montant") double mt) {
        return mt*11;
    }

    @WebMethod(operationName = "getCompte")
    public Compte getCompte(@WebParam(name = "code")int code) {
        return new Compte(code, Math.random()*6000, new Date());
    }

    @WebMethod(operationName = "getComptes")
    public List<Compte> getComptes() {
        return List.of(
                new Compte(1, Math.random()*6000, new Date()),
                new Compte(2, Math.random()*6000, new Date()),
                new Compte(3, Math.random()*6000, new Date())
        );
    }
}
