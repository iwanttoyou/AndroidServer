package android.canteen.model;

public class student {
    private int id;             //数据库id
    private String number;      //学号
    private String name;        //姓名
    private String password;    //密码       @default('Yango123456')
    private String Telephone;   //联系电话
    private String address;     //在哪个宿舍楼
    private float stack;        //充钱        @default(0)

    public student(int id, String number, String name, String password, String telephone, String address, float stack) {
        this.id = id;
        this.number = number;
        this.name = name;
        this.password = password;
        this.Telephone = telephone;
        this.address = address;
        this.stack = stack;
    }

    public student(){}

    public int getId() {
        return id;
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

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getTelephone() {
        return Telephone;
    }

    public void setTelephone(String telephone) {
        this.Telephone = telephone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getStack() {
        return stack;
    }

    public void setStack(float stack) {
        this.stack = stack;
    }
}
