package com.seven.diary.service;

import com.seven.diary.model.User;
import com.seven.diary.vo.ResultResponse;
import org.springframework.transaction.annotation.Transactional;

/**
 * created by sevenryuu77@gmail.com on 2018/4/21
 */
public interface LoginService {

    ResultResponse register(User user);

}
