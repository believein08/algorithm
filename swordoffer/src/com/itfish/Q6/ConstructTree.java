package com.itfish.Q6;

import java.util.Arrays;

/**
 * Created by zhangyu on 2016/6/24.
 * 1.根节点是先序遍历的第一个，在中序序列中找到根结点，则可以确定左边是左子树，右边是右子树。
 * 2，创建根节点，递归产生左结点和右结点。
 * 3.需要注意的是要注意返回，在java中应该给出数组的copy，用Arrays.copyOfRange()出现了一次错误，
 * 错误：自己给Arrays.copyOfRange()传递参数传错了，不应该是length-1;
 */
public class ConstructTree {
    public static void main(String[] args) {
        int pre[]={1,2,4,7,3,5,6,8};
        int in[]={4,7,2,1,5,3,8,6};
        TreeNode node=construct(pre,in);

    }
    public static TreeNode construct(int pre [],int in[]){
        for(int i=0;i<in.length;i++){
            if(in[i]==pre[0]){
                TreeNode root=new TreeNode(in[i]);
                root.left=construct(Arrays.copyOfRange(pre,1,i+1),Arrays.copyOfRange(in,0,i));
                root.right=construct(Arrays.copyOfRange(pre,i+1,pre.length),Arrays.copyOfRange(in,i+1,in.length));
                return root;

            }
        }
        return null;
    }
}
class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    public TreeNode(int val){
        this.val=val;
    }
}
