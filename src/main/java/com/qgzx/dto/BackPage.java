package com.qgzx.dto;

/**
 * The type Back page.
 */
public class BackPage {
	private int pageNow;
	private int totalPageCount;

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
     * Gets total page count.
     *
     * @return the total page count
     */
    public int getTotalPageCount() {
		return totalPageCount;
	}

    /**
     * Sets total page count.
     *
     * @param totalPageCount the total page count
     */
    public void setTotalPageCount(int totalPageCount) {
		this.totalPageCount = totalPageCount;
	}

	@Override
	public String toString() {
		return "BackPage [pageNow=" + pageNow + ", totalPageCount=" + totalPageCount + "]";
	}

}
