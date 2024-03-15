package model;

import java.time.LocalDate;
import java.time.LocalDateTime;

public class Request {
	 private int id;
	 private User user;
	 private String description ;
	 private String justification; 
	 private LocalDate dateNeeded; 
	 private String deliveryMode;
	 private String status; 
	 private double total; 
	 private LocalDateTime submittedDate; 
	 private String reasonForRejection;
	
	 
	 public Request() {
		
	}


	public Request(int id, User user, String description, String justification, LocalDate dateNeeded,
			String deliveryMode, String status, double total, LocalDateTime submittedDate, String reasonForRejection) {
		super();
		this.id = id;
		this.user = user;
		this.description = description;
		this.justification = justification;
		this.dateNeeded = dateNeeded;
		this.deliveryMode = deliveryMode;
		this.status = status;
		this.total = total;
		this.submittedDate = submittedDate;
		this.reasonForRejection = reasonForRejection;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		id = id;
	}


	public User getUser() {
		return user;
	}


	public void setUser(User user) {
		this.user = user;
	}


	public String getDescription() {
		return description;
	}


	public void setDescription(String description) {
		description = description;
	}


	public String getJustification() {
		return justification;
	}


	public void setJustification(String justification) {
		justification = justification;
	}


	public LocalDate getDateNeeded() {
		return dateNeeded;
	}


	public void setDateNeeded(LocalDateTime dateNeeded) {
		dateNeeded = dateNeeded;
	}


	public String getDeliveryMode() {
		return deliveryMode;
	}


	public void setDeliveryMode(String deliveryMode) {
		deliveryMode = deliveryMode;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		status = status;
	}


	public double getTotal() {
		return total;
	}


	public void setTotal(double total) {
		total = total;
	}


	public LocalDateTime getSubmittedDate() {
		return submittedDate;
	}


	public void setSubmittedDate(LocalDateTime submittedDate) {
		submittedDate = submittedDate;
	}


	public String getReasonForRejection() {
		return reasonForRejection;
	}


	public void setReasonForRejection(String reasonForRejection) {
		reasonForRejection = reasonForRejection;
	}


	@Override
	public String toString() {
		return "Request [id=" + id + ", userId=" + user + ", description=" + description + ", justification="
				+ justification + ", dateNeeded=" + dateNeeded + ", deliveryMode=" + deliveryMode + ", status=" + status
				+ ", total=" + total + ", submittedDate=" + submittedDate + ", reasonForRejection=" + reasonForRejection
				+ "]";
	} 

     
     

    

     

     
     

     

    


     


     
    

     
}
