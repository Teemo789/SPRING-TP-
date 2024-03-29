package ma.ehei.tp.Generateur;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service("prefixe")
public class PrefixeGenerateur {
    private static int id =0;
    @Value("${app.prefixe}")
    String idGenerer;
    public String generate() {
        id++;
        return idGenerer+id;
    }

}
