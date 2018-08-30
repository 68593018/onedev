package io.onedev.server.event.issue;

import java.util.Date;

import io.onedev.server.model.Issue;
import io.onedev.server.model.User;

public abstract class IssueEvent {

	private final Issue issue;
	
	public IssueEvent(Issue issue) {
		this.issue = issue;
	}

	public Issue getIssue() {
		return issue;
	}

	public abstract User getUser();

	public abstract Date getDate();

}