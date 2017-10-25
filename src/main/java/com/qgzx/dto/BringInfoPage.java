package com.qgzx.dto;

import java.util.List;

import com.qgzx.entity.BringInfo;

/**
 * The type Bring info page.
 */
public class BringInfoPage {
	private List<BringInfo> list;
	private BackPage backPage;

    /**
     * Gets list.
     *
     * @return the list
     */
    public List<BringInfo> getList() {
		return list;
	}

    /**
     * Sets list.
     *
     * @param list the list
     */
    public void setList(List<BringInfo> list) {
		this.list = list;
	}

    /**
     * Gets back page.
     *
     * @return the back page
     */
    public BackPage getBackPage() {
		return backPage;
	}

    /**
     * Sets back page.
     *
     * @param backPage the back page
     */
    public void setBackPage(BackPage backPage) {
		this.backPage = backPage;
	}
    
}
