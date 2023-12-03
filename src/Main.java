public class Main {
    public static void main(String[] args) {
        Tree r = new Tree(10,
                new Tree(9,
                        new Tree(-7,
                                new Tree(-5),
                                new Tree(-4)),
                        new Tree(-6,
                                new Tree(-3),
                                new Tree(-2)))
                        ,
                new Tree(8,
                        new Tree(7,
                                new Tree(5),
                                new Tree(4)),
                        new Tree(6,
                                new Tree(3),
                                new Tree(2)))
        );

        printTree(r);

    }
    private static void printTree(Tree root) {
        printTreeRecursive(root, 0);
    }

    private static void printTreeRecursive(Tree root, int depth) {
        if (root != null) {
            printSpaces(depth);
            System.out.println(root.getValue());
            printTreeRecursive(root.getLeft(), depth + 1);
            printTreeRecursive(root.getRight(), depth + 1);
        }
    }

    private static void printSpaces(int count) {
        for (int i = 0; i < count * 4; i++) {
            System.out.print(" ");
        }
    }
}


