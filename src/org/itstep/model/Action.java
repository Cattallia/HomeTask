package org.itstep.model;

public class Action {

	private String id;
	private String asin;
	private String login;
	private String action;
	private String actionTime;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getAsin() {
		return asin;
	}

	public void setAsin(String asin) {
		this.asin = asin;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getAction() {
		return action;
	}

	public void setAction(String action) {
		this.action = action;
	}

	public String getActionTime() {
		return actionTime;
	}

	public void setActionTime(String actionTime) {
		this.actionTime = actionTime;
	}

	public Action(String id, String price, String asin, String login, String action, String actionTime) {
		this.id = id;
		this.asin = asin;
		this.login = login;
		this.action = action;
		this.actionTime = actionTime;

	}

}
