package com.hongghe.algorithmexamples.algorithm.list;

/**
 * @author: hongghe @date: 2019-03-06 20:28
 */
public class ReverseMain {

    public static void main(String[] args) {
        Node head = new Node(0);
        Node node1 = new Node(1);
        Node node2 = new Node(2);
        Node node3 = new Node(3);
        head.setNext(node1);
        node1.setNext(node2);
        node2.setNext(node3);

        // 打印反转前的链表
        Node h = head;
        while (null != h) {
            System.out.print(h.getData() + " ");
            h = h.getNext();
        }
        // 调用反转方法
        head = Reverse1(head);
        // head = Reverse2(head);
        System.out.println("\n**************************");
        // 打印反转后的结果
        while (null != head) {
            System.out.print(head.getData() + " ");
            head = head.getNext();
        }
    }


    public static Node Reverse(Node head) {
        if (head == null || head.getNext() == null) {
            return head;
        }

        Node nextHead = Reverse(head.getNext());
        head.getNext().setNext(head);
        head.setNext(null);
        return nextHead;
    }

    public static Node Reverse1(Node head) {
        // head看作是前一结点，head.getNext()是当前结点，reHead是反转后新链表的头结点
        if (head == null || head.getNext() == null) {
            return head;// 若为空链或者当前结点在尾结点，则直接还回
        }
        Node reHead = Reverse1(head.getNext());// 先反转后续节点head.getNext()
        head.getNext().setNext(head);// 将当前结点的指针域指向前一结点
        head.setNext(null);// 前一结点的指针域令为null;
        return reHead;// 反转后新链表的头结点
    }


    public static Node reverse2(Node head) {
        if (head == null)
            return head;
        Node pre = head;// 上一结点
        Node cur = head.getNext();// 当前结点
        Node tmp;// 临时结点，用于保存当前结点的指针域（即下一结点）
        while (cur != null) {// 当前结点为null，说明位于尾结点
            tmp = cur.getNext();
            cur.setNext(pre);// 反转指针域的指向

            // 指针往下移动
            pre = cur;
            cur = tmp;
        }
        // 最后将原链表的头节点的指针域置为null，还回新链表的头结点，即原链表的尾结点
        head.setNext(null);
        return pre;
    }
}
