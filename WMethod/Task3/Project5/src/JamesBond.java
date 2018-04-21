
import java.util.regex.Pattern;
import java.util.regex.Matcher;


public class JamesBond {
	
	public boolean bondRegex(String input)
	{
		Pattern p = Pattern.compile(".*\\(.*(\\s0)(\\s0)(\\s7).*\\).*");
		Matcher m = p.matcher(input);
		return m.find();
	}

}
