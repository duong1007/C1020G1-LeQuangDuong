package search_algorithm.bai_tap.binary_search_algorithm;


public class AlgorithmTree<E> {
    public int elements;
    public AlgorithmTree<E> left;
    public AlgorithmTree<E> right;

    public AlgorithmTree(int elements) {
        this.elements = elements;
    }

    public AlgorithmTree<E> searchRecur(AlgorithmTree<E> root, int key) {
        if(root == null){
            return null;
        }
        if (key < root.elements) {
            root.left = searchRecur(root.left, key);
        }
        if (key > root.elements) {
            root.right = searchRecur(root.right,key);
        }
        return root;
    }

    @Override
    public String toString() {
        return "elements =" + elements +
                ", left =" + left.elements +
                ", right =" + right.elements +
                '}';
    }
}
