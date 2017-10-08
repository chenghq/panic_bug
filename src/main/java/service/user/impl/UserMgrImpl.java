package service.user.impl;

import data.database.user.UserMapper;
import data.database.user.pojo.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import service.user.UserMgr;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Administrator on 2017/10/8.
 */
@Service
public class UserMgrImpl implements UserMgr {
    @Autowired
    private UserMapper userMapper;

    public boolean isExist(String userName, String password) {
        Map<String, Object> paramMap = new HashMap<String, Object>();
        paramMap.put("userName", userName);
        paramMap.put("password", password);

        User user = userMapper.getByParams(paramMap);
        if (user == null) {
            return false;
        }

        return true;
    }
}
