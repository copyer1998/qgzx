package com.qgzx.service;

import com.qgzx.entity.BringInfo;

import java.util.List;


/**
 * The interface Bring info service.
 */
public interface BringInfoService {
    /**
     * Query by id.
     *
     * @param id the id
     * @throws Exception the exception
     * @author zhangzhengan
     * @since JDK 1.7
     */
    void queryById(int id) throws Exception;

    /**
     * Add bring info boolean.
     *
     * @param bringInfo the bring info
     * @return boolean
     * @throws Exception the exception
     * @author zhangzhengan
     * @since JDK 1.7
     */
    Boolean addBringInfo(BringInfo bringInfo) throws Exception;


    /**
     * Delete student.
     *
     * @param id the id
     * @throws Exception the exception
     * @author zhangzhengan
     * @since JDK 1.7
     */
    void deleteStudent(Integer id) throws Exception;

    /**
     * 更新学生信息
     *
     * @param bringInfo the bring info
     * @return boolean
     * @throws Exception the exception
     * @author zhangzhengan
     * @since JDK 1.7
     */
    Boolean updateBringInfo(BringInfo bringInfo) throws Exception;

    /**
     * Gets bring info.
     *
     * @param startPos the start pos
     * @param pageSize the page size
     * @return the bring info
     */
    List<BringInfo> getBringInfo(int startPos, int pageSize);

    /**
     * Delete bring info boolean.
     *
     * @param id the id
     * @return the boolean
     */
    Boolean deleteBringInfo(int id);

    /**
     * Gets bring info by id.
     *
     * @param id the id
     * @return the bring info by id
     */
    BringInfo getBringInfoById(int id);

    /**
     * Gets count.
     *
     * @return the count
     */
    int getCount();

    /**
     * Gets bring info list.
     *
     * @param startPos the start pos
     * @param pageSize the page size
     * @return the bring info list
     */
    List<BringInfo> getBringInfoList(int startPos, int pageSize);


}
