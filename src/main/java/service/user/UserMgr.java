package service.user;

/**
 * Created by Administrator on 2017/10/8.
 */
public interface UserMgr {
    /**
     * �ж��û���Ϣ�Ƿ����
     * �����û���������
     * @param userName
     * @param password
     * @return
     */
    boolean isExist(String userName, String password);
}
