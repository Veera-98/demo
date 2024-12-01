package com.task.demo.model;

import java.time.LocalDateTime;



import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotBlank;




@Entity
@Table(name = "request")
public class Request {
	
	 @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    @JsonProperty("request_id")
	    @Column(name = "request_id", nullable = false)
	    private Long requestId;

	    @NotBlank(message = "Network is mandatory")
	    @JsonProperty("network")
	    @Column(name = "network")
	    private String network;

	    @JsonProperty("sub_network")
	    @Column(name = "sub_network")
	    private String subNetwork;

	    @JsonProperty("activity_category")
	    @Column(name = "activity_category")
	    private String activityCategory;

	    @JsonProperty("activity_type")
	    @Column(name = "activity_type")
	    private String activityType;

	    @JsonProperty("title")
	    @Column(name = "title")
	    private String title;

	    @JsonProperty("description")
	    @Column(name = "description")
	    private String description;

	    @JsonProperty("status")
	    @Column(name = "status")
	    private String status;

	    @JsonProperty("create_date")
	    @Column(name = "create_date")
	    private LocalDateTime createDate;

	    @JsonProperty("modified_date")
	    @Column(name = "modified_date")
	    private LocalDateTime modifiedDate;

	    @JsonProperty("created_by")
	    @Column(name = "created_by")
	    private String createdBy;

	    @JsonProperty("modified_by")
	    @Column(name = "modified_by")
	    private String modifiedBy;

		public Long getRequestId() {
			return requestId;
		}

		public void setRequestId(Long requestId) {
			this.requestId = requestId;
		}

		public String getNetwork() {
			return network;
		}

		public void setNetwork(String network) {
			this.network = network;
		}

		public String getSubNetwork() {
			return subNetwork;
		}

		public void setSubNetwork(String subNetwork) {
			this.subNetwork = subNetwork;
		}

		public String getActivityCategory() {
			return activityCategory;
		}

		public void setActivityCategory(String activityCategory) {
			this.activityCategory = activityCategory;
		}

		public String getActivityType() {
			return activityType;
		}

		public void setActivityType(String activityType) {
			this.activityType = activityType;
		}

		public String getTitle() {
			return title;
		}

		public void setTitle(String title) {
			this.title = title;
		}

		public String getDescription() {
			return description;
		}

		public void setDescription(String description) {
			this.description = description;
		}

		public String getStatus() {
			return status;
		}

		public void setStatus(String status) {
			this.status = status;
		}

		public LocalDateTime getCreateDate() {
			return createDate;
		}

		public void setCreateDate(LocalDateTime createDate) {
			this.createDate = createDate;
		}

		public LocalDateTime getModifiedDate() {
			return modifiedDate;
		}

		public void setModifiedDate(LocalDateTime modifiedDate) {
			this.modifiedDate = modifiedDate;
		}

		public String getCreatedBy() {
			return createdBy;
		}

		public void setCreatedBy(String createdBy) {
			this.createdBy = createdBy;
		}

		public String getModifiedBy() {
			return modifiedBy;
		}

		public void setModifiedBy(String modifiedBy) {
			this.modifiedBy = modifiedBy;
		}
	    
	    
	    

}