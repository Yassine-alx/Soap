package ws;

import jakarta.xml.ws.Endpoint;

public class ServerJWS {
    public static void main(String[] args) {
        Endpoint.publish("http://localhost:8081/", new BanqueService());
        System.out.println("web service deployed sur http://localhost:8081/");
    }
}
