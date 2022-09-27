import java.util.Stack;

class Bst {

    Node root = null;

    class Node {
        Node left;
        Node right;
        int data;

        Node(int data) {
            this.data = data;
            this.left = null;
            this.right = null;

        }
    }

    /////
    void inorder() {
        inorderRec(root);
    }

    void inorderRec(Node root) {
        if (root != null) {
            inorderRec(root.left);
            System.out.print(root.data + " -> ");
            inorderRec(root.right);
        }
    }

    ///////
    void preorder() {
        preorderRec(root);
    }

    void preorderRec(Node root) {
        if (root != null) {
            System.out.print(root.data + " -> ");
            preorderRec(root.left);

            preorderRec(root.right);
        }
    }

    ///////
    void postorder() {
        postorderRec(root);
    }

    void postorderRec(Node root) {

        if (root != null) {
            postorderRec(root.left);
            postorderRec(root.right);
            System.out.print(root.data + " -> ");
        }
    }

    /////
    void insert(int d) {
        Node newnode = new Node(d);
        if (root == null) {
            root = newnode;
        } else {
            Node temp = root;

            while (root.left != null || root.right != null) {
                if (newnode.data >= temp.data && temp.right != null) {
                    temp = temp.right;
                } else if (newnode.data < temp.data && temp.left != null) {
                    temp = temp.left;
                } else {
                    break;
                }
            }
            if (newnode.data >= temp.data) {

                temp.right = newnode;
            } else {

                temp.left = newnode;
            }

        }
    }
    void delete(){
        
    }
}

class BstDemo {

    public static void main(String[] args) {

        Bst obj = new Bst();
        obj.insert(10);
        obj.insert(0);
        obj.insert(20);
        obj.insert(50);
        obj.insert(1);

        obj.inorder();
        obj.inorder();
        System.out.println("");
        obj.preorder();
        System.out.println("");
        obj.postorder();

    }
}