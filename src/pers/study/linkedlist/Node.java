package pers.study.linkedlist;

/**
 * @ClassName Node
 * @Author JustEP
 * @Version 1.0
 * @Description 链表结点类
 * @CreateTime 2019/05/01 07:17:00
 */
public class Node {
    /**
     * @Description 存储内容
     */
    private int value;
    /**
     * @Description 下一结点地址
     */
    private Node nextNode;

    public int getValue() {
        return value;
    }

    public void setValue(int value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
