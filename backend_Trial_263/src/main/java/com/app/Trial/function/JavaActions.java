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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmAction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataAction;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;

import javax.persistence.EntityManager;
import javax.persistence.EntityTransaction;
import javax.transaction.Transactional;

@Component
public class JavaActions implements ODataAction {
    private final EntityManager entityManager;

    public JavaActions(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

	
	
}
  