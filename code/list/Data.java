package list;

public class Data {
    private String nama;
    private String[] title;
    private int total;

    public Data(String nama, String title) {
        this.title = new String[200];
        this.title[0] = title;
        this.nama = nama;
        this.total = 1;
    }

    public String getNama() {
        return this.nama;
    }

    public void setTitle(String title) {
        this.title[total - 1] = title;
    }

    public void printTitle() {
        int i = 0;
        while (title[i] != null) {
            System.out.println("--> " + (i + 1) + ". " + title[i]);
            i++;
        }
    }

    public String getTitle() {
        return this.title[0];
    }

    public int getTotal() {
        return this.total;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void incTotal() {
        this.total++;
    }

}