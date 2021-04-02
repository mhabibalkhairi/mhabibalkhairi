package ExceptionsListsThreadsAndFiles;
import javafx.beans.binding.ListExpression;
import javafx.beans.binding.SetExpression;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class Iterators1 {
    private static SetExpression<Object> list;

    public static void main(String[] args) {
        Iterator<Object> it = list.iterator();
        while(it.hasNext()){
            System.out.println(it.next());
        }
    }
}