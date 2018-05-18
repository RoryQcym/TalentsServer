package com.fbc.TalentsServer.service;

import org.apache.ibatis.annotations.Insert;
import org.springframework.stereotype.Service;

import com.fbc.TalentsServer.domain.User;
@Service
public interface UserService {
    User findUserByPhone(Integer id);

    @Insert("INSERT INTO USER(NAME, PASSWORD, PHONE) VALUES(#{name}, #{password}, #{phone})")
    int insert(String name,String password,String phone);
}
