package test;

import java.util.*;

public class MergeKLists {

    public ListNode doList (ListNode bef,){

    }
    public ListNode mergeKLists(ListNode[] lists) {
        SortedSet<Integer> sorted = new TreeSet<>();
        for(ListNode s:lists){
            while(s.next != null){
                sorted.add(s.val);
            }
            sorted.add(s.val);
        }

        System.out.println(sorted.toString());

        ListNode start = null;
        ListNode bef =null;
        for(Integer i:sorted){
            if(start == null){
                start = new ListNode(i);
                bef = start;
            }
            else{
                ListNode now = new ListNode(i);
                bef.next = now;

            }
        }

    }
}
