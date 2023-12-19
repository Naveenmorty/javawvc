/*package com.ccc.wvc.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;



@Entity
@Table(name = "adminuser")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EntityListeners(AuditingEntityListener.class)
public class AdminUser extends BaseEntity {
	
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
//	@Column(name = "user_name")
//	private String userName;
	
//	@Column(name = "password")
//	private String password;
	
//	@Column(name = "phone_number")
//	private String phoneNumber;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "is_active")
	private Boolean isActive;
	
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	 @JoinTable(name = "admin_user_role",
	            joinColumns = {@JoinColumn(name = "aduser_id" , referencedColumnName = "id")},
	            inverseJoinColumns = {@JoinColumn(name = "role_id" , referencedColumnName = "id")})
	 private List<Role> roles = new ArrayList<>();
	

}
*/