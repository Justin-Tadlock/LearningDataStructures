package AuxPkg;

public class Node {
    public int value;
    public Node child;

    public Node(int newVal, Node newChildNode) {
        value = newVal;
        child = newChildNode;
    }
}