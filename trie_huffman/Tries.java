package trie_huffman;

class TrieNode{
    char data;
    boolean isTerminating;
    TrieNode children[];
    int childCount;

public TrieNode(char data){
    this.data = data;
    isTerminating = false;
    children = new TrieNode [26];
    childCount = 0;
    }
}

public class Tries {
    private TrieNode root;
    public Tries(){
        root = new TrieNode('\0');
    }
    private void add(TrieNode root, String word){
        if(word.length() == 0){
            root.isTerminating = true;
            return;
        }
        
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            child = new TrieNode(word.charAt(0));
            root.children[childIndex] = child;
            root.childCount++;

        }
        add(child,word.substring(1)); 

    }
    // recursivelly add
    public void add(String word){
        // trying to add small letter 
        add(root,word);
    }
    public boolean search(String word){
		// Write your code here
		return search(root,word);

	}
	private boolean search(TrieNode root, String word){
		if(word.length()==0){
			return root.isTerminating;
		}
		int exitletterIndex = word.charAt(0) - 'a';
		TrieNode child = root.children[exitletterIndex];
		if(child == null){
			// boolean result =
			 return false;
		}
			return search(child, word.substring(1));	
	}
    public void delete(String word){
        delete(root,word);
    }
    private void delete(TrieNode root, String word) {
        if(word.length()==0){
            root.isTerminating = false;
            return;
        }
        int childIndex = word.charAt(0) - 'a';
        TrieNode child = root.children[childIndex];
        if(child == null){
            return;
        }
        delete(child, word.substring(1));
        // we can delete child node node only if it is terminating and its number of children are 0
      
        if(!child.isTerminating && child.childCount ==0){
            root.children[childIndex] = null;
            child = null;
            root.childCount--;
        }
        // here we comment bcz don't write much this
        //  if(!child.isTerminating){
        //     int numchild = 0;
        //     for(int i =0; i<26; i++){
        //         if(child.children[i] != null){
        //             numchild++;
        //         }
                
        //     }
        //     if(numchild == 0){
        //         // we can delete child
        //         root.children[childIndex] = null;
        //         child = null;
        //         root.childCount--;
        //     }
         }
    }
    

