    public static Node removeDuplicates(Node head) {
        //Write your code here
        Node initial = head;
        while(head != null && head.next != null) {
            Node next = head.next;
            if((head.data) == (next.data)) {
                if(next.next == null) {
                    head.next = null;
                }
                else {
                    head.next = next.next;
                }
            }
            else {
                head = head.next;
            }
        }
        return initial;
    }