package com.meadote.pets.comments;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

@JsonIgnoreProperties(ignoreUnknown = true)
public class Comment {

	
	private long id;
	private long petId;
	private long ownerId;
	private String comment;
	private long posted;
	
	public Comment(long id, long petId, long ownerId, String comment) {
		this();
		this.id = id;
		this.petId = petId;
		this.ownerId = ownerId;
		this.comment = comment;
	}

	public Comment() {
		
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getPetId() {
		return petId;
	}

	public void setPetId(long petId) {
		this.petId = petId;
	}

	public long getOwnerId() {
		return ownerId;
	}

	public void setOwnerId(long ownerId) {
		this.ownerId = ownerId;
	}

	public String getComment() {
		return comment;
	}

	public void setComment(String comment) {
		this.comment = comment;
	}

	public long getPosted() {
		return posted;
	}

	public void setPosted(long posted) {
		this.posted = posted;
	}
	
	
	
}
