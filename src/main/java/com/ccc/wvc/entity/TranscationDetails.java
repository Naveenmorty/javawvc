package com.ccc.wvc.entity;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EntityListeners;
import javax.persistence.Table;

import org.springframework.data.jpa.domain.support.AuditingEntityListener;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "transcationdetail")
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EntityListeners(AuditingEntityListener.class)
public class TranscationDetails extends BaseEntity {
	
	@Column(name = "donor_id")
	private Long donorId;
	
	@Column(name = "fundraiser_id")
	private Long fundRaiserId;
	
	@Column(name = "campaign_id")
	private Long campaignId;
	
	@Column(name = "activity_id")
	private Long activityId;
	
	@Column(name = "amount")
	private BigDecimal amount;
	
	@Column(name = "stripe_id")
	private String referenceNumber;
	
	@Column(name = "payment_status")
	private Boolean paymentStatus;

}
