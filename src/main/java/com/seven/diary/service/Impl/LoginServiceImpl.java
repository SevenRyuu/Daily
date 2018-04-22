package com.seven.diary.service.Impl;

import com.seven.diary.dao.UserDao;
import com.seven.diary.model.User;
import com.seven.diary.service.LoginService;
import com.seven.diary.utils.MD5Utils;
import com.seven.diary.utils.MsgConstants;
import com.seven.diary.vo.ResultResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * created by sevenryuu77@gmail.com on 2018/4/21
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public ResultResponse register(User userVO){
        ResultResponse result = new ResultResponse();
        User verifyUnique = userDao.findUserByEmail(userVO.getEmail());

        if (null != verifyUnique){

            result.setCode("88");
            result.setReturnMsg(MsgConstants.existedUser());
            return result;

        }else{

            User newUser = new User();
            newUser.setEmail(userVO.getEmail());
            newUser.setUsername(userVO.getUsername());
            if (StringUtils.isNotBlank(userVO.getPassword())){
                //md5加密密码
                String md5Password = MD5Utils.md5Encode(userVO.getPassword());
                newUser.setPassword(md5Password);
            }else{
                result.setCode("87");
                result.setReturnMsg(MsgConstants.errorPassword());
                return result;
            }
            newUser.setRole(userVO.getRole());

            userDao.saveUser(newUser);
            result.setReturnMsg(MsgConstants.requestSuccess());

        }

        return result;
    }
}
