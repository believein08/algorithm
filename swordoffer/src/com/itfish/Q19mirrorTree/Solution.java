package com.itfish.Q19mirrorTree;

import com.itfish.myPublic.TreeNode;

/**
 * Created by zhangyu on 2016/8/18.
 */
public class Solution {
    public void Mirror(TreeNode root) {
        if(root!=null){
            TreeNode temp=root.left;
            root.left=root.right;
            root.right=temp;
            Mirror(root.left);
            Mirror(root.right);
        }
    }
}
