package com.qgzx.dto;

/**
 * 统一的数据格式
 * ClassName: Result <br/>
 * Function: TODO ADD FUNCTION. <br/>
 * Reason: TODO ADD REASON(可选). <br/>
 * date: 2017年5月28日 上午11:02:18 <br/>
 *
 * @param <T> the type parameter
 * @author huangting
 * @since JDK 1.8
 */
public class Result<T> {

	/**
	 * 请求是否成功的标识
	 */
	private boolean success;
	
	/**
	 * 返回的提示信息
	 */
	private String message;
	
	/**
	 * 数据
	 */
	private T data;

    /**
     * 无参构造器
     * Creates a new instance of Result.
     */
    public Result() {
		super();
	}

    /**
     * 含有所有属性的构造器
     * Creates a new instance of Result.
     *
     * @param success the success
     * @param message the message
     * @param data    the data
     */
    public Result(boolean success, String message, T data) {
		super();
		this.success = success;
		this.message = message;
		this.data = data;
	}

    /**
     * Is success boolean.
     *
     * @return the boolean
     */
    public boolean isSuccess() {
		return success;
	}

    /**
     * Sets success.
     *
     * @param success the success
     */
    public void setSuccess(boolean success) {
		this.success = success;
	}

    /**
     * Gets message.
     *
     * @return the message
     */
    public String getMessage() {
		return message;
	}

    /**
     * Sets message.
     *
     * @param message the message
     */
    public void setMessage(String message) {
		this.message = message;
	}

    /**
     * Gets data.
     *
     * @return the data
     */
    public T getData() {
		return data;
	}

    /**
     * Sets data.
     *
     * @param data the data
     */
    public void setData(T data) {
		this.data = data;
	}
	
	
}
