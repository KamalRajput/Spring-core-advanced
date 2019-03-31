package com.Kamal.SpringCoreAdvanced.StereoTypeAnnotations;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Profiles {

	@Value("Java Instructor")
	private String title;
	@Value("Kamal Consulting Company")
	private String company;

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Profiles [title=" + title + ", company=" + company + "]";
	}

}
