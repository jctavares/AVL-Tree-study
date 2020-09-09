package unicap.ed2.avl;

public class UnicapEd2Avl {

    public static void main(String[] args) {
        avlTree leftLeft = new avlTree();
        avlTree rightRight = new avlTree();
        avlTree rightLeft = new avlTree();
        avlTree leftRight = new avlTree();

        System.out.println("INSERÇÃO LL: ");
        leftLeft.insertLL(1, 2, 3);
        System.out.println("Raíz da nova árvore: ");
        leftLeft.getRoot();
        System.out.println("Filho à direita: ");
        leftLeft.getRight();
        System.out.println("Filho à esquerda: ");
        leftLeft.getLeft();
        System.out.println("---------------------------");
        System.out.println("\n");
        
        
        System.out.println("INSERÇÃO RR");
        rightRight.insertRR(3, 2, 1);
        System.out.println("Raíz da nova árvore: ");
        rightRight.getRoot();
        System.out.println("Filho à direita: ");
        rightRight.getRight();
        System.out.println("Filho à esquerda: ");
        rightRight.getLeft();
        System.out.println("---------------------------");
        System.out.println("\n");
        
        System.out.println("INSERÇÃO RL");
        rightLeft.insertRR(6, 8, 7);
        System.out.println("Raíz da nova árvore: ");
        rightLeft.getRoot();
        System.out.println("Filho à direita: ");
        rightLeft.getRight();
        System.out.println("Filho à esquerda: ");
        rightLeft.getLeft();
        System.out.println("---------------------------");
        System.out.println("\n");
        
        System.out.println("INSERÇÃO LR");
        leftRight.insertRR(3, 1, 2);
        System.out.println("Raíz da nova árvore: ");
        leftRight.getRoot();
        System.out.println("Filho à direita: ");
        leftRight.getRight();
        System.out.println("Filho à esquerda: ");
        leftRight.getLeft();
        System.out.println("---------------------------");        

    }

}
