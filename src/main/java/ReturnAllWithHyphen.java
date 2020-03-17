import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class ReturnAllWithHyphen {
    public static ArrayList<String> regex(String inputText){
        ArrayList<String> wordsWithHyphen = new ArrayList<String>();
        Pattern pattern = Pattern.compile("([a-z0-9])+-([a-z0-9])+(\\s|,|!|\\.|\\?|)", Pattern.CASE_INSENSITIVE);
        Matcher matcher = pattern.matcher(inputText);
        while (matcher.find()){
            wordsWithHyphen.add(matcher.group());
        }
        return wordsWithHyphen;
    }
}
