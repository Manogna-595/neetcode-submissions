class LRUCache {
    class Node{
        int key;
        int val;
        Node next;
        Node prev;

        Node(int key, int val){
            this.key = key;
            this.val = val;
        }
    }


    HashMap<Integer, Node> hm = new HashMap<>();
    int capacity;

    Node head = new Node(0,0);
    Node tail = new Node(0,0);
    

    public void removeNode(Node n){
        n.prev.next = n.next;
        n.next.prev = n.prev;

    }

    public void addToFront(Node n){
        head.next.prev = n;
        n.next = head.next;
        head.next = n;
        n.prev = head; 
    }

    public LRUCache(int capacity) {
        this.capacity = capacity;
        head.next = tail;
        tail.prev = head;
    }
    
    public int get(int key) {
        if(!hm.containsKey(key)){
            return -1;
        }
        Node n = hm.get(key);
        removeNode(n);
        addToFront(n);
        return n.val;
    }
    
    public void put(int key, int value) {

        if(hm.containsKey(key)){
            Node n = hm.get(key);
            n.val = value;
            removeNode(n);
            addToFront(n);

        } else{
            
            Node node = new Node(key,value); 
            hm.put(key, node);
            addToFront(node);
        }

        if(hm.size() > capacity){
                Node lru = tail.prev;
                hm.remove(lru.key);
                removeNode(lru);

         }
        
    }
}

/**
 * Your LRUCache object will be instantiated and called as such:
 * LRUCache obj = new LRUCache(capacity);
 * int param_1 = obj.get(key);
 * obj.put(key,value);
 */