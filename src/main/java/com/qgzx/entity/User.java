package com.qgzx.entity;


/**
 * The type User.
 */
public class User {
    //
	private String id;
	private String password;
	private String userName;
	private String qq;
	private String phoneNumber;

    /**
     * Gets id.
     *
     * @return the id
     */
    public String getId() {
		return id;
	}

    /**
     * Sets id.
     *
     * @param id the id
     */
    public void setId(String id) {
		this.id = id;
	}

    /**
     * Gets password.
     *
     * @return the password
     */
    public String getPassword() {
		return password;
	}

    /**
     * Sets password.
     *
     * @param password the password
     */
    public void setPassword(String password) {
		this.password = password;
	}

    /**
     * Gets user name.
     *
     * @return the user name
     */
    public String getUserName() {
		return userName;
	}

    /**
     * Sets user name.
     *
     * @param userName the user name
     */
    public void setUserName(String userName) {
		this.userName = userName;
	}

    /**
     * Gets qq.
     *
     * @return the qq
     */
    public String getQq() {
		return qq;
	}

    /**
     * Sets qq.
     *
     * @param qq the qq
     */
    public void setQq(String qq) {
		this.qq = qq;
	}

    /**
     * Gets phone number.
     *
     * @return the phone number
     */
    public String getPhoneNumber() {
		return phoneNumber;
	}

    /**
     * Sets phone number.
     *
     * @param phoneNumber the phone number
     */
    public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	@Override
	public String toString() {
		return "User [id=" + id + ", password=" + password + ", userName=" + userName + ", qq=" + qq + ", phoneNumber="
				+ phoneNumber + "]";
	}
}
