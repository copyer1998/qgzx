package com.qgzx.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.UpdateProvider;

import com.qgzx.dao.dynamicSQLProvider.DynamicSQLProvider;
import com.qgzx.entity.BringInfo;

/**
 * The interface Bring info dao.
 */
@Mapper
public interface BringInfoDao {

    /**
     * Query by id bring info.
     *
     * @param id the id
     * @return bring info
     * @author zhangzhengan
     * @since JDK 1.7
     */
    @Select("select * from bringInfo where id=#{id}")
	@Results({ 
			@Result(property = "id", column = "id"),
			@Result(property = "name", column = "name"),
			@Result(property = "time", column = "time"),
			@Result(property = "title", column = "title"),
			@Result(property = "type", column = "type"),
			@Result(property = "location", column = "location"),
			@Result(property = "worktime", column = "worktime"),
			@Result(property = "workplace", column = "workplace"),
			@Result(property = "pay", column = "pay"),
			@Result(property = "people", column = "people"),
			@Result(property = "deadline", column = "deadline"),
			@Result(property = "sex", column = "sex"),
			@Result(property = "grade", column = "grade"),
			@Result(property = "play", column = "play"),
			@Result(property = "need", column = "need"),
			@Result(property = "interview",column = "interview"),
	})
	BringInfo queryById(@Param("id") int id);

    /**
     * Add integer.
     *
     * @param bringInfo the bring info
     * @return integer
     * @author zhangzhengan
     * @since JDK 1.7
     */


    @Insert("insert ignore into bringInfo(name,time,title,type,location,worktime,workplace,pay,people,deadline,sex,grade,place,need) values(#{bringInfo.name},NOW(), #{bringInfo.title},#{bringInfo.type}, #{bringInfo.location}, #{bringInfo.worktime}, #{bringInfo.workplace}, #{bringInfo.pay}, #{bringInfo.people},#{bringInfo.deadline}, #{bringInfo.sex}, #{bringInfo.grade}, #{bringInfo.place}, #{bringInfo.need})")
	Integer add(@Param("bringInfo") BringInfo bringInfo);

    /**
     * Delete by id integer.
     *
     * @param id the id
     * @return integer
     * @author zhangzhengan
     * @since JDK 1.7
     */
    @Delete("delete from bringInfo where id=#{id}")
	Integer deleteById(@Param("id") Integer id);

    /**
     * Update integer.
     *
     * @param bringInfo the bring info
     * @return integer
     * @author zhangzhengan
     * @since JDK 1.7
     */
    @UpdateProvider(type = DynamicSQLProvider.class, method = "update")
	Integer update(@Param("bringInfo") BringInfo bringInfo);


    /**
     * Gets bring info.
     *
     * @param startPos the start pos
     * @param pageSize the page size
     * @return the bring info
     */
    @Select("select * from bringInfo order by id desc limit #{startPos},#{pageSize}")
	List<BringInfo> getBringInfo(@Param("startPos") int startPos,@Param("pageSize") int pageSize);

    /**
     * Gets count.
     *
     * @return the count
     */
    @Select("select count(*) from bringInfo")
	int getCount();

    /**
     * Gets bring info list.
     *
     * @param startPos the start pos
     * @param pageSize the page size
     * @return the bring info list
     */
    @Select("select * from bringInfo where people>0 and TO_DAYS(NOW()) - TO_DAYS(deadline) <= 0 order by id desc limit #{startPos},#{pageSize}")
	List<BringInfo> getBringInfoList(@Param("startPos") int startPos,@Param("pageSize") int pageSize);
}
