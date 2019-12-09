import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class WordLenghtReplace {
    public static void main(String[] args){
        String s = "get text  from textio textsss froms frocdm from";
        int len = 4;
        String repString = "love";
        System.out.println(replace(getWordsForSearch(s),len,repString));
    }

    private static List<String> getWordsForSearch(String s){
        List<String> words = Arrays.asList(s.split("\\W+"));
        return words;
    }
    private static String replace(List<String> words, int len, String newString){
        words.forEach((w) -> {
            if (w.length() == len){
                System.out.println("new  "+w);
                words.set(words.indexOf(w),newString);
            }
        });
        return words.toString();
    }
}
