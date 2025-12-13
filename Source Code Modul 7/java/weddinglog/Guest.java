package weddinglog;

public class Guest extends Person {
    private String category;

    public Guest(String name, String address, String category) {
        super(name, address);
        this.category = category;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    @Override
    public String getRoleInfo() {
        return "Tamu: " + category;
    }
}