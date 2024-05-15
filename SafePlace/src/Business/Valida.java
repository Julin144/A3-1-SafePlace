import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Validate {
    private static final String EMAIL_REGEX = "^[a-zA-Z0-9_+&*-]+(?:\\.[a-zA-Z0-9_+&*-]+)*@(?:[a-zA-Z0-9-]+\\.)+[a-zA-Z]{2,7}$"
    private static final String CPF_REGEX ="^(\\d{3}\\.\\d{3}\\.\\d{3}-\\d{2})|(\\d{11})$";

    public static boolean validateEmail(String email) {
        Pattern pattern = Pattern.compile(EMAIL_REGEX);
        Matcher matcher = pattern.matcher(email);
        return matcher.matches();
    }

    public static boolean validateCPF(String cpf) {
        Pattern pattern = Pattern.compile(CPF_REGEX);
        Matcher matcher = pattern.matcher(cpf);
        return matcher.matches();
    }

}
