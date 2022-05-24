package android.canteen.dao.Interface;

import android.canteen.model.goods;

import java.util.List;

public interface GoodsMapper {

    int insertOne(goods goods); //只支持一个一个加

    int deleteList(List<goods> list);   //支持批量删除

    int updateOne(goods goods);     //支持修改一个但不支持批量修改

    goods queryOneById(int id);           //用于查询是否存在

    List<goods> queryAll();         //显示所有商品

}
