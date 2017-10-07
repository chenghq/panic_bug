package data.database;

import org.apache.ibatis.session.RowBounds;

import java.util.List;

public interface IBaseMapper<T> {
	
	int deleteByPrimaryKey(Integer id);

	int insert(T record);

	int insertSelective(T record);

	T selectByPrimaryKey(Integer id);

	int updateByPrimaryKeySelective(T record);

	int updateByPrimaryKey(T record);

    int updateByPrimaryKeyWithBLOBs(T record);

	List<T> getAllByPage(RowBounds rowBounds);
}
