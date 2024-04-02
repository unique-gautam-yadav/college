public class Main {
    // public static void main(String... args) {
    public static void main(String[] args) {
        MyTree t = new MyTree();

        t.levelOrderInsert(25);
        t.levelOrderInsert(15);
        t.levelOrderInsert(50);
        t.levelOrderInsert(10);
        t.levelOrderInsert(22);
        t.levelOrderInsert(35);
        t.levelOrderInsert(70);
        t.levelOrderInsert(4);
        t.levelOrderInsert(12);
        t.levelOrderInsert(18);
        t.levelOrderInsert(24);
        t.levelOrderInsert(31);
        t.levelOrderInsert(44);
        t.levelOrderInsert(66);
        t.levelOrderInsert(90);

        t.bstInsert(99);

        // t.levelOrderTraverse();

        // t.inorder();
        // System.out.println();
        // t.preorder();
        // System.out.println();
        // t.postorder();
        // System.out.println();

        // t.height();

        // System.out.println(t.countLeafNode());
        // System.out.println(t.countNode());
        System.out.println(t.isBalance());
    }
}
