package com.itfish.Q6;

/**
 * Created by zhangyu on 2016/6/24.
 */
import java.util.Arrays;
public class Solution {
    public static TreeNode reConstructBinaryTree(int [] preorder,int[] inorder) throws Exception{
        boolean ishave=false;

        for(int i=0;i<inorder.length;i++){
            if(preorder[0]==inorder[i]){
                TreeNode root=new TreeNode(inorder[i]);
                ishave=true;

                root.left=reConstructBinaryTree(Arrays.copyOfRange(preorder, 1,i+1), Arrays.copyOfRange(inorder,0, i));
                root.right=reConstructBinaryTree(Arrays.copyOfRange(preorder, i+1,preorder.length), Arrays.copyOfRange(inorder,i+1, inorder.length));
                return root;
            }
        }

        return null;

    }
}