package ma.ehei.tp.configuration;

import ma.ehei.tp.Dao.EtudiantDao;

import ma.ehei.tp.Dao.MYSQLEtudiantDao;

import org.springframework.context.annotation.*;
import ma.ehei.tp.Dao.MemoireEtudiantDao;
@Configuration
@ComponentScan(basePackages = "ma.ehei.tp")
@PropertySource("classpath:app.properties")
@ImportResource("classpath:spring-config.xml")
public class AppConfig {

    @Bean("mysql")
    public EtudiantDao mysqlEtudiantDao(){
        return new MYSQLEtudiantDao();
    }

    @Bean("memoire")
    public EtudiantDao memoireEtudiantDAO(){
        return new MemoireEtudiantDao();
    }
}