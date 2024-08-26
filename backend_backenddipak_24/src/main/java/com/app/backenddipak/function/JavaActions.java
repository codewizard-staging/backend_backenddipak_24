package com.app.backenddipak.function;

import com.app.backenddipak.model.Organization;
import com.app.backenddipak.model.EmployeePersonalInfo;
import com.app.backenddipak.model.EmlpoyeeProfile;




import com.app.backenddipak.enums.EmploymentType;
import com.app.backenddipak.enums.OrgDept;
import com.app.backenddipak.enums.OrgBranch;
import com.app.backenddipak.converter.OrgBranchConverter;
import com.app.backenddipak.converter.EmploymentTypeConverter;
import com.app.backenddipak.converter.OrgDeptConverter;
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
  