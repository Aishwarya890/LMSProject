package com.lms.entity;

import java.util.Date;

import jakarta.annotation.Generated;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class TablRecordedVideo {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String topic;
	private String subTopic;
	private String description;
	private String uploadVideo;
	private String Notes;
	private Date credtedAt;
	private Date updatedAt;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTopic() {
		return topic;
	}
	public void setTopic(String topic) {
		this.topic = topic;
	}
	public String getSubTopic() {
		return subTopic;
	}
	public void setSubTopic(String subTopic) {
		this.subTopic = subTopic;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getUploadVideo() {
		return uploadVideo;
	}
	public void setUploadVideo(String uploadVideo) {
		this.uploadVideo = uploadVideo;
	}
	public String getNotes() {
		return Notes;
	}
	public void setNotes(String notes) {
		Notes = notes;
	}
	public Date getCredtedAt() {
		return credtedAt;
	}
	public void setCredtedAt(Date credtedAt) {
		this.credtedAt = credtedAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public TablRecordedVideo(Long id, String topic, String subTopic, String description, String uploadVideo,
			String notes, Date credtedAt, Date updatedAt) {
		super();
		this.id = id;
		this.topic = topic;
		this.subTopic = subTopic;
		this.description = description;
		this.uploadVideo = uploadVideo;
		Notes = notes;
		this.credtedAt = credtedAt;
		this.updatedAt = updatedAt;
	}
	public TablRecordedVideo() {
		super();
	}
	
	
	
	

}
