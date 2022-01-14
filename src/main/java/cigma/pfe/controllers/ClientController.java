package cigma.pfe.controllers;
import cigma.pfe.models.Client;
import cigma.pfe.service.ClientService;
import cigma.pfe.service.ClientServiceImpl;

public class ClientController {

    ClientService clientService ;

    public void setClientService(ClientService clientService) {
        this.clientService = clientService;
    }

    public Client save(Client c ){
        System.out.println("ClientController level...");
        return clientService.save(c);


}
    public ClientController() {
        System.out.println("Call ClientController ....");
    }
}
