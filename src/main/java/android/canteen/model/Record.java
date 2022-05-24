package android.canteen.model;

public class Record {
    private int id;
    private int wid;
    private int localFloor;
    private String WindowName;
    private String msg;
    private String StudentName;
    private String StudentNum;

    public Record(int id, int wid, int localFloor, String windowName, String msg, String studentName, String studentNum) {
        this.id = id;
        this.wid = wid;
        this.localFloor = localFloor;
        WindowName = windowName;
        this.msg = msg;
        StudentName = studentName;
        StudentNum = studentNum;
    }

    public Record() {
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

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getStudentName() {
        return StudentName;
    }

    public void setStudentName(String studentName) {
        StudentName = studentName;
    }

    public String getStudentNum() {
        return StudentNum;
    }

    public void setStudentNum(String studentNum) {
        StudentNum = studentNum;
    }
}
