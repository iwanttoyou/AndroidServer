package android.canteen.dao.Impl;

import android.canteen.dao.Interface.WindowMapper;
import android.canteen.model.window;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("WindowImpl")
public class WindowImpl implements WindowMapper {

    private SqlSessionFactory sqlSessionFactory;

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public int insertOne(window window) {
        try(SqlSession session = sqlSessionFactory.openSession()){
            int result = session.getMapper(WindowMapper.class).insertOne(window);
            session.commit();
            return result;
        }
    }

    @Override
    public int deleteByList(List<Integer> list) {
        try(SqlSession session = sqlSessionFactory.openSession()){
            int result = session.getMapper(WindowMapper.class).deleteByList(list);
            session.commit();
            return result;
        }
    }

    @Override
    public int updateOne(window window) {
        try(SqlSession session = sqlSessionFactory.openSession()){
            int result = session.getMapper(WindowMapper.class).updateOne(window);
            session.commit();
            return result;
        }
    }

    @Override
    public List<window> queryAll() {
        try(SqlSession session = sqlSessionFactory.openSession()){
            return session.getMapper(WindowMapper.class).queryAll();
        }
    }
}
