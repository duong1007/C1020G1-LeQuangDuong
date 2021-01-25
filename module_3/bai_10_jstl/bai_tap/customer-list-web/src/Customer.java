public class Customer {
    private String name;
    private String add;
    private String date;
    private String img;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdd() {
        return add;
    }

    public void setAdd(String add) {
        this.add = add;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getImg() {
        return img;
    }

    public void setImg(String img) {
        this.img = img;
    }

    public Customer(String name, String date, String add, String img) {
        this.name = name;
        this.add = add;
        this.date = date;
        this.img = img;
    }

}
