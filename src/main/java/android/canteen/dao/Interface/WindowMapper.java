package android.canteen.dao.Interface;

import android.canteen.model.window;

import java.util.List;

public interface WindowMapper {
    int insertOne(window window);   //不支持批量添加
    int deleteByList(List<Integer> list);   //支持批量删除
    int updateOne(window window);   //修改名字或迁移到某个楼, 不支持批量操作
    List<window> queryAll();
}
