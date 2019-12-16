package com.example.model;

public class ClientTransPO extends AbstractPO {

	/**
	 * 
	 */
	private static final long serialVersionUID = 5040552297816726465L;

	private Long transId; //主键
	
	private String transCode; //业务唯一标识（请求方交易号）
	
	private String tradeId; //请求流水号（统一接入流水号）
	
	private String suppTradeId; //发送给渠道的流水号
	
	private String reqClientCode; //商户代码
	
	private String reqClientChannel; //商户渠道代码
	
	private String reqType; //请求类型
	
	private String reqBusType; //请求业务类型
	
	private String reqFormat; //请求报文格式
	
	private String reqMsg;	//请求报文
	
	private String respFormat; //返回报文格式
	
	private String respMsg; //返回报文
	
	private String returnStatus; //交易状态
	
	private String returnValue; //返回信息

	/**
	 * @return the transId
	 */
	public Long getTransId() {
		return transId;
	}

	/**
	 * @param transId the transId to set
	 */
	public void setTransId(Long transId) {
		this.transId = transId;
	}

	/**
	 * @return the transCode
	 */
	public String getTransCode() {
		return transCode;
	}

	/**
	 * @param transCode the transCode to set
	 */
	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	/**
	 * @return the tradeId
	 */
	public String getTradeId() {
		return tradeId;
	}

	/**
	 * @param tradeId the tradeId to set
	 */
	public void setTradeId(String tradeId) {
		this.tradeId = tradeId;
	}

	/**
	 * @return the suppTradeId
	 */
	public String getSuppTradeId() {
		return suppTradeId;
	}

	/**
	 * @param suppTradeId the suppTradeId to set
	 */
	public void setSuppTradeId(String suppTradeId) {
		this.suppTradeId = suppTradeId;
	}

	/**
	 * @return the reqClientCode
	 */
	public String getReqClientCode() {
		return reqClientCode;
	}

	/**
	 * @param reqClientCode the reqClientCode to set
	 */
	public void setReqClientCode(String reqClientCode) {
		this.reqClientCode = reqClientCode;
	}

	/**
	 * @return the reqClientChannel
	 */
	public String getReqClientChannel() {
		return reqClientChannel;
	}

	/**
	 * @param reqClientChannel the reqClientChannel to set
	 */
	public void setReqClientChannel(String reqClientChannel) {
		this.reqClientChannel = reqClientChannel;
	}

	/**
	 * @return the reqType
	 */
	public String getReqType() {
		return reqType;
	}

	/**
	 * @param reqType the reqType to set
	 */
	public void setReqType(String reqType) {
		this.reqType = reqType;
	}

	/**
	 * @return the reqBusType
	 */
	public String getReqBusType() {
		return reqBusType;
	}

	/**
	 * @param reqBusType the reqBusType to set
	 */
	public void setReqBusType(String reqBusType) {
		this.reqBusType = reqBusType;
	}

	/**
	 * @return the reqFormat
	 */
	public String getReqFormat() {
		return reqFormat;
	}

	/**
	 * @param reqFormat the reqFormat to set
	 */
	public void setReqFormat(String reqFormat) {
		this.reqFormat = reqFormat;
	}

	/**
	 * @return the reqMsg
	 */
	public String getReqMsg() {
		return reqMsg;
	}

	/**
	 * @param reqMsg the reqMsg to set
	 */
	public void setReqMsg(String reqMsg) {
		this.reqMsg = reqMsg;
	}

	/**
	 * @return the respFormat
	 */
	public String getRespFormat() {
		return respFormat;
	}

	/**
	 * @param respFormat the respFormat to set
	 */
	public void setRespFormat(String respFormat) {
		this.respFormat = respFormat;
	}

	/**
	 * @return the respMsg
	 */
	public String getRespMsg() {
		return respMsg;
	}

	/**
	 * @param respMsg the respMsg to set
	 */
	public void setRespMsg(String respMsg) {
		this.respMsg = respMsg;
	}

	/**
	 * @return the returnStatus
	 */
	public String getReturnStatus() {
		return returnStatus;
	}

	/**
	 * @param returnStatus the returnStatus to set
	 */
	public void setReturnStatus(String returnStatus) {
		this.returnStatus = returnStatus;
	}

	/**
	 * @return the returnValue
	 */
	public String getReturnValue() {
		return returnValue;
	}

	/**
	 * @param returnValue the returnValue to set
	 */
	public void setReturnValue(String returnValue) {
		this.returnValue = returnValue;
	}
}