import org.junit.Test;
import static org.junit.jupiter.api.Assertions.*;


public class myBinarySearchTreeNodeTest {

    @Test
    public void Tree( ){// testing the insert method with the array, its important to mke sure that this method works so that it adds to the tree if need be.
        int[] A = {0,1,2,3};
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(A);
        tree.insert(5);
        tree.insert(4);
        tree.insert(0);
        tree.print();

        assertEquals(0, tree.myValue); //the root
        assertEquals(1,tree.right.myValue);
        assertEquals(2, tree.right.right.myValue);
        assertEquals(3, tree.right.right.right.myValue);
        assertEquals(5, tree.right.right.right.right.myValue);
        assertEquals(4, tree.right.right.right.right.left.myValue);
    } //passed

    @Test
    public void Tree2(){ // testing the insert method with the single root node value. Holds the same importance tomake sure it works with both
        myBinarySearchTreeNode tree = new myBinarySearchTreeNode(6);
        tree.insert(5);
        tree.insert(7);
        tree.insert(2);
        tree.print();

        assertEquals(6, tree.myValue); //the root
        assertEquals(5, tree.left.myValue);
        assertEquals(2, tree.left.left.myValue);
        assertEquals(7, tree.right.myValue);

    }//passed

    
}
