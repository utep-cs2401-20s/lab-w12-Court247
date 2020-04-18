class myBinarySearchTreeNode{
  int myValue;
  myBinarySearchTreeNode left;
  myBinarySearchTreeNode right;
    
  myBinarySearchTreeNode(int inValue){
    // created a new node with empty child pointers
    this.myValue = inValue;
    this.left = null;
    this.right = null;
  }
  
  myBinarySearchTreeNode(int[] A){
    // creates a new Binary Search Tree rooted at the first value in the array
    /// by inserting elements into the tree in the order they are given in A.

    myBinarySearchTreeNode numValue = new myBinarySearchTreeNode(A[0]);
    myValue= A[0];

    for(int i = 0; i < A.length; i++){
      numValue.insert(A[i]);
      insert(A[i]);
    }

  } //completed
  
  public void insert(int inValue){
    // This method takes a new integer as input and decides 
    // if it should be place: 
    //    * as the left child,
    //    * as the right child, 
    //    * in the left subtree,
    //    * or in the right subtree.
    // If the value already exists in the tree, no action is taken.

      //insert for right value
    if(inValue > myValue){
      if(right == null){
        right = new myBinarySearchTreeNode(inValue);
      }else{
        right.insert(inValue);
      }
      //insert for left value
    }else if (inValue < myValue){
      if(left == null){
        left = new myBinarySearchTreeNode (inValue);
      }else{
        left.insert(inValue);
      }
      //no duplicates
    }//else {
     // System.out.println("Error. No duplicates!");
    //}
  }//completed
  
  public int height(){
     // This method recursively calculates the height of the entire (sub)tree.
     // This method will take O(n) time
        int leftSide = 0;
        int rightSide = 0;

        if(left != null){
            leftSide = left.height() +1;
            return leftSide;
        }
        if(right != null){
            rightSide = right.height() +1;
            return rightSide;
        }

        return Math.max(leftSide, rightSide);
  } //complete

  public int size(){
      int sum = 1;
      if(left != null){
          sum += left.size();
      }

      if(right != null){
          sum += right.size();
      }
      return sum;
  } //complete

  public int depth(int search){
     // This method recursively calculates the depth of a given search value. 
     // If the given value is not in the tree, this method returns -1. 
     // Note that if the tree is a proper BST, this method should complete in O(log n) time.
     // Additionally, remember that the depth is the number of nodes on the path from a node to the root 
     // (i.e. the number of the recursive calls).

      //compare current number to value
      if(search < myValue){
          //if there is a value there go left
          if(left != null){
             //else sum up the number of edges on the left
              return 1 + left.depth(search);
          }
      }else if(search > myValue){
          //if there is a value there go right
          if(right != null){
              //else sum up the number of edges on the right
              return 1 + right.depth(search);
          }
      }else {
          //found myValue
          return 0;
      }
      //didn't find my value
    return -1;
  }//complete


  // Utility function included so you can debug your solution.
  public void print() { print(""); }
  private void print(String prefix) {
    System.out.println(prefix + myValue);
    prefix = prefix.replace('\u251C', '\u2502');
    prefix = prefix.replace('\u2514', ' ');
    if(left != null) left.print(prefix + "\u251C ");
    if(right != null) right.print(prefix + "\u2514 ");
  }
  
} 
