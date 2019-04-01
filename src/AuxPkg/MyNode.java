package AuxPkg;

public class MyNode {
    public int _value;
    public MyNode _left;
    public MyNode _right;

    public MyNode() {
        _value = 0;
        _left = null;
        _right = null;
    }

    public MyNode(int val) {
        _value = val;
        _left = null;
        _right = null;
    }

    public MyNode(int val, MyNode lft, MyNode rt) {
        _value = val;
        _left = lft;
        _right = rt;
    }
}
