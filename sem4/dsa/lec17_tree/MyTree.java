import java.util.LinkedList;
import java.util.Queue;

public class MyTree {
    TreeNode root;

    public void levelOrderInsert(int data) {
        TreeNode n = new TreeNode(data);

        if (root == null) {
            root = n;
            return;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.offer(root);

        while (true) {
            TreeNode temp = queue.poll();

            if (temp.left != null) {
                queue.offer(temp.left);
            } else {
                temp.left = n;
                break;
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            } else {
                temp.right = n;
                break;
            }
        }
    }

    public void levelOrderTraverse() {
        if (root == null) {
            return;
        }

        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        queue.offer(root);

        while (!queue.isEmpty()) {
            TreeNode temp = queue.poll();

            System.out.println(temp.data);

            if (temp.left != null) {
                queue.offer(temp.left);
            }
            if (temp.right != null) {
                queue.offer(temp.right);
            }

        }
    }

    public void preorder() {
        preorderR(root);
    }

    public void postorder() {
        postorderR(root);
    }

    public void inorder() {
        inorderR(root);
    }

    private void preorderR(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + "  ");
            preorderR(node.left);
            preorderR(node.right);
        }
    }

    private void postorderR(TreeNode node) {
        if (node != null) {
            preorderR(node.left);
            preorderR(node.right);
            System.out.print(node.data + "  ");
        }
    }

    private void inorderR(TreeNode node) {
        if (node != null) {
            preorderR(node.left);
            System.out.print(node.data + "  ");
            preorderR(node.right);
        }
    }

    public int height() {

        int len = height(root);
        System.out.println(len);

        return len;

    }

    private int height(TreeNode node) {
        if (node == null) {
            return 0;
        }
        return Math.max(height(node.left), height(node.right)) + 1;
    }

    public int countNode() {
        if (root == null)
            return 0;

        return countNode(root);

    }

    public int countLeafNode() {
        if (root == null)
            return 0;

        return countLeafNode(root);

    }

    private int countNode(TreeNode node) {
        if (node == null) {
            return 0;
        } else {
            return countNode(node.left) + countNode(node.right) + 1;
        }
    }

    private int countLeafNode(TreeNode node) {
        if (node.left == null && node.right == null) {
            return 1;
        } else {
            return countLeafNode(node.left) + countLeafNode(node.right);
        }
    }

    public boolean isBalance() {
        return isBalance(root);
    }

    private boolean isBalance(TreeNode node) {
        if (node == null) {
            return true;
        }

        int lh = height(root.left);
        int rh = height(root.right);

        int m = lh - rh;

        if (Math.abs(m) > 1) {
            return false;
        }

        return isBalance(node.left) && isBalance(node.right);

    }

    public void bstInsert(int data) {
        if (root == null) {
            root = new TreeNode(data);
        }

        TreeNode temp = root;

        while (true) {

            if (data < temp.data) {
                if (temp.left == null)
                    break;
                temp = temp.left;
            }

            if (data > temp.data) {
                if (temp.right == null)
                    break;
                temp = temp.right;
            }
        }

        if (temp.data == data) {
            System.out.println("Alredy exists");
        }

        if (temp.data > data) {
            System.out.println("TO left of " + temp.data);
        } else {
            System.out.println("To right of " + temp.data);
        }
    }
}
