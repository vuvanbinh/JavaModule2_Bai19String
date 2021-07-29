package baiTap1_validateClassName;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ClassNameExample {
    private static final String CLASS_NAME = "^[C|A|P]{1}[0-9]{4}[G|H|I|K|L|M]{1}$";

    public ClassNameExample() {
    }
    public boolean validate(String regex){
        Pattern pattern = Pattern.compile(CLASS_NAME);
        Matcher matcher = pattern.matcher(regex);
        return matcher.matches();
    }
}
