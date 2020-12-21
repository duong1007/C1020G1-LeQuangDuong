package regex.bai_tap.validate_class_name;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {

    private static final String CLASS_NAME_REGEX = "^[CAP]\\d{4,}[GHIKLM]$";

    public ClassNameExample() {
    }

    public boolean validate (String regex) {
        Pattern pattern = Pattern.compile(CLASS_NAME_REGEX);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
