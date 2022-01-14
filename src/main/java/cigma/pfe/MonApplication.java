package cigma.pfe;

import cigma.pfe.controllers.ClientController;
import cigma.pfe.models.Client;
import cigma.pfe.repositories.ClientRepositoryImpl;
import cigma.pfe.service.ClientServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MonApplication {
    public static void main(String[] args) {
        //ClientController ctrl1 = new ClientController();
        // Client client =new Client(1L,"testing");
        //ctrl1.save(client);
        ApplicationContext ctx=new ClassPathXmlApplicationContext("springs.xml");
       // ApplicationContext context=new ClassPathXmlApplicationContext("Spring.xml");
        ClientController ctrl = (ClientController) ctx.getBean("controller");
        ClientServiceImpl ctser = (ClientServiceImpl) ctx.getBean("idserv");
        ClientRepositoryImpl ctrep = (ClientRepositoryImpl) ctx.getBean("idrepo");


    }
}
