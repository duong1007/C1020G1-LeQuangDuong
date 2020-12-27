package commons.regex;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Regex {
    private static Pattern pattern;
    private Matcher matcher;

    public static final String ID_VILLA_REGEX = "^SVVL[-]\\d{4}$";

    public static final String ID_HOUSE_REGEX = "^SVHO[-]\\d{4}$";

    public static final String ID_ROOM_REGEX = "^SVRO[-]\\d{4}$";

    public static final String SV_NAME_REGEX = "^[A-Z]{1}[a-z]*$";

    public Regex(String regex) {
        pattern = Pattern.compile(regex);
    }

    public boolean validate(String regex) {
        matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}