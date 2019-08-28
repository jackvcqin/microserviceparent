import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Test {

    public static void main(String[] args){
        String str = "17001090122";
        String pattern = "^((17[0-9])|(13[0-9])|(147)|(15[^4,\\\\D])|(18[0-35-9]))\\\\d{8}$";

        Pattern r = Pattern.compile(pattern);
        Matcher m = r.matcher(str);
        System.out.println(m.matches());
    }

}
