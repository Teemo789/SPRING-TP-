package ma.ehei.tp.Generateur;

import org.springframework.stereotype.Service;

@Service("autoIncrement")

public class AutoIncrementGenerateur implements IdGenerateur {
	 private static int id =0;
	    @Override
	    public String generate() {
	        id++;
	        return String.valueOf(id);
	    }

}
