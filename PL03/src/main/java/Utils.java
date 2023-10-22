import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author DEI-ESINF
 */
public class Utils {
    public static <E extends Comparable<E>> Iterable<E> sortByBST(List<E> listUnsorted){
        BST<E> bst = new BST<>();
        for(E e : listUnsorted){
            bst.insert(e);
        }
        return bst.inOrder();
    }    
}
