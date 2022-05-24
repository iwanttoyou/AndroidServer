package android.canteen.model.employee;

public class General {
    private int id;
    private int fid;
    private String number;
    private String name;
    private String telephone;
    private String dormitory;
    private float wage;

    public General(int id, int fid, String number, String name, String telephone, String dormitory, float wage) {
        this.id = id;
        this.fid = fid;
        this.number = number;
        this.name = name;
        this.telephone = telephone;
        this.dormitory = dormitory;
        this.wage = wage;
    }

    public General() {}

    public int getId() {
        return id;
    }

    public int getFid() {
        return fid;
    }

    public void setFid(int fid) {
        this.fid = fid;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getDormitory() {
        return dormitory;
    }

    public void setDormitory(String dormitory) {
        this.dormitory = dormitory;
    }

    public float getWage() {
        return wage;
    }

    public void setWage(float wage) {
        this.wage = wage;
    }

}
