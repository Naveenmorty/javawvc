package com.ccc.wvc.entity;

import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "campaign")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EntityListeners(AuditingEntityListener.class)
public class Campaign extends BaseEntity{
	
	@Column(name = "campaign_name")
	private String title;
	
	@Column(name = "start_date")
	private Timestamp startDate;
	
	@Column(name = "end_date")
	private Timestamp endDate;
	
	@Column(name = "status")
	private Boolean status;
	
	@Column(name = "motivation_code")
	private String motivationCode;
	
	@Column(name = "designation_code")
	private String designationCode;
	
	@Column(name = "goal_amount")
	private String goalAmount;
	
	@OneToMany(mappedBy = "campaign",cascade = CascadeType.ALL)
	//private Set<Activity> activity = new HashSet<>();
	private List<Activity> activity = new ArrayList();
	
	
	 public void addActivity(Activity act){
		 activity.add(act);
		 act.setCampaign(this);
		 
	 }
	
	 @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	 @JoinTable(name = "fundraiser_campaign",
	            joinColumns = {@JoinColumn(name = "campaign_id" , referencedColumnName = "id")},
	            inverseJoinColumns = {@JoinColumn(name = "fundraiser_id" , referencedColumnName = "id")})
	 private List<FundRaiser> fundraiser = new ArrayList<>();
	 
//	 @OneToMany(mappedBy = "customer", cascade = CascadeType.ALL)
//	 private List<CustomerAccessHistory> accessHist = new ArrayList<>();

//	 public void addAccessHist(CustomerAccessHistory hist){
//		 accessHist.add(hist);
//		 hist.setCustomer(this);
//	 }
}
