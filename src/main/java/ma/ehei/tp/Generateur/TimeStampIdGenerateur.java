package ma.ehei.tp.Generateur;

import java.text.SimpleDateFormat;
import java.util.Date;
import org.springframework.stereotype.Service;

@Service("timeStampGenerateur")
public class TimeStampIdGenerateur implements IdGenerateur {
	@Override
    public String generate() {
        Date date = new Date();
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormat.format(date);
    }
	

}
