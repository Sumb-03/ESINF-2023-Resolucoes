import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

/**
 * @author DEI-ESINF
 */
public class TREE_WORDS extends BST<TextWord> {

    public void createTree() throws FileNotFoundException {
        Scanner readfile = new Scanner(new File("xxx.xxx"));
        while (readfile.hasNextLine()) {
            String[] pal = readfile.nextLine().split("(\\,)|(\\s)|(\\.)");
            for (String word : pal)
                if (word.length() > 0)
                    insert(new TextWord(word, 1));
        }
        readfile.close();
    }

    /**
     * Inserts a new word in the tree, or increments the number of its occurrences.
     *
     * @param element
     */
    @Override
    public void insert(TextWord element) {
        if (root == null)
            root = new Node<>(element, null, null);
        else
            insert(element, root);
    }

    private Node<TextWord> insert(TextWord element, Node<TextWord> node) {
        if (node.getElement().compareTo(element) == 0)
            node.getElement().incOcorrences();
        else if (node.getElement().compareTo(element) > 0)
            if (node.getLeft() == null)
                node.setLeft(new Node<>(element, null, null));
            else
                insert(element, node.getLeft());
        else if (node.getRight() == null)
            node.setRight(new Node<>(element, null, null));
        else
            insert(element, node.getRight());

        return node;
    }

    /**
     * Returns a map with a list of words for each occurrence found.
     *
     * @return a map with a list of words for each occurrence found.
     */
    public Map<Integer, List<String>> getWordsOccurrences() {
        Map<Integer, List<String>> map = new TreeMap<>();
        getWordsOccurrences(root, map);
        return map;
    }

    private void getWordsOccurrences(Node<TextWord> root, Map<Integer, List<String>> map) {
        if (root == null)
            return;

        getWordsOccurrences(root.getLeft(), map);

        List<String> list = map.get(root.getElement().getOcorrences());
        if (list == null)
            list = new ArrayList<>();
        list.add(root.getElement().getWord());
        map.put(root.getElement().getOcorrences(), list);

        getWordsOccurrences(root.getRight(), map);
    }

}
