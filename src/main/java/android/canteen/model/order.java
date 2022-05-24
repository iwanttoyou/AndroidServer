package android.canteen.model;

public class order {
    private int id;
    private int localFloor;
    private String WindowName;
    private String ImgUrl;
    private String name;
    private float price;
    private int number;

    public order(int localFloor, String windowName, String imgUrl, String name, float price, int number) {
        this.localFloor = localFloor;
        WindowName = windowName;
        ImgUrl = imgUrl;
        this.name = name;
        this.price = price;
        this.number = number;
    }

    public order() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getLocalFloor() {
        return localFloor;
    }

    public void setLocalFloor(int localFloor) {
        this.localFloor = localFloor;
    }

    public String getWindowName() {
        return WindowName;
    }

    public void setWindowName(String windowName) {
        WindowName = windowName;
    }

    public String getImgUrl() {
        return ImgUrl;
    }

    public void setImgUrl(String imgUrl) {
        ImgUrl = imgUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getPrice() {
        return price;
    }

    public void setPrice(float price) {
        this.price = price;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }
}
