

import java.util.*;

public class WordInString {
    public static void main(String[] args){
        String s = "get text  from text text from from from";
        ArrayList<SortedList> wordSorted = new ArrayList<>();
        List<String> words = Arrays.asList("text","new","from");
        List<String> string = getWordsForSearch(s);
        System.out.println("String: "+ string);
        System.out.println("Array: "+words);

        System.out.println("SortedArray"+searchWords(words,string,wordSorted).toString());

    }
    private static List<String> getWordsForSearch(String s){
        List<String> words = Arrays.asList(s.split("\\W+"));
        return words;
    }
    private static ArrayList searchWords(List<String> words, List<String> string,ArrayList sort){

        for (int w = 0; w<words.size();w++){
            int count = 0;
            for (String s :string){
                if(s.equals(words.get(w))){
                    count++;
                }
            }
            sort.add(new SortedList(words.get(w),count));
        }
        Collections.sort(sort,Collections.reverseOrder( SortedList.COMPARE_BY_COUNT));
        return sort;
    }
}
