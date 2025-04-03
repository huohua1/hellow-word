package org.student.yunpicture.service;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import org.student.yunpicture.model.dto.user.UserQueryRequest;
import org.student.yunpicture.model.entity.User;
import com.baomidou.mybatisplus.extension.service.IService;
import org.student.yunpicture.model.vo.LoginUserVO;
import org.student.yunpicture.model.vo.UserVO;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
* @author 39388
* @description 针对表【user(用户)】的数据库操作Service
* @createDate 2025-02-27 21:14:16
*/
public interface UserService extends IService<User> {
    long userRegister(String userAccount, String userPassword, String checkPassword);
    /**
     * 用户登录
     *
     * @param userAccount  用户账户
     * @param userPassword 用户密码
     * @param request
     * @return 脱敏后的用户信息
     */


    LoginUserVO userLogin(String userAccount, String userPassword, HttpServletRequest request);

    String getEncryptPassword(String userPassword);
    LoginUserVO getLoginUserVO(User user);
    /**
     * 用户注销
     *
     * @param request
     * @return
     */
    boolean userLogout(HttpServletRequest request);

    /**
     * 获取当前登录用户
     *
     * @param request
     * @return
     */
    User getLoginUser(HttpServletRequest request);

    UserVO getUserVO(User user);
    List<UserVO> getUserVOList(List<User> userList);

    QueryWrapper<User> getQueryWrapper(UserQueryRequest userQueryRequest);

}
