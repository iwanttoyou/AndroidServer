package android.canteen.model;

public class goods {
    private int id;
    private int wid;
    private String name;
    private String price;
    private String cost;
    private String imgURL;

    public goods() {
    }

    public goods(int id, int wid, String name, String price, String cost) {
        this.id = id;
        this.wid = wid;
        this.name = name;
        this.price = price;
        this.cost = cost;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    public String getCost() {
        return cost;
    }

    public void setCost(String cost) {
        this.cost = cost;
    }

    public String getImgURL() {
        return imgURL;
    }

    public void setImgURL(String imgURL) {
        this.imgURL = imgURL;
    }
}
