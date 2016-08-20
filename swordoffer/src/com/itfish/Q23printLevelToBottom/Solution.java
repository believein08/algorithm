package com.itfish.Q23printLevelToBottom;

import com.itfish.myPublic.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 * Created by zhangyu on 2016/8/19.
 * 从上往下打印出二叉树的每个节点，同层节点从左至右打印。
 * 层次遍历
 */
public class Solution {
    public static void main(String[] args) {
        TreeNode node1=new TreeNode(1);
        TreeNode node2=new TreeNode(2);
        TreeNode node3=new TreeNode(3);
        node1.left=node3;
        node1.right=node2;

        PrintFromTopToBottom(null);
    }
    public static ArrayList<Integer> PrintFromTopToBottom(TreeNode root){
        LinkedList<TreeNode> queue=new LinkedList<>();
        ArrayList<Integer> list=new ArrayList();
        if(root!=null)
            queue.offer(root);
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            list.add(temp.val);
            System.out.println(temp.val);
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
        }
        return list;
    }
}
