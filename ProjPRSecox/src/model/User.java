package model;

import java.util.List;

public class User {
	
			private int id;
	        private String username; 
	        private String password; 
	        private String firstname; 
	        private String lastname; 
	        private String phone; 
	        private String email; 
	        private boolean reviewer; 
	        private boolean admin; 
	       
			
	        
	        public User() {
				
			}


			public User(int id, String username, String password, String firstname, String lastname, String phone,
					String email, boolean reviewer, boolean admin) {
				super();
				this.id = id;
				this.username = username;
				this.password = password;
				this.firstname = firstname;
				this.lastname = lastname;
				this.phone = phone;
				this.email = email;
				this.reviewer = reviewer;
				this.admin = admin;
			
			}


			public int getId() {
				return id;
			}


			public void setId(int id) {
				id = id;
			}


			public String getUsername() {
				return username;
			}


			public void setUsername(String username) {
				username = username;
			}


			public String getPassword() {
				return password;
			}


			public void setPassword(String password) {
				password = password;
			}


			public String getFirstname() {
				return firstname;
			}


			public void setFirstname(String firstname) {
				firstname = firstname;
			}


			public String getLastname() {
				return lastname;
			}


			public void setLastname(String lastName) {
				lastname = lastname;
			}


			public String getPhone() {
				return phone;
			}


			public void setPhone(String phone) {
				phone = phone;
			}


			public String getEmail() {
				return email;
			}


			public void setEmail(String email) {
				email = email;
			}


			public boolean isReviewer() {
				return reviewer;
			}


			public void setReviewer(boolean reviewer) {
				reviewer = reviewer;
			}


			public boolean isAdmin() {
				return admin;
			}


			public void setAdmin(boolean admin) {
				admin = admin;
			}


			@Override
			public String toString() {
				return "User [id=" + id + ", username=" + username + ", password=" + password + ", firstname="
						+ firstname + ", lastname=" + lastname + ", phone=" + phone + ", email=" + email + ", reviewer="
						+ reviewer + ", admin=" + admin + "]";
			}



	       

	        

	       

	       

	        

	        

	       

	        

}
