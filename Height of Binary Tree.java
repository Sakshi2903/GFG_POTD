class Solution {
    //Function to find the height of a binary tree.
    int height(Node node) 
    {
        // code here 
        if (node == null)
            return 0;
        else {
            int leftheight = height(node.left);
            int rightheight = height(node.right);

            if (leftheight > rightheight)
                return (leftheight + 1);
            else
                return (rightheight + 1);
        }
    }
}
