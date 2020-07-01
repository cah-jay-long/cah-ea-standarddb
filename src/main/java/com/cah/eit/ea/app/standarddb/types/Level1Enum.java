package com.cah.eit.ea.app.standarddb.types;

import java.util.ArrayList;
import java.util.List;

public enum Level1Enum {

	BUSINESS_ARCHITECTURE,
	GOVERNANCE,
	APPLICATION_ARCHITECTURE,
	INFORMATION_ARCHITECTURE,
	TECHNICAL_ARCHITECTURE,
	SECURITY_ARCHITECTURE;
	
	private List<Level2Enum> children = new ArrayList<Level2Enum>();

	protected void addChild(Level2Enum child) {
	    if (child != null) {
	        this.children.add(child);
	    }
	}	
	
	public Level2Enum[] children() {
	    return children.toArray(new Level2Enum[children.size()]);
	}
	
}
