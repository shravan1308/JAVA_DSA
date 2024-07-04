package dp;

// import NewForlop.pool;

public class DynamicProgr {
    public static int fibbo(int n){
        if(n==0 || n==1){
            return n;
        }
        return fibbo(n-1)+ fibbo(n-2);
// --> this function has call it self many time's do same work 
// --> we stop this call use dp and find distinct element and we have done 
// --> main movtive is to overcome redentency in recursion call 
    }
    public static int fibM(int n){
        int storage[] = new int[n+1];
        for(int i = 0; i<=n; i++){
            storage[i] = -1;
        }
        return fibbM(n,storage);
    }
    // this all 3function fib/bo/M this is memomization in notes
    public static int fibbM(int n,int storage[]){
        if(n ==0 || n==1){
            storage[n] = n;
            return storage[n];
        }
        if(storage[n] !=-1){
            return storage[n];
        }
        storage[n] = fibbM(n-1,storage)+fibbM(n-2,storage);
        return storage[n];
    }
    // LET'S DO THIS TOP DOWN TO TOP UP FASHION ABOVE FIB CODE
    public static int fibDP(int n){
        int storage[] = new int[n+1];
        storage[0] = 0;
        storage[1] = 1;
        // time complexity is O(n). 
        // and space complexity is xtr amount of space you r using at any point of time.
        // here we intializing a array than is S.C O(1)*N is =to O(N).bcz n call's r waiting in callstack
        // this only in recursion not in iterative stackcall can store max call is 10^4. if call's r grtr thn give us an error stackOverFlow.
        for(int i = 2; i<=n; i++){
            storage[i] = storage[i-1] + storage[i-2];
        }
        return storage[n];
    }
    public static void main(String[] args) {
        int n = 44;
        System.out.println(fibDP(n));
        System.out.println(fibM(n));
        System.out.println(fibbo(n));
    }
    
}
