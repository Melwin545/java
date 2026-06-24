class TreeNode{
    int val;
    TreeNode left,right;
    
    TreeNode (int val){
    this.val=val;
    
}
}
public class Main
{
	public static TreeNode LowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q){
        if(root==null){
        return null;
        } 
        if(root == p|| root ==  q){
            return root;
        }  
            TreeNode left = LowestCommonAncestor(root.left , p,q);
            TreeNode right = LowestCommonAncestor(root.right, p,q);
            
            if(left != null && right != null){
                return root;
            }
            
            return(left!=null)? left : right;
        }

        public static void main(String []args){
            TreeNode root = new TreeNode(10);
            root.left = new TreeNode(2);
            root.right = new TreeNode(12);
            root.left.right = new TreeNode(4);
            root.left.left = new TreeNode(3);
            root.right.left = new TreeNode(16);
            root.right.right = new TreeNode(17);
            
            TreeNode p = root.right,left;
            TreeNode q = root.right.right;
            
            TreeNode lca =  LowestCommonAncestor(root,p,q);
            
            System.out.println("Lowest Common Ancestor = " +lca.val);
        
	}
}
