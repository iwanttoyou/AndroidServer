package android.canteen.model.employee;

public class Chef extends General {
    private int wid;    //在哪个窗口工作

    private int locatFloor; //几楼

    private String WindowName;    //窗口名

    public Chef(int id, int fid, String number, String name, String telephone, String dormitory, float wage) {
        super(id, fid, number, name, telephone, dormitory, wage);
    }

    public Chef() {
        super();
    }

    public int getWid() {
        return wid;
    }

    public void setWid(int wid) {
        this.wid = wid;
    }

    public int getLocatFloor() {
        return locatFloor;
    }

    public void setLocatFloor(int locatFloor) {
        this.locatFloor = locatFloor;
    }

    public String getWindowName() {
        return WindowName;
    }

    public void setWindowName(String windowName) {
        WindowName = windowName;
    }
}
