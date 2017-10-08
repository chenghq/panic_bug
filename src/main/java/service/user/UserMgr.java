package service.user;

/**
 * Created by Administrator on 2017/10/8.
 */
public interface UserMgr {
    /**
     * 判断用户信息是否存在
     * 包括用户名和密码
     * @param userName
     * @param password
     * @return
     */
    boolean isExist(String userName, String password);
}
