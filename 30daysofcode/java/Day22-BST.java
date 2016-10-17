    public static int getHeight(Node root){
        //Write your code here
        if(root == null) {
            return -1;
        }
        int leftHeight = getHeight(root.left);
        int rightHeight = getHeight(root.right);

        if(leftHeight > rightHeight) {
            return leftHeight + 1;
        }
        else {
            return rightHeight + 1;
        }
    }
