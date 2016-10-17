    static void levelOrder(Node root){
        //Write your code here
        ArrayList<Node> array = new ArrayList<Node>();
        if(root != null) {
            array.add(root);
        }
        while(!array.isEmpty()) {
            root = array.remove(0);
            System.out.print(root.data + " ");
            if(root.left != null) {
                array.add(root.left);
            }
            if(root.right != null) {
                array.add(root.right);
            }   
        }
    }