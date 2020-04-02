package list;

public class Node {
    private Data data;
    private Node link;

    public Node(Data data, Node link) {
        setData(data);
        setLink(link);
    }

    public void setNull() {
        this.data = null;
        this.link = null;
    }

    public void setNode(Node curr) {
        this.data = curr.data;
        this.link = curr.link;

    }

    public void setData(Data data) {
        this.data = data;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    public Data getData() {
        return this.data;
    }

    public Node getLink() {
        return this.link;
    }

    public boolean hasNext() {
        return this.link != null;
    }

    public Node getNode() {
        if (this.hasNext())
            return this.link;
        return null;
    }

}