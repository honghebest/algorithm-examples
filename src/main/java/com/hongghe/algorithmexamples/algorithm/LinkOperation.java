package com.hongghe.algorithmexamples.algorithm;

/**
 * @author: hongghe @date: 2019-04-18 11:45
 */
public class LinkOperation {

    public static void main(String[] args) {

    }

    public void deleteLinkNode(LinkNode linkNode) {
    }

    /**
     * 反转链表
     *
     * @param root
     * @return
     */
    public static LinkNode reverseLoop(LinkNode root) {
        if (root == null || root.getNext() == null)
            return root;
        LinkNode pre = null;
        LinkNode next = null;
        while (root != null) {
            next = root.getNext();
            root.setNext(pre);
            pre = root;
            root = next;
        }
        return pre;
    }

    public static LinkNode reverseRecursive(LinkNode root) {
        if (root == null || root.getNext() == null)
            return root;
        LinkNode newHead = reverseRecursive(root.getNext());
        root.getNext().setNext(root);
        root.setNext(null);
        return newHead;
    }

    /**
     * 查询第X节点
     *
     * @param root
     * @param x
     * @return
     */
    public static LinkNode findXNode(LinkNode root, int x) {
        if (x < 0) return null;
        LinkNode slow, fast;
        slow = fast = root;
        int i = x;
        for (; i>0 && fast != null; i--) {
            fast = fast.getNext();
        }

        if (i > 0) return null;
        while (fast != null) {
            slow = slow.getNext();
            fast = fast.getNext();
        }
        return slow;
    }

    /**
     * 查询链表中的中间节点
     *
     * @param head
     * @return
     */
    public static LinkNode searchMiddleNode(LinkNode head) {
        if (head == null) return null;
        LinkNode slow, fast;
        slow = fast = head;
        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
        }
        return slow;
    }

    /**
     * 节点是否有环
     *
     * @param head 头部节点
     * @param loopNode 环内节点
     * @return
     */
    public static boolean isLoop(LinkNode head, LinkNode loopNode) {
        LinkNode slow, fast;
        slow = fast = head;
        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            if (fast == slow) {
                loopNode = fast;
                return true;
            }
        }
        return false;
    }

    /**
     * 查找环的入口
     *
     * @param head
     * @return
     */
    public static LinkNode findLoopPort(LinkNode head) {
        if (head == null || head.getNext() == null) return null;
        LinkNode slow, fast;
        slow = fast = head;
        while (fast != null && fast.getNext() != null) {
            fast = fast.getNext().getNext();
            slow = slow.getNext();
            if (fast == slow) {
                break;
            }
        }

        if (fast != slow) return null;
        fast = head;
        while (fast != slow) {
            fast= fast.getNext();
            slow = slow.getNext();
        }
        return fast;
    }

    /**
     * 两个链表是否相交
     *
     * @param head1
     * @param head2
     * @return
     */
    public static boolean isIntersect(LinkNode head1, LinkNode head2) {
        if (head1 == null || head2 == null) return false;
        while (head1.getNext() != null) {
            head1 = head1.getNext();
        }

        while (head2.getNext() != null) {
            head2 = head2.getNext();
        }

        if (head1 == head2) return true;
        else return false;
    }

    /**
     * 查询两个环链表是否相交
     *
     * @param head1
     * @param head2
     * @return
     */
    public static boolean isIntersectWithLoop(LinkNode head1, LinkNode head2) {
        LinkNode loopNode1, loopNode2;
        loopNode1 = findLoopPort(head1);
        loopNode2 = findLoopPort(head2);
        if (!isLoop(head1, loopNode1)) return false;
        if (!isLoop(head2, loopNode2)) return false;
        LinkNode temp = loopNode1.getNext();
        while (temp != loopNode2) {
            if (temp == loopNode1) return true;
            temp = temp.getNext();
        }
        return false;
    }

    /**
     * 查询两个无环链表相交的公共节点
     *
     * @param head1
     * @param head2
     * @return
     */
    public static LinkNode searchIntersectLoopNode(LinkNode head1, int length1, LinkNode head2, int length2) {
        if (length1 > length2) {
            for (int i=0; i<length1-length2; i++)
                head1 = head1.getNext();
        } else {
            for (int j=0; j<length2-length1; j++)
                head2 = head2.getNext();
        }

        while (head1 != null) {
            if (head1 == head2) return head1;
            head1 = head1.getNext();
            head2 = head2.getNext();
        }
        return null;
    }
}
