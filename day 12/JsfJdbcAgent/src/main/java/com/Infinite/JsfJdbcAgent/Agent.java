package com.Infinite.JsfJdbcAgent;

public class Agent {
	private int AgentId;
	private String Name;
	private String City;
	private String Gender;
	private int MaritalStatus;
	private double Premium;
	public int getAgentId() {
		return AgentId;
	}
	public String getName() {
		return Name;
	}
	public void setName(String name) {
		Name = name;
	}
	public String getCity() {
		return City;
	}
	public void setCity(String city) {
		City = city;
	}
	public String getGender() {
		return Gender;
	}
	public void setGender(String gender) {
		Gender = gender;
	}
	public int getMaritalStatus() {
		return MaritalStatus;
	}
	public void setMaritalStatus(int maritalStatus) {
		MaritalStatus = maritalStatus;
	}
	public double getPremium() {
		return Premium;
	}
	public void setPremium(double premium) {
		Premium = premium;
	}
	public void setAgentId(int agentId) {
		AgentId = agentId;
	}
	@Override
	public String toString() {
		return "Agent [AgentId=" + AgentId + ", Name=" + Name + ", City=" + City + ", Gender=" + Gender
				+ ", MaritalStatus=" + MaritalStatus + ", Premium=" + Premium + "]";
	}
	public Agent(int agentId, String name, String city, String gender, int maritalStatus, double premium) {
		AgentId = agentId;
		Name = name;
		City = city;
		Gender = gender;
		MaritalStatus = maritalStatus;
		Premium = premium;
	}
	public Agent() {
		// TODO Auto-generated constructor stub
	}
	
}
