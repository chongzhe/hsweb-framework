package org.hswebframework.web.service.authorization;

import org.hswebframework.web.authorization.Authorization;
import org.hswebframework.web.entity.authorization.UserEntity;
import org.hswebframework.web.service.CreateEntityService;
import org.hswebframework.web.service.InsertService;
import org.hswebframework.web.service.QueryByEntityService;
import org.hswebframework.web.service.QueryService;

import java.util.Date;

/**
 * TODO 完成注释
 *
 * @author zhouhao
 */
public interface UserService extends
        CreateEntityService<UserEntity>,
        QueryByEntityService<UserEntity>,
        QueryService<UserEntity, String>,
        InsertService<UserEntity, String> {

    boolean enable(String userId);

    boolean disable(String userId);

    void update(UserEntity userBean);

    UserEntity selectByUsername(String username);

    String encodePassword(String password, String salt);

    void updateLoginInfo(String userId, String ip, Long loginTime);

    void updatePassword(String userId, String oldPassword, String newPassword);

    Authorization initUserAuthorization(String userId);

    Authorization initAdminAuthorization(String userId);
}
