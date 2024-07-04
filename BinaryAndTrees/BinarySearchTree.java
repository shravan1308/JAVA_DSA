package BinaryAndTrees;

public class BinarySearchTree {

  private BinaryTreeNode<Integer> root;

  public void insertData(int data){
   root = insertNodeHelper(root, data); 
  }
  private BinaryTreeNode<Integer> insertNodeHelper(BinaryTreeNode<Integer> root, int data){
    if(root == null){
      BinaryTreeNode<Integer> newNode = new BinaryTreeNode<Integer>(data);
      return newNode;
    }
    if(root.data > data){
      root.left = insertNodeHelper(root.left, data);
      }else{
        root.right = insertNodeHelper(root.right, data);
      }
      return root;
  }

  private boolean hasDataHelper(BinaryTreeNode<Integer> root, int data){ 
    if(root == null){
      return false;
    }
    if(root.data == data){
      return true;
    }else if(data >root.data){
      return hasDataHelper(root.right, data);
    }else{
      return hasDataHelper(root.left, data);
    }
}
  public boolean hasData(int data){
    return hasDataHelper(root, data);
  }

  
  private void printTree(BinaryTreeNode<Integer> root){
    if(root == null){
      return ;
    }
    String toBePrinted = root.data + "";
    if(root.left != null){
      toBePrinted += "L:" + root.left.data + ",";
    }
    if(root.right != null){
      toBePrinted += "R:" + root.right.data;
    }
    System.out.println(toBePrinted);
    printTree(root.left);
    printTree(root.right);
    
  }
  
  // private int minimumOfLeft(BinaryTreeNode<Integer> root){
  //   if(root == null){
  //     return Integer.MAX_VALUE;
  // }
  // return Math.min(root.data,minimumOfLeft(root.left));
  // }

  public void printTreeRoot(){
    printTree(root);
  }

  private BinaryTreeNode<Integer>  deleteNodeHelper2(BinaryTreeNode<Integer> root, int data){
    if(root == null){
      return null;
    }
    if(data < root.data){
      root.left = deleteNodeHelper2(root.left, data);
      return root;
    }else if(data > root.data){
      root.right = deleteNodeHelper2(root.right, data);
      return root;
    }else{
      if(root.left == null && root.right == null){
        return null;
    }else if(root.left == null){
      return root.right;
    }else if(root.right == null){
      return root.left;
    }else{ 
      BinaryTreeNode<Integer> minNode = root.right; // here we take is bcz root.data same as data we want to delete
      while(root.left != null){
        minNode = minNode.left;
      }
      root.data = minNode.data;
      root.right = deleteNodeHelper2(root.right, minNode.data);
      return root;
    }
  }
}

  // private BinaryTreeNode<Integer>  deleteNodeHelper(BinaryTreeNode<Integer> root, int data){
  //   if(root == null){
  //     return null;
  //   }
  //   if(data < root.data){
  //     root.left = deleteNodeHelper(root.left, data);
  //     return root;
  //   }else if(data > root.data){
  //     root.right = deleteNodeHelper(root.right, data);
  //     return root;
  //   }else{
  //     if(root.left == null && root.right == null){
  //       return null;
  //   }else if(root.left == null){
  //     return root.right;
  //   }else if(root.right == null){
  //     return root.left;
  //   }else{ 
  //     if(root.left != null && root.right != null){
  //       int leftMin = minimumOfLeft(root.left);
  //       while(root.left != null){
  //         root = root.left;
  //         if(root.data == leftMin){
  //           root.left = null;
  //           root.data = leftMin;
  //           break;
  //         } 
  //       }
  //     }
  //   }
  // }
  // return root;
  // }

  public  void deleteNode(int data){
     deleteNodeHelper2(root, data);
  }
  private void insertDuplicateNode(BinaryTreeNode<Integer> root) {
		//Your code goes here
        if(root == null){
            return;
        }
        BinaryTreeNode<Integer> temp = root;
        BinaryTreeNode<Integer> duplicate = new BinaryTreeNode<Integer>(root.data);
        duplicate.left = root.left;
        temp.left = duplicate;
        insertDuplicateNode(duplicate.left);
        insertDuplicateNode(duplicate.right);        
}
public void insertDuplicate(){
  insertDuplicateNode(root);
}
	

      
}
