package data.database.user;

import data.database.IBaseMapper;
import data.database.user.pojo.User;

import java.util.Map;

/**
 * Created by Administrator on 2017/10/3.
 */
public interface UserMapper extends IBaseMapper<User> {
    User getByParams(Map<String, Object> params);
}
