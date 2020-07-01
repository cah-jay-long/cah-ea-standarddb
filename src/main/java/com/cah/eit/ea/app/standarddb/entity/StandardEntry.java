package com.cah.eit.ea.app.standarddb.entity;

import java.util.List;

import org.springframework.cloud.gcp.data.datastore.core.mapping.Entity;
import org.springframework.data.annotation.Id;

import com.cah.eit.ea.app.standarddb.types.CostModelEnum;
import com.cah.eit.ea.app.standarddb.types.Level1Enum;
import com.cah.eit.ea.app.standarddb.types.Level2Enum;
import com.cah.eit.ea.app.standarddb.types.Level3Enum;
import com.cah.eit.ea.app.standarddb.types.SubClass1Enum;
import com.cah.eit.ea.app.standarddb.types.SubClass2Enum;

@Entity(name="Entry")
public class StandardEntry {
	
	@Id
	String entryId;
	
	Level1Enum level1;
	Level2Enum Level2;
	Level3Enum level3;
	SubClass1Enum subClass1;
	SubClass2Enum subClass2;
	String name;
	String description;
	boolean supportsCloud;
	boolean supportsAgnosicCloud;
	boolean openSource;
	boolean commercialSoftware;
	CostModelEnum costModel;
	List<StatusHistory> statusHistory;
	List<ReleaseHistory> releaseHistory;
	List<ContactEntry> contactRoles;
	List<RelatedStandard> relatedTo;
	

}
