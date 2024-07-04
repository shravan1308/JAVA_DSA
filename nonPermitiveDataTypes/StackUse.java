package nonPermitiveDataTypes;

public class StackUse {
    public static void main(String[] args) throws StackFullException {
        // StackUsingArray stack = new StackUsingArray();
        // StackUsingArray stack1 = new StackUsingArray(3);

        // for(int i = 1; i<= 5; i++){
        //     stack.push(i);
        // }
        // for(int i = 1; i<=4; i++){
        //     stack1.push(i);
        // }
        // while(!stack1.isEmpty()){
        //     try{
        //         System.out.println(stack.pop());
        //     }catch(StackEmptyException e){
        //         // Never reach here;
        //     }
        // }
        
        // while(!stack.isEmpty()){
        //     try{
        //         System.out.println(stack.pop());
        //     }catch(StackEmptyException e){
        //         // Never reach here;
        //     }
        // }


        // stack using linkedList here data structure
        StackUsingLL<Integer> stackLL = new StackUsingLL<>();
             for(int i = 1; i<= 5; i++){
            stackLL.push(i);
        }
        while(!stackLL.isEmpty()){
            try{
                System.out.println(stackLL.pop());
            }catch(StackLLEmptyException e){
                // Never reach here;
            }
        }
        
    }
    
}
