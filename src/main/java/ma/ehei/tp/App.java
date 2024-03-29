package ma.ehei.tp;

import ma.ehei.tp.configuration.AppConfig;
import ma.ehei.tp.service.facturation.FacturationService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        FacturationService facturationService = context.getBean(FacturationService.class);
        Double montantApresReduction = facturationService.appliquerReduction(100.0);
        System.out.println("montantApresReduction : " + montantApresReduction);

    }
}
