
package unicap.ed2.avl;


public class Node {
    
    private Integer keyValue;
    private int rightHeight, leftHeight, totalHeight;
    private Node leftNode, rightNode;
    
    public Node(Integer key) {
        this.keyValue = key;
        this.rightHeight = 0;
        this.leftHeight = 0;
        this.totalHeight = 0;
        this.totalHeight = 0;
        this.leftNode = null;
        this.rightNode = null;
    }
    
    public Integer getValue() {
        return this.keyValue;
    }
    
    public Node getLeft() {
        return this.leftNode;
    }
    
    public Node getRight() {
        return this.rightNode;
    }
    
    public Integer setKey(Integer key) {
        return this.keyValue = key;
    }
    
    public Node setRight(Node right) {
        return this.rightNode = right;            
    }
    
    public Node setLeft(Node left) {
        return this.leftNode = left;
    }
    
    public int increaseRightHeight() {
        return this.rightHeight++;
    }
    
    public int rightHeightValue() {
        return this.rightHeight;
    }
    
    public int increaseLeftHeight() {
        return this.leftHeight++;
    }
    
    public int decreaseRightHeight() {
        return this.rightHeight--;
    }
    
    public int decreaseLeftHeight() {
        return this.leftHeight--;
    }
    
    public int getBalance() {
        return this.leftHeight - this.rightHeight;
    }
    
    public int getHeight() {
        return this.totalHeight;
    }
    
    
}
