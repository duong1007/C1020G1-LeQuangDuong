package java_collection_framework.bai_tap.postoder_delete_preorder_search;

import java_collection_framework.thuc_hanh.impelimentBTS.TreeNode;

public class BST<E extends Comparable<E>>{
    protected TreeNode<E> root;
    protected int size = 0;

    public BST() {
    }

    public boolean insert(E e) {
        if (root == null) {
            root = new TreeNode<>(e);

        } else {
            TreeNode<E> parent = null;
            TreeNode<E> cur = root;
            while (cur != null) {
                if (e.compareTo(cur.element) < 0) {
                    parent = cur;
                    cur = cur.left;
                } else if (e.compareTo(cur.element) > 0) {
                    parent = cur;
                    cur = cur.right;
                } else {
                    return false;
                }
            }
            if (e.compareTo(parent.element) < 0) {
                parent.left = new TreeNode<>(e);
            } else {
                parent.right = new TreeNode<>(e);
            }
        }
        size++;
        return true;
    }

    public void postOrder() {
        postOrder(root);
    }

    public void postOrder(TreeNode<E> root){
        if (root == null) return;
        postOrder(root.left);
        postOrder(root.right);
        System.out.println(root.element + " ");
    }

    public void preOrder() {
        preOrder(root);
    }

    public void preOrder(TreeNode<E> root) {
        if (root == null) return;
        System.out.println(root.element + " ");
        preOrder(root.left);
        preOrder(root.right);
    }

    public TreeNode<E> search(E key) {
        TreeNode<E> curr = root;

        while (curr != null && curr.element != key) {
            if (key.compareTo(curr.element) < 0) {
                curr = curr.left;

            } else {
                curr = curr.right;
            }
        }
        return curr;
    }

    private TreeNode<E> maximumKey(TreeNode<E> root){
        while (root.right != null) {
            root = root.right;
        }
        return root;
    }

    public TreeNode<E> delete(TreeNode<E> root, E key) {
        if (root == null) {
            return null;
        }

        if (key.compareTo(root.element) < 0) {
            root.left = delete(root.left, key);

        } else if (key.compareTo(root.element) > 0) {
            root.right = delete(root.right, key);
        } else {

            if (root.left == null && root.right == null) {
                return null;

            } else if (root.left != null && root.right != null) {

                TreeNode<E> predecessor = maximumKey(root.left);

                root.element = predecessor.element;

                root.left = delete(root.left, predecessor.element);

            } else {
                TreeNode<E> child;
                if (root.left != null) {
                    child = root.left;
                } else {
                    child = root.right;
                }
                root = child;
            }
        }
        return root;
    }
}
