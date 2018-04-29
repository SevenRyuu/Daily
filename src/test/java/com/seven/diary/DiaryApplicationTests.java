package com.seven.diary;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.seven.diary.dao.UserDao;
import com.seven.diary.model.Role;
import com.seven.diary.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class DiaryApplicationTests {

    @Autowired
    private UserDao userDao;

    @Test
    public void contextLoads() {
    }

    @Test
    public void testBegin() {
        User user = new User();
        user.setEmail("test@qq.com");
        user.setUsername("name");
        user.setPassword("mima1234");
        user.setRole(Role.SEVEN);

        userDao.saveUser(user);
        System.out.println(user);
    }

    @Test
    public void testPage() {
        PageHelper.startPage(1, 3);
        List<User> a = userDao.findAll();
        PageInfo<User> pageInfo = new PageInfo<User>(a);

        //System.out.println((List<User>)pageInfo.getList());
        pageInfo.getList().forEach(p->{
            System.out.println(p);
        });
        //System.out.println(pageInfo);
    }


}
