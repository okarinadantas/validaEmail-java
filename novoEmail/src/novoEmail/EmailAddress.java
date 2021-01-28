package novoEmail;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import javax.jws.WebService;


@WebService(targetNamespace = "http://novoEmail/", portName = "EmailAddressPort", serviceName = "EmailAddressService")


public class EmailAddress {
	
		
	public String operator = "^(.+)@(\\S+)$";
	public Pattern pattern = Pattern.compile(operator);
	
	public boolean validarEmailAddress (String operator) {
		Matcher matcher = pattern.matcher(operator);
		return matcher.matches();
	}
}



