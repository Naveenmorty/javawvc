package com.ccc.wvc.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.FetchType;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@Entity
@Table(name = "activity")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EntityListeners(AuditingEntityListener.class)
public class Activity extends BaseEntity {

	@Column(name = "activity_name")
	private String activityName;
	
	@Column(name = "status")
	private Boolean status;
	
	@ManyToOne(fetch = FetchType.LAZY)
	private Campaign campaign;
	
	
//	@ManyToOne(fetch = FetchType.LAZY)
//    private Customer customer;
	
	
	
	
}
