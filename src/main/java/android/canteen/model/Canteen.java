package android.canteen.model;

public class Canteen {
    private int id;
    private String name;
    private String manager;
    private int vol;
    private int index;
    private String BackgroundUrl;

    public Canteen() {}

    public Canteen(int id, String name, String manager, int vol, int index) {
        this.id = id;
        this.name = name;
        this.manager = manager;
        this.vol = vol;
        this.index = index;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManager() {
        return manager;
    }

    public void setManager(String manager) {
        this.manager = manager;
    }

    public int getVol() {
        return vol;
    }

    public void setVol(int vol) {
        this.vol = vol;
    }

    public int getIndex() {
        return index;
    }

    public void setIndex(int index) {
        this.index = index;
    }

    public String getBackgroundUrl() {
        return BackgroundUrl;
    }

    public void setBackgroundUrl(String backgroundUrl) {
        BackgroundUrl = backgroundUrl;
    }
}
