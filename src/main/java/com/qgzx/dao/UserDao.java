package com.qgzx.dao;

import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;

import com.qgzx.entity.User;

/**
 * The interface User dao.
 */
@Mapper
public interface UserDao {
    /**
     * Query by id user.
     *
     * @param id the id
     * @return user
     * @author zhangzhengan
     * @since JDK 1.7
     */
    @Select("select * from user where id=#{id}")
	@Results({ 
			@Result(property = "id", column = "id"),
			@Result(property = "password", column = "password"),
			@Result(property = "userName", column = "userName"),
			@Result(property = "qq", column = "qq"),
			@Result(property = "phoneNumber", column = "phoneNumber"),
	})
	User queryById(@Param("id") String id);

}
