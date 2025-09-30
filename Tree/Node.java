package Tree;

class Node{
    int key;
    Node left;
    Node right;

    public Node(int item) {
         key = item;
        left = right = null;
    }
}
class BinarySearchTree{
    Node root;

    public BinarySearchTree(Node root) {
        root = null;
    }
    void insert(int key){
        root = insertRec(root, key);
    }
    Node insertRec(Node root, int key){
        if (root == null){
            root = new Node(key);
            return root;
        } else if (key < root.key) {
            root = insertRec(root.left, key);

            
        }
        return root;

    }
}