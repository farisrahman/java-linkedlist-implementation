package list;

public class LinkedList {
    private Node link;
    private Node first;
    private int size;

    public LinkedList() {
        this.link = null;
        this.size = 0;
    }

    // Option 3
    public void newSearch(String nama) {
        boolean cek = true;
        Node current = this.getLink();
        while (current != null) {
            if (current.getData().getNama().toLowerCase().contains(nama.toLowerCase())) {
                System.out.println(
                        current.getData().getNama() + " telah mengedit " + current.getData().getTotal() + " artikel");
                current.getData().printTitle();
                System.out.println("\n");
                cek = false;
                current = current.getNode();
            } else
                current = current.getNode();
        }
        if (cek) {
            System.out.println("Nama Editor yang anda cari tidak ditemukan");
        }
    }

    // Option 2
    public void searchByName(String nama) {
        boolean cek = true;
        Node current = this.getLink();
        while (current != null) {
            if (current.getData().getNama().toLowerCase().contains(nama.toLowerCase())) {
                System.out.println(
                        current.getData().getNama() + " telah mengedit " + current.getData().getTotal() + " artikel");
                cek = false;
                current = current.getNode();
            } else
                current = current.getNode();
        }
        if (cek) {
            System.out.println("Nama Editor yang anda cari tidak ditemukan");
        }
    }

    // Option 1
    public void display() {
        Node temp = this.getLink();
        while (temp != null) {
            System.out.println(temp.getData().getNama() + "\t" + temp.getData().getTotal());
            if (temp.getNode() == null)
                break;
            temp = temp.getNode();
        }
    }

    public void add(Data data) {
        if (hasDuplicated(data)) {
            this.getLink().getData().incTotal();
            this.getLink().getData().setTitle(data.getTitle());
        } else {
            this.setLink(new Node(data, this.getLink()));
            first = this.getLink();
            this.incSize();
        }
    }

    public boolean hasDuplicated(Data input) {
        boolean value = false;
        Node current = this.getLink();
        while (current != null) {
            if (current.getData().getNama().equals(input.getNama())) {
                value = true;
                break;
            } else
                current = current.getNode();
        }
        return value;
    }

    public Node getFirst() {
        return this.first;
    }

    public void setLink(Node link) {
        this.link = link;
    }

    public Node getLink() {
        return this.link;
    }

    public int getSize() {
        return this.size;
    }

    public void incSize() {
        this.size++;
    }

    public void decSize() {
        this.size--;
    }

    // Selection Sort
    public void SelectionSort() {
        Node temp = this.getLink();
        Node current = this.getLink();
        Node currNext = current.getNode();

        while (current.getNode() != null) {
            while (currNext != null) {
                if (current.getData().getNama().toLowerCase()
                        .compareTo(currNext.getData().getNama().toLowerCase()) > 0) {
                    current = currNext;
                }
                currNext = currNext.getNode();
            }
            Data dataTemp = temp.getData();
            temp.setData(current.getData());
            current.setData(dataTemp);

            temp = temp.getNode();
            current = temp;
            currNext = current.getNode();
        }
    }

}