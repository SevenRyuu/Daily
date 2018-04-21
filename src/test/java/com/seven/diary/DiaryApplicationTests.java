package com.seven.diary;

import com.seven.diary.dao.UserDao;
import com.seven.diary.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DiaryApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testBegin(){
        //userDao.insert("954585508@qq.com","seven", "1234567", "SEVEN", new Date());
        //User user = userDao.findUserByEmail("954585508@qq.com");
        User user = userDao.findTestValueByEmail("954585508@qq.com");
        System.out.println(user);
    }

}
