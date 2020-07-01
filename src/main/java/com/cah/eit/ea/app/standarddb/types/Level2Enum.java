package com.cah.eit.ea.app.standarddb.types;

import java.util.ArrayList;
import java.util.List;

public enum Level2Enum {
	
	ACCESS_COMPONENTS( Level1Enum.TECHNICAL_ARCHITECTURE ),
	APPLICATION_COMPONENT( Level1Enum.TECHNICAL_ARCHITECTURE),
	INFRASTRUCTURE_COMPONENT( Level1Enum.TECHNICAL_ARCHITECTURE),
	MANAGEMNENT_COMPONENT( Level1Enum.TECHNICAL_ARCHITECTURE),
	SERVICES_COMPONENT( Level1Enum.TECHNICAL_ARCHITECTURE);

    private Level1Enum parent = null;
	private List<Level3Enum> children = new ArrayList<Level3Enum>();

    private Level2Enum(Level1Enum level1 ) {
        this.parent = level1 ;
    }		

	protected void addChild(Level3Enum child) {
	    if (child != null) {
	        this.children.add(child);
	    }
	}	
	
	public Level1Enum parent() {
		return this.parent;
	}

	public Level3Enum[] children() {
	    return children.toArray(new Level3Enum[children.size()]);
	}
	
}
