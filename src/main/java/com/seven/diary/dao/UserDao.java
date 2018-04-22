package com.seven.diary.dao;

import com.seven.diary.model.User;
import org.apache.ibatis.annotations.*;
import org.springframework.security.core.parameters.P;

import java.util.Date;

@Mapper
public interface UserDao {

    @Select("SELECT * FROM SEVEN_USER WHERE EMAIL = #{email}")
    User findUserByEmail(@Param("email") String email);

    @Results({
            @Result(property = "username", column = "test_value")
    })
    @Select("select test_value from seven_user where email = #{email}")
    User findTestValueByEmail(@Param("email") String email);

    @Insert("INSERT INTO SEVEN_USER(EMAIL, USERNAME, PASSWORD, ROLE, CREATE_DATE) VALUES(#{email}, #{username}, #{password}, #{role}, #{createDate})")
    //int insert(@Param("email") String email, @Param("name") String name, @Param("password") String password, @Param("role") String role, @Param("createDate") Date createDate);
    int saveUser(User user);

    @Delete("DELETE FROM SEVEN_USER WHERE ID = #{id}")
    void delete(Long id);

}
