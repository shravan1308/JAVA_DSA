// package BinaryAndTrees;

// import java.util.ArrayList;
// import java.util.Scanner;

// // import nonPermitiveDataTypes.Node;

// public class BinaryTreeNodeUse { 
//     public static void printTree(BinaryTreeNode<Integer> root){
//         if(root == null){
//             return ;
//         }
//         String toBePrinted = root.data + "";
//         if(root.left != null){
//             toBePrinted += "L:" + root.left.data + ",";
//         }
//         if(root.right != null){
//             toBePrinted += "R:" + root.right.data;
//         }
//         System.out.println(toBePrinted);
//         printTree(root.left);
//         printTree(root.right);
        
//     }
//     public static BinaryTreeNode<Integer> takeInput(Scanner sc){
//         int rootData;
//         System.out.println("Enter root data");
//          rootData = sc.nextInt();
//         if(rootData == -1){
//             return null;
//         }
//         BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
//         root.left = takeInput(sc);
//         root.right = takeInput(sc);
//         return root;

//     }
//     public static BinaryTreeNode<Integer> takeInputLevelWise(){
//         Scanner sc = new Scanner(System.in);
//         QueueUsingLL<BinaryTreeNode<Integer>> pendingBTN = new QueueUsingLL<>();
//         System.out.println("Enter root data");
//         int rootData;
//         rootData = sc.nextInt();
//         if(rootData == -1){
//             return null;
//         }
//         BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
//         pendingBTN.enqueue(root);
//         while(!pendingBTN.isEmpty()){
//             BinaryTreeNode<Integer> front;
//             try{
//                  front = pendingBTN.dequeue();
//             }catch (QueueEmptyException e){
//                 return null;
//             }
//             System.out.println("Enter left child of " + front.data);
//             int leftchild = sc.nextInt();
//             if(leftchild !=-1){
//                 BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(leftchild);
//                 pendingBTN.enqueue(child);
//                 front.left = child;
//             }
//             System.out.println("Enter right child of " + front.data);
//             int rightchild = sc.nextInt();
//             if(rightchild !=-1){
//                 BinaryTreeNode<Integer> child = new BinaryTreeNode<Integer>(rightchild);
//                 pendingBTN.enqueue(child);
//                 front.right = child;
//             }
            
//         }
        
//         return root;
//         // Recusivily
//     }
//     public static int noOfNode(BinaryTreeNode<Integer> root){
//         if(root == null){
//             return 0;
//         }
//         int ans = 1;
//         ans += noOfNode(root.left);
//         ans += noOfNode(root.right);
//         return ans;

//     }
// //    public static void printLevelWise(BinaryTreeNode<Integer> root){
// //     if(root == null){
// //         return ;
// //     }
    
// //     QueueUsingLL<BinaryTreeNode<Integer>> firstPrint = new QueueUsingLL<>();
// //     firstPrint.enqueue(root);
// //     while(!firstPrint.isEmpty()){
// //     BinaryTreeNode<Integer> front;
// //     try {
// //         front = firstPrint.dequeue();
// //     System.out.println(front.data + ":");
// //     if(front.left != null){
// //         firstPrint.enqueue(front);
// //         System.out.println("L" + front.left.data);
// //     }else{
// //         System.out.println("L:-1");
// //     }
// //     if(front.right != null){
// //         firstPrint.enqueue(front);
// //         System.out.println(",R" + front.right.data);
// //     }else{
// //         System.out.println(",R:-1");
// //     }
// //     System.out.println();
// //     }  catch (QueueEmptyException e) {
// //         return;
// //     }
// // }
// //     }
// public static int largestNode(BinaryTreeNode<Integer> root){
//     if(root == null){
//         return -1;
//     }
//     int largestLeft = largestNode(root.left);
//     int largestRight = largestNode(root.right);
//     return Math.max(root.data, Math.max(largestLeft, largestRight));
// }
// public static int heightOfBst(BinaryTreeNode<Integer> root){
//     if (root==null)
//     {
//         return 0;
//     }
    
//     int smallLeftOutput=heightOfBst(root.left);
//     int smallRightOutput=heightOfBst(root.right);
//     if (smallLeftOutput>smallRightOutput)
//     {
//         return smallLeftOutput+1;
//     }
//     else
//     {
//         return smallRightOutput+1;
//     }
// }
// public static int noOfNodesOfBst(BinaryTreeNode<Integer>root){
//     if(root == null){
//         return 0;
//     }
//     int small = 1;
//     small+= noOfNodesOfBst(root.left);
//     small += noOfNodesOfBst(root.right);
//     return small;
// }
// public static void depthAtK(BinaryTreeNode<Integer> root, int k){
//     if(root == null){
//         return;
//     }
//     if(k == 0){
//         System.out.println(root.data);
//     }
//     depthAtK(root.left, k-1);
//     depthAtK(root.right, k-1);
// }
// public static BinaryTreeNode<Integer> removeLeaf(BinaryTreeNode<Integer> root){
//     if(root == null){
//         return null;
//     }
//     if(root.left == null && root.right == null){
//         return null;
//     }
//     root.left = removeLeaf(root.left);
//     root.right = removeLeaf(root.right);
//     return root;
// } 
// public static int height(BinaryTreeNode<Integer> root){
//     if(root == null){
//         return 0;
//     }
//     int leftHeight = height(root.left);
//     int rightHeight = height(root.right);
//     return 1 + Math.max(leftHeight, rightHeight);

// }
// public static boolean isBalanced(BinaryTreeNode<Integer> root){
//     if(root == null){
//         return true;
//     }
//     int leftHeight = height(root.left);
//     int rightHeight = height(root.right);
//     if(Math.abs(leftHeight - rightHeight) >1){
//         return false;
//     }
//     boolean isLeftBalanced = isBalanced(root.left);
//     boolean isRightBalanced = isBalanced(root.right);
//     return isLeftBalanced && isRightBalanced;
// }
// public static BinaryTreeReturn isBalancedBetter(BinaryTreeNode<Integer> root){
//     if(root == null){
//         int height = 0;
//         boolean isBal = true;
//         BinaryTreeReturn ans = new BinaryTreeReturn();
//         ans.height = height;
//         ans.isBalanced = isBal;
//         return ans;

//     }
//     BinaryTreeReturn leftOutput = isBalancedBetter(root.left);
//     BinaryTreeReturn rightOutput = isBalancedBetter(root.right);
//     boolean isBal = true;
//     int height = 1 + Math.max(leftOutput.height, rightOutput.height);
//     if(Math.abs(leftOutput.height - rightOutput.height) > 1){
//         isBal = false;
//     }
//     if(!leftOutput.isBalanced || !rightOutput.isBalanced){
//         isBal = false;
//     }
//     BinaryTreeReturn ans = new BinaryTreeReturn();
//     ans.height = height;
//     ans.isBalanced = isBal;
//     return ans;
// }
// public static int heightOfDiameter(BinaryTreeNode<Integer> root){
//     if(root == null){
//         return 0;
//     }
//     int leftHeight = heightOfDiameter(root.left);
//     int rightHeight = heightOfDiameter(root.right);
//     return 1 + Math.max(leftHeight, rightHeight);
// }
// public static int diameter(BinaryTreeNode<Integer> root){
//     if(root == null){
//         return 0;
//     }
//     int option1 = heightOfDiameter(root.left) + heightOfDiameter(root.right);
//     int option2 = diameter(root.left);
//     int option3 = diameter(root.right);
//     return Math.max(option1, Math.max(option2, option3));

// }
// public static Pair<Integer,Integer> heightDiameterBetter(BinaryTreeNode<Integer> root){
//     if(root == null){
//         Pair<Integer,Integer> ans = new Pair<>();
//         ans.first = 0;
//         ans.second = 0;
//         return ans;
//     }
//     Pair<Integer,Integer> lo = heightDiameterBetter(root.left);
//     Pair<Integer, Integer> ro = heightDiameterBetter(root.right);
//     int height = 1 + Math.max(lo.first, ro.first);
//     int option1 = lo.first + ro.first;
//     int option2 = lo.second;
//     int option3 = lo.second;
//     int diameter = Math.max(option1, Math.max(option2, option3));
//     Pair<Integer,Integer> output = new Pair<>();
//     output.first = height;
//     output.second = diameter;
//     return output;
// }
// public static void inOrder(BinaryTreeNode<Integer> root){
//     if(root == null){
//         return;
//     }
//     inOrder(root.left);
//     System.out.println(root.data);
//     inOrder(root.right);
// }
// public static BinaryTreeNode<Integer> buildTreeHelper(int in[],int pre[],int inS,int inE,int preS, int preE){
//     if(inS>inE){
//         return null;
//     }
//     int rootData = pre[preS];
//     BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(rootData);
//     int rootIndex = -1;
//     for(int i=inS; i<=inE; i++){
//         if(in[i] == rootData){
//             rootIndex = i;
//             break;
//         }
//     }
//     int leftInS = inS;
//     int leftInE = rootIndex-1;
//     int leftPreS = preS + 1;
//     int leftPreE = leftInE - leftInS + leftPreS;
//     int rightInS = rootIndex + 1;
//     int rightInE = inE;
//     int rightPreS = leftPreE + 1;
//     int rightPreE = preE;
//     root.left = buildTreeHelper(in, pre, leftInS, leftInE, leftPreS, leftPreE);
//     root.right = buildTreeHelper(in, pre, rightInS, rightInE, rightPreS, rightPreE);
//     return root;
// }
// public static BinaryTreeNode<Integer> buildTree(int in[],int pre[]){
//     return buildTreeHelper(in,pre,0,in.length-1,0,pre.length-1);
// }
// public static int maximum(BinaryTreeNode<Integer> root){
//     if(root == null){
//         return Integer.MIN_VALUE;
//     }
//     return Math.max(root.data, Math.max(maximum(root.left), maximum(root.right)));
// }
// public static int minimum(BinaryTreeNode<Integer> root){
//     if(root == null){
//         return Integer.MAX_VALUE;
//     }
//     return Math.min(root.data, Math.min(minimum(root.left), minimum(root.right)));
// }
// public static boolean isBST(BinaryTreeNode<Integer> root){
//     if(root == null){
//         return true;
//     }
    
//     int leftMax = maximum(root.left);
//     int rightMin = minimum(root.right);
 
//     if(root.data <= leftMax){
//         return false;
//     }
//     if(root.data > rightMin){
//         return false;
//     }
//     boolean isLeftBST = isBST(root.left);
//     boolean isRightBST = isBST(root.right);
//     if(isRightBST && isLeftBST){
//         return true;
//     }else{
//         return false;
//     }
// }
// public static boolean isBSTBetter2(BinaryTreeNode<Integer> root, int min, int max){
//     if(root == null){
//         return true;
//     }
//     if(root.data<min || root.data> max){
//         return false;
//     }
//     boolean isLeftOk = isBSTBetter2(root.left, min, root.data-1);
//     boolean isRightOk = isBSTBetter2(root.right, root.data, max);
//     return isLeftOk && isRightOk;
// }
// public static Pair< Boolean,Pair<Integer,Integer>> isBSTBetter(BinaryTreeNode<Integer> root){
//     if(root == null){
//         Pair<Boolean,Pair<Integer,Integer>> output = new Pair<Boolean ,Pair<Integer,Integer>>();
//         output.first = true;
//         output.second = new Pair<Integer,Integer>();
//         output.second.first =  Integer.MAX_VALUE;
//         output.second.second = Integer.MIN_VALUE;
//         return output;
//     }
//     Pair<Boolean,Pair<Integer,Integer>> leftOutput = isBSTBetter(root.left);
//     Pair<Boolean,Pair<Integer,Integer>> rightOutput = isBSTBetter(root.right);
//     int min = Math.min(root.data,Math.min(leftOutput.second.first , rightOutput.second.first));
//     int max = Math.max(root.data,Math.max(leftOutput.second.first , rightOutput.second.first));
//     boolean isBST = (root.data> leftOutput.second.second) && 
//     (root.data<= rightOutput.second.first) && (leftOutput.first) && (rightOutput.first);
//     Pair<Boolean,Pair<Integer,Integer>> ans = new Pair<>();
//     ans.first = isBST;
//     ans.second = new Pair<Integer,Integer>();
//     ans.second.first = min;
//     ans.second.second = max;
//     return ans;
// }
// public static BinaryTreeNode<Integer> treeBySortedArray(int arr[], int n){
//     return treeBySortedArrayHelper(arr, 0, n-1);
// }
// public static BinaryTreeNode<Integer> treeBySortedArrayHelper(int arr[], int si, int ei){
//     if(si>ei){
//         return null;
//     }
//     int midOfLength = (si+ei)/2;
//     int midRoot = arr[midOfLength];
//     BinaryTreeNode<Integer> root = new BinaryTreeNode<Integer>(midRoot);
    
//    root.left = treeBySortedArrayHelper(arr,si,midOfLength-1);
//    root.right =treeBySortedArrayHelper(arr,midOfLength+1,ei);
//    return root;
// }
// // below code havenot done

// // public static Node<Integer> BSTtOSortedLL(BinaryTreeNode<Integer> root){
// //     if(root == null){
// //         return null;
// //     }
// //     // int rightMinData = minimum(root.right);
// //     // int leftMaxData = maximum1(root.left);
// //     // Node<Integer> newNode = new Node<Integer>(root.data);
// //     // BSTtOSortedLL(root.left);
// //     // newNode.next = newNode;
// //     // while(newNode != null){
// //     //     newNode.next = newNode;
// //     // }
// //     // BSTtOSortedLL(root.right);
// //     // return newNode;
// //     Node<Integer> newNode = new Node<Integer>(root.data);
// //     BSTtOSortedLL(root.left);
// //     while(newNode != null){
// //         newNode.next = newNode;
// //     }
// //     BSTtOSortedLL(root.right);
    
// // }
// public static void inRangeOfBST(BinaryTreeNode<Integer> root, int min, int max){
//     if(root == null){
//         return;
//     }
//     if(root.data >= min && root.data <= max){
//         inRangeOfBST(root.left, min, max);
//         System.out.println(root.data);
//         inRangeOfBST(root.right, min, max);
    
//     }else if(root.data < min){
//         inRangeOfBST(root.right, min, max);
//     }
//     else if(root.data > max){
//         inRangeOfBST(root.left, min, max);
//     }
// }
// public static ArrayList<Integer> treeRootAllNodeAtDepth(BinaryTreeNode<Integer> root, int data){
//     if(root == null){
//         return null;
//     }
//     if(root.data == data){
//         ArrayList<Integer> output = new ArrayList<>();
//             output.add(root.data);
//         return output;
//     }
//     ArrayList<Integer> leftOutput = treeRootAllNodeAtDepth(root.left, data);
//     if(leftOutput != null){
//         leftOutput.add(root.data);
//         return leftOutput;
//     }
    
//     ArrayList<Integer> rightOutput = treeRootAllNodeAtDepth(root.right, data);
//     if(rightOutput != null){
//         rightOutput.add(root.data);
//         return rightOutput;
//     }else{
//         return null;
//     }
    
// }
// public static ArrayList<Integer> getPath(BinaryTreeNode<Integer> root, int data){
//     if (root==null)
//             return null;

//         ArrayList<Integer> output;
//         if (root.data==data)
//         {
//             output= new ArrayList<Integer>();
//             output.add(root.data);
//             return output;
//         }
        
//         if (data<root.data)
//         {
//             output = getPath(root.left,data);
//             if (output != null)
//             {
//                 output.add(root.data);
//             }
//             return output;
//         }
        
//         if (data>root.data)
//         {
//             output = getPath(root.right,data);
//             if (output != null)
//             {
//                 output.add(root.data);
//             }
//             return output;
//         }
    
//         return null;
// }
//     public static void main(String[] args) {
//         // Scanner sc = new Scanner(System.in);

//         // BinaryTreeNode<Integer> root1 = new BinaryTreeNode<Integer>(4);
//         // BinaryTreeNode<Integer> node1 = new BinaryTreeNode<Integer>(2);
//         // root1.left = node1;
//         // BinaryTreeNode<Integer> node2 = new BinaryTreeNode<Integer>(3);
//         // root1.right = node2;
//         // BinaryTreeNode<Integer> root = takeInput(sc);
//         // printTree(root);
        
//         // BinaryTreeNode<Integer> root = takeInputLevelWise();
//         // printTree(root);
//         // printTree(root);
//         // System.out.println(  " largestNode is " + largestNode(root)  + "//" + " this is the total nodes in bst " + noOfNodesOfBst(root));
//         // System.out.println( "height of bst is" + heightOfBst(root));
//         // System.out.print("root's at depth k is/are ");
//         // System.out.println("nodes at depth k are/is");
//         // depthAtK(root, 4);
//         // BinaryTreeNode<Integer> newRoot = removeLeaf(root);
//         // printTree(newRoot);
//         // System.out.println("checking balanced tree is / not");
        
//         // this this this this;

//         // int in[] = {1,2,3,4,6,7};
//         // int pre[] = {4,2,1,3,6,7};
//         // BinaryTreeNode<Integer> root = buildTree(in, pre);
//         // printTree(root);
//         // boolean balanced = isBalanced(root);
//         // System.out.println(balanced);
//         // System.out.println("is balanced " + isBalancedBetter(root).isBalanced);
//         // System.out.println("is diameter " + heightDiameterBetter(root).second);
//         // System.out.println("is height " + heightDiameterBetter(root).first);
//         // System.out.println(isBST(root));
//         // System.out.println("below root");
//         // inRangeOfBST(root, 2, 6);
//         // System.out.println(treeRootAllNodeAtDepth(root, 6));
//         // System.out.println(getPath(root, 7));

//         BinarySearchTree bst = new BinarySearchTree();
//         bst.insertData(5);
//         bst.insertData(6);
//         bst.insertData(10);
//         bst.insertData(2);
//         bst.insertData(3);
//         bst.insertData(9);
//         bst.printTreeRoot();
//         System.out.println("now deleting root data");
//         bst.insertDuplicate();
//         bst.printTreeRoot();
//         System.out.println("this print root is after delete node");
//         // bst.printTreeRoot();
        
               

    
//     }
        
// }
