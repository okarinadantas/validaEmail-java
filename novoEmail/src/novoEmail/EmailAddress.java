package novoEmail;

import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.jws.WebService;

@WebService(targetNamespace = "http://novoEmail/", portName = "EmailAddressPort", serviceName = "EmailAddressService")
public class EmailAddress {
    private Pattern pattern;
    
    public EmailAddress() {
        pattern = Pattern.compile("^(.+)@(\\S+)$");
    }
    
    public boolean validarEmailAddress(String email) {
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }
}
