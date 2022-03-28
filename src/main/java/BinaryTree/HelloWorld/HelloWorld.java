package BinaryTree.HelloWorld;

class Node {
    int data;
    Node left;
    Node right;

    Node(int data) {
        this.data=data;
    }

    @Override
    public String toString() {
        return "Node{" +
                "data=" + data +
                ", left=" + left +
                ", right=" + right +
                '}';
    }
}

public class HelloWorld {

    public static void main(String[] args) {

        Node node = new Node(10);
        node.left = new Node(4);
        node.right = new Node(6);

        System.out.println("Node::"+node);

    }
}
