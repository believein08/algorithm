/**
 * Created by zhangyu on 2016/8/11.
 */

function ListNode(val){
    this.val=val;
    this.next=null;
}
var addTwoNumbers=function (l1,l2) {
    var res,cur,p,q;
    res=new ListNode(0);
    p=l1;q=l2;
    cur=res;
    var adding=0;
    while(p!=null||q!=null){
        var x=(p!=null)?p.val:0;
        var y=(q!=null)?q.val:0;
        var sum=x+y+adding;
        cur.next=new ListNode(sum%10);
        adding=Math.floor(sum/10);
        if(p!=null)
            p=p.next;
        if(q!=null)
            q=q.next;
        cur=cur.next;
    }
    if(adding>0)
        cur.next=new ListNode(adding);
    return res.next;
};
var l1=new ListNode(3);


var l2=new ListNode(9);

var l3=new ListNode(6);

var l4=new ListNode(2);

var l5=new ListNode(9);
var l6=new ListNode(1);

l1.next=l2;
l2.next=l3;
l4.next=l5;
l5.next=l6;


var p=addTwoNumbers(l1,l4);
while(p!=null){
    console.info(p.val);
    p=p.next;
}
console.info(addTwoNumbers(l1,l4));
