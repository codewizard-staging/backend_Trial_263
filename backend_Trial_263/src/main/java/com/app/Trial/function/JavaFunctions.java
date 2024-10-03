package com.app.Trial.function;

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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.Trial.repository.FundingRoundRepository;
import com.app.Trial.repository.StageRepository;
import com.app.Trial.repository.DocumentRepository;
import com.app.Trial.repository.InvestorRepository;
import com.app.Trial.repository.FounderRepository;
import com.app.Trial.repository.StartupRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
