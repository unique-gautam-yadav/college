import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        BST t = new BST();

        t.insert(25);
        t.insert(15);
        t.insert(50);
        t.insert(10);

        t.insert(22);
        t.insert(35);
        t.insert(70);
        t.insert(4);

        t.insert(12);
        t.insert(18);
        t.insert(24);
        t.insert(31);

        t.insert(44);
        t.insert(66);
        t.insert(90);

        ArrayList<TreeNode> al = t.inorderToList();

        System.out.println(al.toString());
    }
}