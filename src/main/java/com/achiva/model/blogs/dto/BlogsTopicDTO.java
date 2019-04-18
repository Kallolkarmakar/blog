package com.achiva.model.blogs.dto;
// Generated Dec 13, 2017 6:59:07 AM by Hibernate Tools 5.1.0.Alpha1

import java.util.Date;

public class BlogsTopicDTO implements java.io.Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = -2770364667572372896L;

	private Integer id;

	private String url;

	private String createdBy;

	private Date createdOn;

	private Integer noOfVisit;

	private String updatedBy;

	private Date updatedOn;

	private String active;

	private String blogsContains;

	private int displayRanking;

	private String createdByMoblieNo;

	private String createdByEmailId;

	private String createdByFBId;

	private String createdByGoogleId;

	public Integer getId() {
		return this.id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getUrl() {
		return this.url;
	}

	public void setUrl(String url) {
		this.url = url;
	}

	public String getBlogsContains() {
		return this.blogsContains;
	}

	public void setBlogsContains(String blogsContains) {
		this.blogsContains = blogsContains;
	}

	public String getCreatedBy() {
		return this.createdBy;
	}

	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}

	public Date getCreatedOn() {
		return this.createdOn;
	}

	public void setCreatedOn(Date createdOn) {
		this.createdOn = createdOn;
	}

	public Integer getNoOfVisit() {
		return this.noOfVisit;
	}

	public void setNoOfVisit(Integer noOfVisit) {
		this.noOfVisit = noOfVisit;
	}

	public String getUpdatedBy() {
		return this.updatedBy;
	}

	public void setUpdatedBy(String updatedBy) {
		this.updatedBy = updatedBy;
	}

	public Date getUpdatedOn() {
		return this.updatedOn;
	}

	public void setUpdatedOn(Date updatedOn) {
		this.updatedOn = updatedOn;
	}

	public String getActive() {
		return this.active;
	}

	public void setActive(String active) {
		this.active = active;
	}

	/**
	 * @return the displayRanking
	 */
	public int getDisplayRanking() {
		return displayRanking;
	}

	/**
	 * @param displayRanking
	 *            the displayRanking to set
	 */
	public void setDisplayRanking(int displayRanking) {
		this.displayRanking = displayRanking;
	}

	/**
	 * @return the createdByMoblieNo
	 */
	public String getCreatedByMoblieNo() {
		return createdByMoblieNo;
	}

	/**
	 * @param createdByMoblieNo
	 *            the createdByMoblieNo to set
	 */
	public void setCreatedByMoblieNo(String createdByMoblieNo) {
		this.createdByMoblieNo = createdByMoblieNo;
	}

	/**
	 * @return the createdByEmailId
	 */
	public String getCreatedByEmailId() {
		return createdByEmailId;
	}

	/**
	 * @param createdByEmailId
	 *            the createdByEmailId to set
	 */
	public void setCreatedByEmailId(String createdByEmailId) {
		this.createdByEmailId = createdByEmailId;
	}

	/**
	 * @return the createdByFBId
	 */
	public String getCreatedByFBId() {
		return createdByFBId;
	}

	/**
	 * @param createdByFBId
	 *            the createdByFBId to set
	 */
	public void setCreatedByFBId(String createdByFBId) {
		this.createdByFBId = createdByFBId;
	}

	/**
	 * @return the createdByGoogleId
	 */
	public String getCreatedByGoogleId() {
		return createdByGoogleId;
	}

	/**
	 * @param createdByGoogleId
	 *            the createdByGoogleId to set
	 */
	public void setCreatedByGoogleId(String createdByGoogleId) {
		this.createdByGoogleId = createdByGoogleId;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see java.lang.Object#toString()
	 */
	@Override
	public String toString() {
		return "BlogsTopic [id=" + id + ", url=" + url + ", createdBy=" + createdBy + ", createdOn=" + createdOn + ", noOfVisit=" + noOfVisit + ", updatedBy="
				+ updatedBy + ", updatedOn=" + updatedOn + ", active=" + active + ", blogsContains=" + blogsContains + "]";

	}

}
