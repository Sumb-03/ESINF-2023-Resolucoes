import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.NoSuchElementException;
import java.util.Stack;

/*
 * @author DEI-ESINF
 * @param <E>
 */

public class TREE<E extends Comparable<E>> extends BST<E>{
 
   /*
   * @param element A valid element within the tree
   * @return true if the element exists in tree false otherwise
   */   
    public boolean contains(E element) {
         throw new UnsupportedOperationException("Not supported yet.");
    }

 
    public boolean isLeaf(E element){
         throw new UnsupportedOperationException("Not supported yet.");
    }

   /*
   * build a list with all elements of the tree. The elements in the 
   * left subtree in ascending order and the elements in the right subtree 
   * in descending order. 
   *
   * @return    returns a list with the elements of the left subtree 
   * in ascending order and the elements in the right subtree is descending order.
   */
    public Iterable<E> ascdes(){
        throw new UnsupportedOperationException("Not supported yet.");
    }

    private void ascSubtree(Node<E> node, List<E> snapshot) {
        throw new UnsupportedOperationException("Not supported yet.");          
    }
    
    private void desSubtree(Node<E> node, List<E> snapshot) {
        throw new UnsupportedOperationException("Not supported yet.");  
    }
   
    /**
    * Returns the tree without leaves.
    * @return tree without leaves
    */
    public BST<E> autumnTree() {
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private Node<E> copyRec(Node<E> node){
           throw new UnsupportedOperationException("Not supported yet.");
    }
    
    /**
    * @return the the number of nodes by level.
    */
    public int[] numNodesByLevel(){
        
       throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private void numNodesByLevel(Node<E> node, int[] result, int level){
        
        throw new UnsupportedOperationException("Not supported yet.");
        
    }
    
    public boolean perfectBalanced(){
        
       throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private boolean perfectBalanced(Node<E> node){
        
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    public E lowestCommonAncestor(E elem1, E elem2){
            
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    private Node<E> lowestCommonAncestor(Node<E> node, E elem1, E elem2){
        
        throw new UnsupportedOperationException("Not supported yet.");
    }
    
    
    public BST<E>  minCompletSubtree(E elem1, E elem2){
            
        throw new UnsupportedOperationException("Not supported yet.");
    }
    

    public BST<E>  construcTreeposOrder (ArrayList<E> posOrder){
            
        throw new UnsupportedOperationException("Not supported yet.");
    }
}
