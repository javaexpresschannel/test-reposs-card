package com.javaexpress.cards.response;

import java.util.List;
import java.util.Map;

public class PropertiesBo {

	private String msg;
	private String buildVersion;
	private Map<String,String> mailDetails;
	private List<String> activeBranches;
	
	public PropertiesBo(String msg, String buildVersion, Map<String, String> mailDetails, List<String> activeBranches) {
		super();
		this.msg = msg;
		this.buildVersion = buildVersion;
		this.mailDetails = mailDetails;
		this.activeBranches = activeBranches;
	}
	public String getMsg() {
		return msg;
	}
	public String getBuildVersion() {
		return buildVersion;
	}
	public Map<String, String> getMailDetails() {
		return mailDetails;
	}
	public List<String> getActiveBranches() {
		return activeBranches;
	}
	
	
}
