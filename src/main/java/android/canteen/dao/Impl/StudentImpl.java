package android.canteen.dao.Impl;

import android.canteen.dao.Interface.StudentMapper;
import android.canteen.model.student;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("StudentImpl")
public class StudentImpl implements StudentMapper {

    private SqlSessionFactory sqlSessionFactory;

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public int insertOneByList(List<student> students) {
        try (SqlSession session = sqlSessionFactory.openSession()){
            int result = session.getMapper(StudentMapper.class).insertOneByList(students);
            session.commit();
            return result;
        }
    }

    @Override
    public int deleteOneById(int id) {
        try (SqlSession session = sqlSessionFactory.openSession()){
            int result = session.getMapper(StudentMapper.class).deleteOneById(id);
            session.commit();
            return result;
        }
    }

    @Override
    public int deleteOneByList(List<Integer> ids) {
        try (SqlSession session = sqlSessionFactory.openSession()){
            int result = session.getMapper(StudentMapper.class).deleteOneByList(ids);
            session.commit();
            return result;
        }
    }

    @Override
    public int updatePassword(int id, String password) {
        try (SqlSession session = sqlSessionFactory.openSession()){
            int result = session.getMapper(StudentMapper.class).updatePassword(id, password);
            session.commit();
            return result;
        }
    }

    @Override
    public int updateMoney(int id, float money) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            int result = session.getMapper(StudentMapper.class).updateMoney(id, money);
            session.commit();
            return result;
        }
    }

    @Override
    public int updatePerson(student student) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            int result = session.getMapper(StudentMapper.class).updatePerson(student);
            session.commit();
            return result;
        }
    }

    @Override
    public student queryOneById(int id) {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            return session.getMapper(StudentMapper.class).queryOneById(id);
        }
    }

    @Override
    public List<student> queryAll() {
        try (SqlSession session = sqlSessionFactory.openSession()) {
            return session.getMapper(StudentMapper.class).queryAll();
        }
    }
}
