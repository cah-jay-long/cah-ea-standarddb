package com.cah.eit.ea.app.standarddb.types;

import java.util.ArrayList;
import java.util.List;

public enum Level3Enum {

	USER_DEVICES( Level2Enum.ACCESS_COMPONENTS ),
	IOT_DEVICES( Level2Enum.ACCESS_COMPONENTS ),
	
	APPLICATION_PLATFORM( Level2Enum.APPLICATION_COMPONENT),
	DATA_PLATFORM( Level2Enum.APPLICATION_COMPONENT ),
	MIDDLEWARE_INTEGRATION( Level2Enum.APPLICATION_COMPONENT ),
	
	SYSTEMS_MANAGEMENT( Level2Enum.MANAGEMNENT_COMPONENT ),
	DEVELOPMENT_TOOLS( Level2Enum.MANAGEMNENT_COMPONENT ),
	
	SAAS( Level2Enum.SERVICES_COMPONENT  ),
	PAAS( Level2Enum.SERVICES_COMPONENT  ),
	FAAS( Level2Enum.SERVICES_COMPONENT  ),
	CAAS( Level2Enum.SERVICES_COMPONENT  ),
	IAAS( Level2Enum.SERVICES_COMPONENT  ),
	
	COMPUTE( Level2Enum.INFRASTRUCTURE_COMPONENT ),
	STORAGE( Level2Enum.INFRASTRUCTURE_COMPONENT ),
	NETWORK( Level2Enum.INFRASTRUCTURE_COMPONENT ),
	FACILITIES( Level2Enum.INFRASTRUCTURE_COMPONENT )	
	;
	
    private Level2Enum parent = null;

    private Level3Enum(Level2Enum level1 ) {
        this.parent = level1 ;
    }		
	
	public Level2Enum parent() {
		return this.parent;
	}
}
