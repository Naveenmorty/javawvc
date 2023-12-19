package com.ccc.wvc.entity;

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
@Table(name = "fundraiser")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EntityListeners(AuditingEntityListener.class)
public class FundRaiser extends BaseEntity {
	
	
	@Column(name = "fundraiser_id")
	private String fundRaiserID;
	
	@Column(name = "first_name")
	private String firstName;
	
	@Column(name = "last_name")
	private String lastName;
	
	@Column(name = "phone_number")
	private String phoneNumber;
	
	@Column(name = "email")
	private String email;
	
	@Column(name = "status")
	private Boolean status;
	
//	@Column(name = "is_otpverified")
//	private Boolean isOtpVerified;
	
//	@Column(name = "accounttype")
//	private String accountType;
	
	@ManyToMany(mappedBy = "fundraiser")
	private List<Campaign> campaign = new ArrayList<>();
	
	 @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	 @JoinTable(name = "fundraiser_donor",
	            joinColumns = {@JoinColumn(name = "fundraiser_id" , referencedColumnName = "id")},
	            inverseJoinColumns = {@JoinColumn(name = "donor_id" , referencedColumnName = "id")})
	 private List<Donor> donor = new ArrayList<>();
	
	
	
}
