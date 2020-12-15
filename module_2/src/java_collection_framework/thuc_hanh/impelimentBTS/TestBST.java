package java_collection_framework.thuc_hanh.impelimentBTS;


public class TestBST {
    public static void main(String[] args) {
        BST<Integer> tree = new BST<>();
        tree.insert(60);
        tree.insert(100);
        tree.insert(50);
        tree.insert(63);
        tree.insert(48);
        tree.insert(56);
        tree.insert(24);
        System.out.println("Inorder (sorted): ");
        tree.inorder();
        System.out.println("The number of nodes is: " + tree.getSize());
    }
}
