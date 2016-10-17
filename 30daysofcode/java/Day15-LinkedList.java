    public static  Node insert(Node head,int data) {
        //Complete this method
        Node node = new Node(data);
        if(head == null) {
            return node;
        }
        
        if(head.next != null) {
            insert(head.next, data);
        }
        else {
            head.next = node;
        }
   
        return head;      
    }
