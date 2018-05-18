package com.fbc.TalentsServer.dao;

import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;

import com.fbc.TalentsServer.domain.User;

@Mapper
public interface UserDao {
	@Select("SELECT * FROM USER WHERE id = #{id}")
    User findUserByPhone(@Param("id") Integer id);

    @Insert("INSERT INTO USER(NAME, PASSWORD, PHONE) VALUES(#{name}, #{password}, #{phone})")
    int insert(@Param("name") String name, @Param("password") String password, @Param("phone") String phone);

}
