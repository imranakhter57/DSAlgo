/*
import java.util.HashMap;
import java.util.Map;

public class Trie {
    Node root;
    Node curr;

    class Node {
        HashMap<Character, Node> children;
        String content;
        boolean isWord;

        public Node(String content) {
            this.content = content;
        }
    }

    public void insert(String word) {
        Node current = root;

        for (char l: word.toCharArray()) {
            current = current.children().computeIfAbsent(l, c -> new TrieNode());
        }
        current.setEndOfWord(true);
    }

    */
/*public void add(String data, Character oldChar, Map<Character, Node> oldNode) {
        if (data.isEmpty()) {
            if (this.curr.get(oldChar).next == null) {
                Node newNode = new Node(null);
                newNode.isWord = true;
                Map<Character, Node> newNodeMap = new HashMap<Character, Node>() {{
                    put(null, newNode);
                }};
                this.curr.get(oldChar).next = newNodeMap;
            } else {
                this.curr.get(curr).isWord = true;
            }
            this.curr = this.root;
            return;
        }
        char currChar = data.charAt(0);
        Node newNode = new Node(currChar);
        
        Map<Character, Node> currData = this.curr.next.data;
        if (currData == null) {
            currData = new HashMap<Character, Node>(){{
                put(currChar,newNode);
            }} ;          
        } else {
            if(!currData.containsKey(currChar)){
                currData.put(currChar, newNode);
                
            }
            add(data);
        }
        
        add(data.substring(1), currChar, oldNode);
    }*//*


    public static void main(String[] args) {
        Trie trie = new Trie();
        trie.add("Imran");
        trie.add("Immi");
    }
}
*/
