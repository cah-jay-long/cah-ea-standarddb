package com.cah.eit.ea.app.standarddb.entity;

import java.util.Date;

import com.cah.eit.ea.app.standarddb.types.ContactRoleEnum;

public class ContactEntry {

	String id;
	String userId;
	ContactRoleEnum role;
	Date effectiveFrom;
	Date effectiveTo;
	
}
