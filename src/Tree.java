public class Tree {
    private int value;
    private Tree left;
    private Tree right;

    public Tree(int value){
        this.value = value;
        this.left = null;
        this.right = null;
    }

    public Tree(int value, Tree left){
        this.value = value;
        this.left = left;
        this.right = null;
    }

    public Tree (int value, Tree left, Tree right){
        this.value = value;
        this.left = left;
        this.right = right;
    }

    public void setLeft(Tree node){
        this.left = node;
    }

    public void setRight(Tree node){
        this.right = node;
    }

    public int getValue() {
        return value;
    }

    public Tree getLeft() {
        return left;
    }

    public Tree getRight() {
        return right;
    }

    public Tree removeNode(Tree root, int target) {
        if (root == null) {
            return null;
        }

        if (target < root.value) {
            root.left = removeNode(root.left, target);
        } else if (target > root.value) {
            root.right = removeNode(root.right, target);
        } else {
            // Nodo da rimuovere trovato

            // Caso 1: Nodo senza figli o con un solo figlio
            if (root.left == null) {
                return root.right;
            } else if (root.right == null) {
                return root.left;
            }

            // Caso 2: Nodo con due figli
            root.value = findMin(root.right);
            root.right = removeNode(root.right, root.value);
        }

        return root;
    }
    public int findMin(Tree root) {
        return root.left == null ? root.value : findMin(root.left);
    }

    public int findMax(Tree root) {
        if (root == null) {
            return 0;
        }

        int maxValue = root.value;
        int leftMax = findMax(root.left);
        int rightMax = findMax(root.right);

        if (leftMax > maxValue) {
            maxValue = leftMax;
        }

        if (rightMax > maxValue) {
            maxValue = rightMax;
        }

        return maxValue;
    }



}
