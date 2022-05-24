package android.canteen.model.employee;

//在食堂中外卖员自动为一个楼层共用

public class Takeaway extends General{

    private int count;  //送外卖的次数

    public Takeaway(int id, int fid, String number, String name, String telephone, String dormitory, float wage) {
        super(id, fid, number, name, telephone, dormitory, wage);
    }

    public Takeaway() {
        super();
    }

    public int getCount() {
        return count;
    }

    public void setCount(int count) {
        this.count = count;
    }
}
