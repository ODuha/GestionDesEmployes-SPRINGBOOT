package com.employes.gestion.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;


@Entity
@Table(name = "employe")
public class Employe {
	    @Id
	    @GeneratedValue    
	    private int id;
	    private String fullName;
	    private String email;
	    private String gender;
	    private String job;
	    private String phone;
		public Employe(String fullName, String email, String gender, String job, String phone) {
			super();
			this.fullName = fullName;
			this.email = email;
			this.gender = gender;
			this.job = job;
			this.phone = phone;
		}
		
		
		public Employe() {
			super();
			// TODO Auto-generated constructor stub
		}


		public int getId() {
			return id;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getFullName() {
			return fullName;
		}
		public void setFullName(String fullName) {
			this.fullName = fullName;
		}
		public String getEmail() {
			return email;
		}
		public void setEmail(String email) {
			this.email = email;
		}
		public String getGender() {
			return gender;
		}
		public void setGender(String gender) {
			this.gender = gender;
		}
		public String getJob() {
			return job;
		}
		public void setJob(String job) {
			this.job = job;
		}
		public String getPhone() {
			return phone;
		}
		public void setPhone(String phone) {
			this.phone = phone;
		}



	
}
