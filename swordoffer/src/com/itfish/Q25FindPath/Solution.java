package com.itfish.Q25FindPath;

import com.itfish.myPublic.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by zhangyu on 2016/8/19.
 */
public class Solution {
    public static void main(String[] args) {
        TreeNode root1=new TreeNode(8);
        TreeNode node1=new TreeNode(8);
        TreeNode node2=new TreeNode(7);
        TreeNode node3=new TreeNode(9);
        TreeNode node4=new TreeNode(2);
        TreeNode node5=new TreeNode(4);
        TreeNode node6=new TreeNode(7);

        root1.left=node1;
        root1.right=node2;
        node1.left=node3;
        node1.right=node4;
        node4.left=node5;
        node4.right=node6;
        new Solution().findPath(root1,25);

    }
    public void findPath(TreeNode root, int target) {
        LinkedList<Integer> stack=new LinkedList<>();
        findPath(root,target,stack);

    }
    public void findPath(TreeNode node,int target,LinkedList<Integer> stack){
        if(node==null){
            return ;
        }
        if(node.right==null&&node.left==null){
            if(node.val==target){
                for(int i:stack){
                    System.out.print(i+" ");
                }
                System.out.print(node.val);
                System.out.println();
            }
        }else{
            stack.push(node.val);
            findPath(node.left,target-node.val,stack);
            findPath(node.right,target-node.val,stack);
            stack.pop();
        }
    }
}

