package com.itfish.Q18HasSubtreeNode;


import com.itfish.myPublic.TreeNode;

/**
 * Created by zhangyu on 2016/8/18.
 */
public class Solution {
    public boolean hasSubtree(TreeNode root1, TreeNode root2){
        boolean res=false;
        if(root1!=null&&root2!=null){
            if(root1.val==root2.val){
                res=doesTree1HasTree2(root1,root2);
            }
            if(!res)
                res=hasSubtree(root1.left,root2);
            if(!res)
                res=hasSubtree(root1.right,root2);
        }
        return res;
    }
    public boolean doesTree1HasTree2(TreeNode node1,TreeNode node2){
        if(node2==null){
            return true;
        }
        if(node1==null){
            return false;
        }
        if(node1.val!=node2.val){
            return false;
        }

        if(node1.val==node2.val){
            return doesTree1HasTree2(node1.left,node2.left)&&doesTree1HasTree2(node1.right,node2.right);
        }

        return false;
    }
}
