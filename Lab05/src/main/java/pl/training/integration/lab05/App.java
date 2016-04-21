package pl.training.integration.lab05;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {

    public static void main(String[] args) throws InterruptedException {
        try (ClassPathXmlApplicationContext applicationContext = new ClassPathXmlApplicationContext("beans.xml")) {
            NBPGateway nbpGateway = applicationContext.getBean("nbp", NBPGateway.class);
            nbpGateway.refresh("now");
            Thread.sleep(20000);
        }
    }

}
