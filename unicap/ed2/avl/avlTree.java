package unicap.ed2.avl;

public class avlTree {

    private Node root;

    public avlTree() {
    }

    private Node insert(Node root, Integer key) {
        if (root == null) {
            return root = new Node(key);
        }
        if (key >= root.getValue()) {
            root.setRight(insert(root.getRight(), key));
            root.increaseRightHeight();
        } else if (key < root.getValue()) {
            root.setLeft(insert(root.getLeft(), key));
            root.increaseLeftHeight();
        } else {
            return root;
        }

        //int auxValue = root.getBalance();
        /*if (auxValue < -1 && key > root.getValue()) {
                System.out.println("RR ROTATION");
                return rotateRR(root);
            }

            if (auxValue > 1 && key < root.getLeft().getValue()) {
                System.out.println("LL ROTATION");
                return rotateLL(root);
            }

            if (auxValue > 1 && key > root.getLeft().getValue()) {
                System.out.println("LR ROTATION");
                return rotateLR(root);
            }

            if (auxValue < -1 && key < root.getRight().getValue()) {
                System.out.println("RL ROTATION");
                return rotateRL(root);
            }*/
        return checkBalance(root, key);

        //return root;
    }

    public Node add(Integer key) {
        return this.root = insert(this.root, key);
    }

    private Node rotateLL(Node node) {
        Node auxNode = node.getLeft();
        if (auxNode.getRight() != null) {
            Node nodeAux = auxNode.getRight();
            node.setLeft(nodeAux);
            auxNode.setRight(node);
        } else {
            auxNode.setRight(node);
            node.setLeft(null);
        }
        return auxNode;
    }

    private Node rotateRR(Node node) {
        Node auxNode = node.getRight();
        if (auxNode.getLeft() != null) {
            Node nodeAux = auxNode.getLeft();
            node.setRight(nodeAux);
            auxNode.setLeft(node);
        } else {
            auxNode.setLeft(node);
            node.setRight(null);
        }
        return auxNode;
    }

    private Node rotateLR(Node node) {
        node.getLeft().setLeft(rotateRR(node.getLeft()));
        return rotateLL(node);
    }

    private Node rotateRL(Node node) {
        node.setRight(rotateLL(node.getRight()));
        return rotateRR(node);

    }

    private Node checkBalance(Node balanceNode, Integer key) {
        int auxValue = balanceNode.getBalance();

        if (auxValue < -1 && key > root.getRight().getValue()) {
            return rotateRR(root);
        }

        if (auxValue > 1 && key < root.getLeft().getValue()) {
            return rotateLL(root);
        }

        if (auxValue > 1 && key > root.getLeft().getValue()) {
            return rotateLR(root);
        }

        if (auxValue < -1 && key < root.getRight().getValue()) {
            return rotateRL(root);
        }

        return balanceNode;
    }

    private Node removeNode(Node root, Integer key) {

        if (key > root.getValue()) {
            removeNode(root.getRight(), key);
            root.decreaseRightHeight();
        } else if (key < root.getValue()) {
            removeNode(root.getLeft(), key);
            root.decreaseLeftHeight();
        } else {
            if (root.getRight() != null) {
                Node auxNode = root.getRight();
                root = null;
                return root = auxNode;
            } else if (root.getRight() == null && root.getLeft() != null) {
                Node auxNode = root.getLeft();
                root = null;
                return root = auxNode;
            } else {
                return root = null;
            }
        }
        checkBalance(root, key);
        return null;
    }

    public Node remove(Integer key) {
        return this.root = removeNode(this.root, key);
    }

    public void insertRR(Integer key1, Integer key2, Integer key3) {
        add(key1);
        add(key2);
        add(key3);
        System.out.println("PRIMEIRA INSERÇÃO: " + key1);
        System.out.println("SEGUNDA INSERÇÃO: " + key2);
        System.out.println("TERCEIRA INSERÇÃO: " + key3);
        System.out.println("---------------------------");

    }

    public void insertLL(Integer key1, Integer key2, Integer key3) {
        add(key1);
        add(key2);
        add(key3);
        System.out.println("PRIMEIRA INSERÇÃO: " + key1);
        System.out.println("SEGUNDA INSERÇÃO: " + key2);
        System.out.println("TERCEIRA INSERÇÃO: " + key3);
        System.out.println("---------------------------");

    }

    public void insertRL(Integer key1, Integer key2, Integer key3) {
        add(key1);
        add(key2);
        add(key3);
        System.out.println("PRIMEIRA INSERÇÃO: " + key1);
        System.out.println("SEGUNDA INSERÇÃO: " + key2);
        System.out.println("TERCEIRA INSERÇÃO: " + key3);
        System.out.println("---------------------------");

    }

    public void insertLR(Integer key1, Integer key2, Integer key3) {
        add(key1);
        add(key2);
        add(key3);
        System.out.println("PRIMEIRA INSERÇÃO: " + key1);
        System.out.println("SEGUNDA INSERÇÃO: " + key2);
        System.out.println("TERCEIRA INSERÇÃO: " + key3);
        System.out.println("---------------------------");
    }

    /**
     * Funções de impressão
     */
    public void getRight() {
        System.out.println(this.root.getRight().getValue());
    }

    public void getLeft() {
        System.out.println(this.root.getLeft().getValue());
    }

    public void getRoot() {
        System.out.println(this.root.getValue());
    }

    public void rootBalance() {
        System.out.println(this.root.getBalance());
    }

}
