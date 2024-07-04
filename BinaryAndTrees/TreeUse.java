// package BinaryAndTrees;

// import java.util.*;

// public class TreeUse {
//     public static Trees<Integer> takeInput(Scanner sc){
//         int n; 
//         System.out.println("Enter root node data");
//         n = sc.nextInt();
//         Trees<Integer> root = new Trees<Integer>(n);
//         System.out.println("Enter no. of children for " + n);
//         int childCount = sc.nextInt();
//         for(int i =0; i<childCount; i++){
//             Trees<Integer> child = takeInput(sc); 
//             root.children.add(child);

//         }
//         return root;
//     }
//     public static void preOrder(Trees<Integer> root){
//         if(root == null){
//             return;
//         }
//         System.out.print(root.data + " ");
//         for(int i =0; i<root.children.size(); i++){
//             preOrder(root.children.get(i));
//         }

//     }
//     public static void postOrder(Trees<Integer> root){
//         if(root == null){
//             return;
//         }
//         for(int i =0; i<root.children.size(); i++){
//             postOrder(root.children.get(i));
//             if(root.children.size() == 1){
//                 System.out.println(root.children.get(i).data + " ");
//                 // System.out.println(root.data);
//                 return;
//             }
//             System.out.println(root.data);
//         }
//     }
//     public static void print( Trees<Integer> root){
//         String s = root.data + ":" ;
//         for(int i =0; i<root.children.size(); i++){
//             s = s + root.children.get(i).data + ",";
//         }
//         System.out.println(s);
//         for(int i =0; i<root.children.size(); i++){
//             print(root.children.get(i));
//         }

//     }
//     // take input levelWise;
//     public static Trees<Integer> takeInputLevelWise(){
//         Scanner sc = new Scanner(System.in);
//         System.out.println("Enter root data");
//         int rootData = sc.nextInt();
//         QueueUsingLL<Trees<Integer>> pendingNodes = new QueueUsingLL<>();
//         Trees<Integer> root = new Trees<>(rootData);
//         pendingNodes.enqueue(root);
//         while(!pendingNodes.isEmpty()){
//             try {
//                 Trees<Integer> frontNode = pendingNodes.dequeue();
//                 System.out.println("Enter no of children " + frontNode.data);
//                 int numchild = sc.nextInt();
//                 for(int i =0; i<numchild; i++){
//                     System.out.println("Enter " + (i+1) + "th child of" + frontNode.data);
//                     int child = sc.nextInt();
//                     Trees<Integer> childNode = new Trees<>(child);
//                     frontNode.children.add(childNode);
//                     pendingNodes.enqueue(childNode);
//                 }
//             } catch (QueueEmptyException e) {
//                 return null;
//             }
//         }
//         return root;
//     }
    
//     // public static void printLevelWise(Trees<Integer> root){ // my code print levelwise leaf to root children. instead of root to leaf children
//     //     QueueUsingLL<Trees<Integer>> PendingNodes = new QueueUsingLL<>();
//     //     String s = root.data + ":";
//     //     PendingNodes.enqueue(root);
//     //     while(!PendingNodes.isEmpty()){
//     //         try {
//     //             Trees<Integer> frontNode = PendingNodes.dequeue();
//     //             int totalChild = root.children.size();
//     //             for(int i =0; i<totalChild; i++){
//     //                 s = s + frontNode.children.get(i).data + ",";
//     //                 printLevelWise(root.children.get(i));
//     //             }
//     //         } catch (QueueEmptyException e) {
//     //             return;
//     //         }
//     //     }
//     //     System.out.println(s);
//     // }
//     public static void printLevelWise(Trees<Integer> root){ 
//         if(root == null){
//             return;
//         }
//         QueueUsingLL<Trees<Integer>> q = new QueueUsingLL<>();
//         Trees<Integer> nullNode = new Trees<>(Integer.MIN_VALUE);
//         q.enqueue(root);
//         q.enqueue(nullNode);
//         System.out.println(root.data);
//         while(q.size() !=1){
//             Trees<Integer> temp = null;
//             try{
//                  temp = q.dequeue();
//             }catch (QueueEmptyException e){
//                 return;
//             }
//             if(temp == nullNode){
//                 q.enqueue(nullNode);
//                 System.out.println();
//                 continue;
//             }
//             for(int i =0; i<temp.children.size(); i++){
//                 System.out.print(temp.children.get(i).data + " ");
//                 q.enqueue(temp.children.get(i));
//             }
//         }
//     }
//     public static int noOfNodes(Trees<Integer> root){
//         int count = 1;
//         for(int i =0; i<root.children.size(); i++){
//             count += noOfNodes(root.children.get(i));
//         }
//         return count;
//     }

// ///////////////////////////////////

	
	
	
// 	public static void printLevelWises(Trees<Integer> root){
// 		/* Your class should be named Solution 
//  		 * Don't write main(). 
// 		 * Don't read input, it is passed as function argument. 
// 		 * Print output and don't return it. 
// 		 * Taking input is handled automatically. 
// 		 */
//         if(root == null){
//             return;
//         }
//         Queue<Trees<Integer>> q = new LinkedList<>();
//         Trees<Integer> nullNode = new Trees<>(Integer.MIN_VALUE);
//         q.add(root);
//         q.add(nullNode);
//         System.out.println(root.data);
//         while(q.size() !=1){
//             Trees<Integer> temp = null;
//                  temp = q.poll();
//             if(temp == nullNode){
//                 q.add(nullNode);
//                 System.out.println();
//                 continue;
//             }
//             for(int i =0; i<temp.children.size(); i++){
//                 System.out.print(temp.children.get(i).data + " ");
//                 q.add(temp.children.get(i));
//             }
//         }
// 	}
//     public static int largestNode(Trees<Integer> root){
//         if(root == null){
//             return -1;
//         }
//         for(int i = 0; i<root.children.size(); i++){
//             if(root.children.get(i).data < root.children.get(i+1).data){
//                 if(root.children.get(i+1).data < root.data){
//                     return root.data;
//                 }else{
//                     return root.children.get(i).data;
//                 }
//             }else{
//                 if(root.children.get(i).data >= root.children.get(i+1).data){
//                     if(root.children.get(i).data >= root.data){
//                         return root.children.get(i).data;
//                     }else{
//                         return root.data;
//                     }
//                 }
//             }
//         }              
//         return root.data;
        
//     }
//     // public static int sumOfNode(Trees<Integer> root){
//     //     if(root == null){
//     //         return -1;
//     //     }
//     //     if(root.children.size() == 1){
//     //         return root.children.get(1).data;
//     //     } 
//     // }
//     public static int levelOfTree(Trees<Integer> root){ // check code ans not good show
//         int level = 1;
//         if(root == null){
//             level = Integer.MIN_VALUE;
//         }
//         if(root.children.size() == 0){
//             return level;
//         }
//         for(int i =0; i<root.children.size(); i++){
//              levelOfTree(root.children.get(i));
//             level++;
//         }
//         return level;
//     }
//     public static int getHeight(Trees<Integer> root){
//         if(root == null){
//             return 0;
//         }
//         int ans = 0;
//         for(Trees<Integer> child : root.children){
//             int childHeight = getHeight(child);
//             if(childHeight > ans){
//                 ans = childHeight;
//             }
//         }
//         return ans;
//     }
//     // depth from the node
//     public static void depthAtK(Trees<Integer> root, int k){
//         if(root == null){
//             return;
//         }
//         if(k ==0){
//             System.out.println(root.data);
//             return;
//         }
//         for(int i =0; i<k; i++){
//             depthAtK(root.children.get(i), k-1);
//         }
        
//     }
//     public static void main(String[] args) {

//     // Trees<Integer> root = new Trees<>(4);
//     // Scanner sc = new Scanner(System.in);
//     // Trees<Integer> root = takeInput(sc);
//     Trees<Integer> root = takeInputLevelWise();
//     printLevelWises(root);
//     System.out.println("total root in tree");
//     System.out.println(noOfNodes(root));
//     System.out.println();
//     // System.out.println(largestNode(root));
//     System.out.println(levelOfTree(root));
//     System.out.println("preOder");
//     // preOrder(root);
//     postOrder(root);
    
//     // Trees<Integer> node1 = new Trees<>(2);
//     // Trees<Integer> node2= new Trees<>(3);
//     // Trees<Integer> node3 = new Trees<>(5);
//     // Trees<Integer> node4 = new Trees<>(6);
//     // root.children.add(node1);
//     // root.children.add(node2);
//     // root.children.add(node3);
//     // node2.children.add(node4);
    

//     }
// }


// // 