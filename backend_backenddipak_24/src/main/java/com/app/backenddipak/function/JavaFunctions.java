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
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmFunction;
import com.sap.olingo.jpa.metadata.core.edm.annotation.EdmParameter;
import com.sap.olingo.jpa.metadata.core.edm.mapper.extension.ODataFunction;
import com.app.backenddipak.repository.OrganizationRepository;
import com.app.backenddipak.repository.EmployeePersonalInfoRepository;
import com.app.backenddipak.repository.EmlpoyeeProfileRepository;
import org.springframework.stereotype.Component;

import javax.persistence.EntityManager;
import java.util.ArrayList;
import java.util.List;

@Component
public class JavaFunctions implements ODataFunction {


    
    
}
   
