import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class CharacterSort {
    public static void main(String[] args){
        String s = "get taxt  from text text from from from";
        ArrayList<SortedList> wordSorted = new ArrayList<>();
        char ch = 't';
        List<String> string = getWordsForSearch(s);
        System.out.println("String: "+ string);
        System.out.println("Char: "+ch);

        System.out.println("SortedArray"+searchWords(ch,string,wordSorted).toString());

    }
    private static List<String> getWordsForSearch(String s){
        List<String> words = Arrays.asList(s.split("\\W+"));
        return words;
    }
    private static ArrayList searchWords(char myChar, List<String> string,ArrayList sort){
        for (String s :string){
            int count = 0;
            for (int c = 0;c<s.length();c++){
                if(s.charAt(c) == myChar){
                    count++;
                 }
            }

            sort.add(new SortedList(s,count));
        }
        Collections.sort(sort,Collections.reverseOrder( SortedList.COMPARE_BY_COUNT).thenComparing(SortedList.COMPARE_BY_TITLE));
        return sort;
    }
}

