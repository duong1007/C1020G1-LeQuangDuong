package search_algorithm.bai_tap.binary_search_algorithm;



public class MainTest {
    static AlgorithmTree<Integer> root = new AlgorithmTree<>(10);
    public static void main(String[] args) {
        insert(5);
        insert(6);
        insert(10);
        insert(15);
        insert(4);
        inOrder(root);

        System.out.println(root.searchRecur(root, 10));
    }


    public static boolean insert(Integer e) {
        if (root == null) {
            root = new AlgorithmTree<>(e);

        } else {
            AlgorithmTree<Integer> parent = null;
            AlgorithmTree<Integer> cur = root;
            while (cur != null) {
                if (e < cur.elements) {
                    parent = cur;
                    cur = cur.left;
                } else if (e > cur.elements) {
                    parent = cur;
                    cur = cur.right;
                } else {
                    return false;
                }
            }
            if (e < parent.elements) {
                parent.left = new AlgorithmTree<>(e);
            } else {
                parent.right = new AlgorithmTree<>(e);
            }
        }
        return true;
    }

    public static void inOrder(AlgorithmTree<?> root) {
        if (root == null) return;
        inOrder(root.left);
        System.out.println(root.elements + " ");
        inOrder(root.right);
    }
}
