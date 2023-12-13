package test;

import test.ListNode;
public class AddTwoNums {
    public static ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int num1=0;
        int pow=1;
        while(l1!=null){
            num1+=l1.val*pow;
            pow*=10;
            l1=l1.next;
        }
        System.out.println("num1="+num1);
        long num2=0;
        long pow2=1;
        while(l2!=null){
            num2+=l2.val*pow2;
            pow2*=10;
            l2=l2.next;
        }
        System.out.println("num2="+num2);

        long res=num1+num2;
        System.out.println("res="+res);

//        ListNode sender = new ListNode();
//        sender.val=res%10;
//        sender.next = new ListNode();
//        res/=10;
        ListNode now = new ListNode(0,null);
        ListNode bef = new ListNode();
        int length = String.valueOf(res).length();
        System.out.println("len of res= "+length);
        long p = (long) Math.pow(10,length-1);
        while(p>0){
            now.val = (int)(res/p)%10;
            p/=10;
            bef = new ListNode();
            bef.next = now;
            now = bef;
        }
        //last one
        bef.val = (int) res % 10;
        return bef;
    }

    public static void addTwoNumsHelper(){
        ListNode n0 = new ListNode(9,null);
        ListNode n10 = new ListNode(9,null);
        ListNode n9 = new ListNode(9,n10);
        ListNode n8 = new ListNode(9,n9);
        ListNode n7 = new ListNode(9,n8);
        ListNode n6 = new ListNode(9,n7);
        ListNode n5 = new ListNode(9,n6);
        ListNode n4 = new ListNode(9,n5);
        ListNode n3 = new ListNode(9,n4);
        ListNode n2 = new ListNode(9,n3);
        ListNode n1 = new ListNode(1,n2);

        ListNode res = addTwoNumbers(n0,n1);
        while(res!=null) {
            System.out.println(res.val);
            res=res.next;
        }
    }
}
