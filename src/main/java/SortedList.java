import java.io.Serializable;
import java.util.Comparator;

public class SortedList implements Serializable
{
    String title;
    int count;

    SortedList(String t, int c){
        title=t;
        count=c;
    }
    public String getTitle(){
        return title;
    }
    public int getCount(){
        return count;
    }

    @Override
    public String toString() {
        return title;
    }

    public static final Comparator<SortedList> COMPARE_BY_COUNT = new Comparator<SortedList>() {
        @Override
        public int compare(SortedList sortedList, SortedList t1) {
            return sortedList.getCount()-t1.getCount();
        }
    };
    public static final Comparator<SortedList> COMPARE_BY_TITLE = new Comparator<SortedList>() {
        @Override
        public int compare(SortedList sortedList, SortedList t1) {
            return sortedList.getTitle().compareTo(t1.getTitle());
        }
    };
}