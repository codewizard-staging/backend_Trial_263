package com.app.Trial.model.jointable;

import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmIgnore;
import lombok.Data;
import javax.persistence.*;

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

@Entity(name = "StartupFounders")
@Table(schema = "\"trial_801\"", name = "\"StartupFounders\"")
@Data
public class StartupFounders{

 	@Id
    @Column(name = "\"Id\"")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
	
	@Column(name = "\"SId\"")
	private Integer sId;

    
    @Column(name = "\"FId\"")
    private Integer fId;
 
}