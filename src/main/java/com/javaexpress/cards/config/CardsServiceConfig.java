package com.javaexpress.cards.config;

import java.util.List;
import java.util.Map;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@ConfigurationProperties(prefix = "cards")
public class CardsServiceConfig {

	private String msg;
	private String buildVersion;
	private Map<String,String> mailDetails;
	private List<String> activeBranches;
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
	public String getBuildVersion() {
		return buildVersion;
	}
	public void setBuildVersion(String buildVersion) {
		this.buildVersion = buildVersion;
	}
	public Map<String, String> getMailDetails() {
		return mailDetails;
	}
	public void setMailDetails(Map<String, String> mailDetails) {
		this.mailDetails = mailDetails;
	}
	public List<String> getActiveBranches() {
		return activeBranches;
	}
	public void setActiveBranches(List<String> activeBranches) {
		this.activeBranches = activeBranches;
	}
	@Override
	public String toString() {
		return "AccountsServiceConfig [msg=" + msg + ", buildVersion=" + buildVersion + ", mailDetails=" + mailDetails
				+ ", activeBranches=" + activeBranches + "]";
	}
	
	
	
}
