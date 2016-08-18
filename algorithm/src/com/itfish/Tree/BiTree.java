package com.itfish.Tree;

import org.w3c.dom.NodeList;


import java.util.LinkedList;


/**
 * Created by zhangyu on 2016/8/18.
 */
public class BiTree {
    public static void main(String[] args) {
        String[]arr=new String[]{"1","4","#","#","3","2","#","#","#"};
        String[]arr1=new String[]{"1","5","6","#","#","#","2","#","3","#","4","#","#"};
        LinkedList<String> list=new LinkedList<>();

        for(String s: arr1){
            list.add(s);
        }

        TreeNode root=BiTree.createTree(list);
        levelOrder(root);
        preOrder(root);
        System.out.println(leafNum(root));

        System.out.println("treeheight:"+treeHeight(root));
    }
    TreeNode root=null;
    //先序遍历
    public static void preOrder(TreeNode node){
        if(node!=null){
            System.out.println(node.val);
            preOrder(node.left);
            preOrder(node.right);
        }
    }
    //层序遍历
    public static void levelOrder(TreeNode node){
        LinkedList<TreeNode> queue=new LinkedList<>();
        queue.offer(node);
        while(!queue.isEmpty()){
            TreeNode temp=queue.poll();
            System.out.println(temp.val);
            if(temp.left!=null){
                queue.offer(temp.left);
            }
            if(temp.right!=null){
                queue.offer(temp.right);
            }
        }
    }
    //构建二叉树
    public static TreeNode createTree(LinkedList<String> list){
        String val=list.removeFirst();
        if(val!="#"){
            TreeNode n=new TreeNode(val);
            n.left=createTree(list);
            n.right=createTree(list);
            return n;
        }else{
            TreeNode t=null;
            return null;
        }
    }
    //统计叶子节点的个数
    public static int leafNum(TreeNode node){
        if(node==null){
            return 0;
        }
        if(node.right==null&&node.left==null){
            return 1;

        }
        return leafNum(node.left)+leafNum(node.right);
    }
    //统计二叉树的高度
    public static int treeHeight(TreeNode node){
        if(node==null)
            return 0;
        if(node.left==null&&node.right==null){
            return 1;
        }
        int lheight=treeHeight(node.left);
        int rheight=treeHeight(node.right);
        return (lheight>rheight?lheight:rheight)+1;
    }
    //判断一个节点是否在一棵子树中

}

class TreeNode{
    String val;
    TreeNode left=null;
    TreeNode right=null;
    public TreeNode(String val){
        this.val=val;
    }

}
