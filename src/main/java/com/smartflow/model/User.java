package com.smartflow.model;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
/**
 * 用户表
 * @author admin
 *
 */
@Entity
@Table(name="core.[User]")
public class User {
	private Integer Id;
	private String UserName;
	private String Password;
	private Integer PlatformId;
	private String EmailAddress;
	private String Phone;
	private Date CreationDateTime;
	private Integer CreatorId;
	private Date EditDateTime;
	private Integer EditorId;
	private Integer State;
	private Date LastLoginTime;
	private String Account;
	private String UserCode;
	@Id
	@GeneratedValue
	public Integer getId() {
		return Id;
	}
	public void setId(Integer id) {
		Id = id;
	}
	public String getUserName() {
		return UserName;
	}
	public void setUserName(String userName) {
		UserName = userName;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
	public Integer getPlatformId() {
		return PlatformId;
	}
	public void setPlatformId(Integer platformId) {
		PlatformId = platformId;
	}
	public String getEmailAddress() {
		return EmailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		EmailAddress = emailAddress;
	}
	public String getPhone() {
		return Phone;
	}
	public void setPhone(String phone) {
		Phone = phone;
	}
	public Date getCreationDateTime() {
		return CreationDateTime;
	}
	public void setCreationDateTime(Date creationDateTime) {
		CreationDateTime = creationDateTime;
	}
	public Integer getCreatorId() {
		return CreatorId;
	}
	public void setCreatorId(Integer creatorId) {
		CreatorId = creatorId;
	}
	public Date getEditDateTime() {
		return EditDateTime;
	}
	public void setEditDateTime(Date editDateTime) {
		EditDateTime = editDateTime;
	}
	public Integer getEditorId() {
		return EditorId;
	}
	public void setEditorId(Integer editorId) {
		EditorId = editorId;
	}
	public Integer getState() {
		return State;
	}
	public void setState(Integer state) {
		State = state;
	}
	public Date getLastLoginTime() {
		return LastLoginTime;
	}
	public void setLastLoginTime(Date lastLoginTime) {
		LastLoginTime = lastLoginTime;
	}
	public String getAccount() {
		return Account;
	}
	public void setAccount(String account) {
		Account = account;
	}
	public String getUserCode() {
		return UserCode;
	}
	public void setUserCode(String userCode) {
		UserCode = userCode;
	}
	
	public User() {
		
	}
	public User(Integer id, String userName, String password, Integer platformId, String emailAddress, String phone,
			Date creationDateTime, Integer state, Date lastLoginTime, String account) {
		Id = id;
		UserName = userName;
		Password = password;
		PlatformId = platformId;
		EmailAddress = emailAddress;
		Phone = phone;
		CreationDateTime = creationDateTime;
		State = state;
		LastLoginTime = lastLoginTime;
		Account = account;
	}
	@Override
	public String toString() {
		return "User [Id=" + Id + ", UserName=" + UserName + ", Password=" + Password + ", PlatformId=" + PlatformId
				+ ", EmailAddress=" + EmailAddress + ", Phone=" + Phone + ", CreationDateTime=" + CreationDateTime
				+ ", CreatorId=" + CreatorId + ", EditDateTime=" + EditDateTime + ", EditorId=" + EditorId + ", State="
				+ State + ", LastLoginTime=" + LastLoginTime + ", Account=" + Account + ", UserCode=" + UserCode + "]";
	}
	

	
}
