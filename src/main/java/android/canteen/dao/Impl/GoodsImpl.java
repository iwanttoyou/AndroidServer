package android.canteen.dao.Impl;

import android.canteen.dao.Interface.GoodsMapper;
import android.canteen.model.goods;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository("GoodsImpl")
public class GoodsImpl implements GoodsMapper {

    private SqlSessionFactory sqlSessionFactory;

    @Autowired
    public void setSqlSessionFactory(SqlSessionFactory sqlSessionFactory) {
        this.sqlSessionFactory = sqlSessionFactory;
    }

    @Override
    public int insertOne(goods goods) {
        try(SqlSession session = sqlSessionFactory.openSession()){
            int result = session.getMapper(GoodsMapper.class).insertOne(goods);
            session.commit();
            return result;
        }
    }

    @Override
    public int deleteList(List<goods> list) {
        try(SqlSession session = sqlSessionFactory.openSession()){
            int result = session.getMapper(GoodsMapper.class).deleteList(list);
            session.commit();
            return result;
        }
    }

    @Override
    public int updateOne(goods goods) {
        try(SqlSession session = sqlSessionFactory.openSession()){
            int result = session.getMapper(GoodsMapper.class).updateOne(goods);
            session.commit();
            return result;
        }
    }

    @Override
    public goods queryOneById(int id) {
        try(SqlSession session = sqlSessionFactory.openSession()){
            return session.getMapper(GoodsMapper.class).queryOneById(id);
        }
    }

    @Override
    public List<goods> queryAll() {
        try(SqlSession session = sqlSessionFactory.openSession()){
            return session.getMapper(GoodsMapper.class).queryAll();
        }
    }
    public void Print(){
        System.out.println("hello word");
    }
}
