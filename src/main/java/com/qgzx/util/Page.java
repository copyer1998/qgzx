package com.qgzx.util;

import java.io.Serializable;

/**
 * The type Page.
 */
public class Page implements Serializable {
    private static final long serialVersionUID = -3198048449643774660L;
    private int pageNow = 1; // 当前页数
    private int pageSize = 10; // 每页显示记录的条数
    private int totalCount; // 总的记录条数
    private int totalPageCount; // 总的页数

    private int startPos; // 开始位置，从0开始


    private boolean hasFirst;// 是否有首页


    private boolean hasPre;// 是否有前一页


    private boolean hasNext;// 是否有下一页


    private boolean hasLast;// 是否有最后一页

    /**
     * Instantiates a new Page.
     */
    public Page() {
        super();
    }

    /**
     * Gets total page count.
     *
     * @return the total page count
     */
    public int getTotalPageCount() {
        totalPageCount = getTotalCount() / getPageSize();
        return (totalCount % pageSize == 0) ? totalPageCount
                : totalPageCount + 1;
    }

    /**
     * Sets total page count.
     *
     * @param totalPageCount the total page count
     */
    public void setTotalPageCount(int totalPageCount) {
        this.totalPageCount = totalPageCount;
    }

    /**
     * Gets page now.
     *
     * @return the page now
     */
    public int getPageNow() {
        return pageNow;
    }

    /**
     * Sets page now.
     *
     * @param pageNow the page now
     */
    public void setPageNow(int pageNow) {
        this.pageNow = pageNow;
    }

    /**
     * Gets page size.
     *
     * @return the page size
     */
    public int getPageSize() {
        return pageSize;
    }

    /**
     * Sets page size.
     *
     * @param pageSize the page size
     */
    public void setPageSize(int pageSize) {
        this.pageSize = pageSize;
    }

    /**
     * Gets total count.
     *
     * @return the total count
     */
    public int getTotalCount() {
        return totalCount;
    }

    /**
     * Sets total count.
     *
     * @param totalCount the total count
     */
    public void setTotalCount(int totalCount) {
        this.totalCount = totalCount;
    }

    /**
     * 取得选择记录的初始位置
     *
     * @return start pos
     */
    public int getStartPos() {
        return (pageNow - 1) * pageSize;
    }

    /**
     * Sets start pos.
     *
     * @param startPos the start pos
     */
    public void setStartPos(int startPos) {
        this.startPos = startPos;
    }

    /**
     * 是否是第一页
     *
     * @return boolean
     */
    public boolean isHasFirst() {
        return pageNow != 1;
    }

    /**
     * Sets has first.
     *
     * @param hasFirst the has first
     */
    public void setHasFirst(boolean hasFirst) {
        this.hasFirst = hasFirst;
    }

    /**
     * 是否有首页
     *
     * @return boolean
     */
    public boolean isHasPre() {
        // 如果有首页就有前一页，因为有首页就不是第一页
        return isHasFirst();
    }

    /**
     * Sets has pre.
     *
     * @param hasPre the has pre
     */
    public void setHasPre(boolean hasPre) {
        this.hasPre = hasPre;
    }

    /**
     * 是否有下一页
     *
     * @return boolean
     */
    public boolean isHasNext() {
        // 如果有尾页就有下一页，因为有尾页表明不是最后一页
        return isHasLast();
    }

    /**
     * Sets has next.
     *
     * @param hasNext the has next
     */
    public void setHasNext(boolean hasNext) {
        this.hasNext = hasNext;
    }

    /**
     * 是否有尾页
     *
     * @return boolean
     */
    public boolean isHasLast() {
        // 如果不是最后一页就有尾页
        return pageNow != getTotalCount();
    }

    /**
     * Sets has last.
     *
     * @param hasLast the has last
     */
    public void setHasLast(boolean hasLast) {
        this.hasLast = hasLast;
    }

    @Override
    public String toString() {
        return "Page [pageNow=" + pageNow + ", pageSize=" + pageSize + ", totalCount=" + totalCount
                + ", totalPageCount=" + totalPageCount + ", startPos=" + startPos + ", hasFirst=" + hasFirst
                + ", hasPre=" + hasPre + ", hasNext=" + hasNext + ", hasLast=" + hasLast + "]";
    }

}
