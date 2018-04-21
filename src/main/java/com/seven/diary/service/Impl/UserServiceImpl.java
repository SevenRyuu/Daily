package com.seven.diary.service.Impl;

import com.seven.diary.dao.UserDao;
import com.seven.diary.model.User;
import com.seven.diary.service.UserService;
import com.seven.diary.vo.ResultResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class UserServiceImpl implements UserService {

    @Autowired
    private UserDao userDao;

    @Override
    @Transactional
    public ResultResponse addUser(User user) {
        // TODO Auto-generated method stub
        ResultResponse result = new ResultResponse();
//        User oldUser = userDao.getByUsername(user.getUsername());
//
//        if (oldUser != null) {
//            result.setResult(false);;
//            return result;
//        }else{
//            userDao.addUser(user);
//
//        }

        return result;
    }

}