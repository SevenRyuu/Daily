package com.seven.diary.service.Impl;

import com.seven.diary.model.User;
import com.seven.diary.service.LoginService;
import com.seven.diary.vo.ResultResponse;
import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * created by sevenryuu77@gmail.com on 2018/4/21
 */
@Service
public class LoginServiceImpl implements LoginService {

    @Transactional
    @Override
    public ResultResponse register(User user){
        ResultResponse result = new ResultResponse();
        

        return result;
    }
}
