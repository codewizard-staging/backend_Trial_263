package com.app.Trial.model;


import lombok.Data;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;


 
import com.app.Trial.model.Stage;
import com.app.Trial.model.Startup;
import com.app.Trial.model.FundingRound;
import com.app.Trial.model.Founder;
import com.app.Trial.model.Document;
import com.app.Trial.model.Investor;
import com.app.Trial.enums.RoundStatus;
import com.app.Trial.enums.StageName;
import com.app.Trial.converter.StageNameConverter;
import com.app.Trial.converter.RoundStatusConverter;
import com.app.Trial.converter.DurationConverter;
import com.app.Trial.converter.UUIDToByteConverter;
import com.app.Trial.converter.UUIDToStringConverter;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import lombok.Data;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.time.Duration;
import java.util.Date;
import java.sql.Timestamp;
import java.sql.Time;
import java.util.List;
import java.util.Objects;

import javax.persistence.AttributeOverride;
import javax.persistence.AttributeOverrides;
import javax.persistence.CascadeType;
import javax.persistence.CollectionTable;
import javax.persistence.Column;
import javax.persistence.Convert;
import javax.persistence.DiscriminatorValue;
import javax.persistence.ElementCollection;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.FetchType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.persistence.Lob;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmMediaStream;

@Entity(name = "Startup")
@Table(name = "\"Startup\"", schema =  "\"trial_801\"")
@Data
                        
public class Startup {
	public Startup () {   
  }
	  
  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  @Column(name = "\"SId\"", nullable = true )
  private Integer sId;
	  
  @Column(name = "\"Name\"", nullable = true )
  private String name;
  
	  
  @Column(name = "\"Industry\"", nullable = true )
  private String industry;
  
	  
  @Column(name = "\"FoundingDate\"", nullable = true )
  @Temporal(value = TemporalType.DATE)
  private Date foundingDate;  
  
	  
  @Column(name = "\"FundingReceived\"", nullable = true )
  private Double fundingReceived;
  
	  
  @Column(name = "\"ContactNumber\"", nullable = true )
  private String contactNumber;
  
	  
  @Column(name = "\"Valuation\"", nullable = true )
  private Double valuation;
  
	  
	
@Column(name = "\"KeyMetrics\"")
    @ElementCollection(fetch = FetchType.LAZY)
    @CollectionTable(schema = "\"trial_801\"", name = "\"StartupKeyMetrics\"",joinColumns = @JoinColumn(name = "\"SId\""))
    private List<String> keyMetrics = new ArrayList<>();
  
  
  
	
	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "\"StartupCurrentStage\"", referencedColumnName = "\"StageId\"", insertable = false, updatable = false)
	private Stage currentStage;
	
	@Column(name = "\"StartupCurrentStage\"")
	private Integer startupCurrentStage;

	@OneToOne(cascade = CascadeType.PERSIST)
	@JoinColumn(name = "\"StartupLogo\"", referencedColumnName = "\"DocId\"", insertable = false, updatable = false)
	private Document logo;
	
	@Column(name = "\"StartupLogo\"")
	private Integer startupLogo;
   
	
@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"StartupFounders\"",
            joinColumns = @JoinColumn( name="\"SId\""),
            inverseJoinColumns = @JoinColumn( name="\"FId\""), schema = "\"trial_801\"")
private List<Founder> founders = new ArrayList<>();


@OneToMany(fetch = FetchType.LAZY, cascade = {CascadeType.PERSIST, CascadeType.REMOVE, CascadeType.MERGE})
@JoinTable(
            name="\"StartupPreviousRounds\"",
            joinColumns = @JoinColumn( name="\"SId\""),
            inverseJoinColumns = @JoinColumn( name="\"RoundId\""), schema = "\"trial_801\"")
private List<FundingRound> previousRounds = new ArrayList<>();
  
  
  
  
  
  
  
  
  
  @Override
  public String toString() {
	return "Startup [" 
  + "SId= " + sId  + ", " 
  + "Name= " + name  + ", " 
  + "Industry= " + industry  + ", " 
  + "FoundingDate= " + foundingDate  + ", " 
  + "FundingReceived= " + fundingReceived  + ", " 
  + "ContactNumber= " + contactNumber  + ", " 
  + "Valuation= " + valuation  + ", " 
  + "KeyMetrics= " + keyMetrics 
 + "]";
	}
	
}