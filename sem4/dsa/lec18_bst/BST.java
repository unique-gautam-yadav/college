import java.util.ArrayList;

public class BST {
    TreeNode root;

    boolean isEmpty() {
        return root == null;
    }

    public TreeNode delete(TreeNode node, int data) {
        if (node == null) {
            return null;
        }
        if (data < node.data) {
            node.left = delete(node.left, data);
        } else if (data > node.data) {
            node.right = delete(node.right, data);
        } else {
            if (node.left == null && node.right == null) {
                return null;
            }

            if (node.left == null) {
                return node.right;
            } else if (node.right == null) {
                return node.left;
            } else {
                TreeNode s = successor(node.data);
                node.data = s.data;
                node.right = delete(node.right, s.data);
            }
        }
        return node;

    }

    public void bstInsert(int data) {
        if (root == null) {
            root = new TreeNode(data);
        }

        TreeNode temp = root;

        while (true) {

            if (data < temp.data) {
                if (temp.left == null) {
                    break;
                }
                temp = temp.left;
            }

            else {
                if (temp.right == null) {
                    break;
                }
                temp = temp.right;
            }
        }

        if (temp.data > data) {
            temp.left = new TreeNode(data);
        } else {
            temp.right = new TreeNode(data);
        }
    }

    public void insert(int data) {
        root = insert(root, data);
    }

    private TreeNode insert(TreeNode node, int data) {
        if (node == null) {
            return new TreeNode(data);
        }

        if (data < node.data) {
            node.left = insert(node.left, data);
        } else {
            node.right = insert(node.right, data);
        }
        return node;

    }

    public void preorder() {
        _preorder(root);
    }

    private void _preorder(TreeNode node) {
        if (node != null) {
            System.out.print(node.data + "  ");
            _preorder(node.left);
            _preorder(node.right);
        }
    }

    public TreeNode successor(int value) {
        ArrayList<TreeNode> l = new ArrayList<TreeNode>();

        l = _inorder(root, l);

        int i = -1;

        for (TreeNode t : l) {

            if (t.data == value) {
                i = l.indexOf(t);
            }

        }

        return (i == -1 || i == l.size() - 1) ? null : l.get(i + 1);

    }

    public TreeNode pre(int value) {
        ArrayList<TreeNode> l = new ArrayList<TreeNode>();

        l = _inorder(root, l);

        int i = -1;

        for (TreeNode t : l) {
            if (t.data == value) {
                i = l.indexOf(t);
            }
        }

        return (i <= 0) ? null : l.get(i - 1);

    }

    public void postorder() {
        _postorder(root);
    }

    private void _postorder(TreeNode node) {
        if (node != null) {
            _postorder(node.left);
            _postorder(node.right);
            System.out.print(node.data + "  ");
        }
    }

    public void inorder() {
        _inorder(root);
    }

    private void _inorder(TreeNode node) {
        if (node != null) {
            _inorder(node.left);
            System.out.print(node.data + "  ");
            _inorder(node.right);
        }
    }

    public ArrayList<TreeNode> inorderToList() {
        ArrayList<TreeNode> al = new ArrayList<TreeNode>();
        al = _inorder(root, al);
        return al;
    }

    private ArrayList<TreeNode> _inorder(TreeNode node, ArrayList<TreeNode> al) {
        if (node != null) {
            _inorder(node.left, al);
            al.add(node);
            _inorder(node.right, al);
        }
        return al;
    }
}
