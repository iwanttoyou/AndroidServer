package android.canteen.dao.Interface;

import android.canteen.model.student;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface StudentMapper {
    //增
    int insertOneByList(List<student> students);    //用于批量添加
    //删
    int deleteOneById(int id);
    int deleteOneByList(List<Integer> ids);
    //改
    int updatePassword(@Param("id") int id, @Param("password") String password);
    int updateMoney(@Param("id")int id, @Param("money") float money);
    int updatePerson(student student);     //修改个人信息(除了密码, 钱)
    //查
    student queryOneById(int id);   //用于登录
    List<student> queryAll();
}
