package cigma.pfe.service;

import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepository;
import cigma.pfe.repositories.ClientRepositoryImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class ClientServiceImpl implements ClientService{
    //ApplicationContext ctx=new ClassPathXmlApplicationContext(springs.xml);
    ClientRepository clientRepository;
    @Override
    public Client save(Client c) {
        System.out.println("Service Layer : ClientServiceImpl Level... ");
        return  clientRepository.save(c);

    }
    public ClientServiceImpl() {
        System.out.println("cretation objet service");
}}
