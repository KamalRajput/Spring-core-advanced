package com.Kamal.SpringCoreAdvanced.StereoTypeAnnotations;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("inst")
@Scope("prototype")
public class Instructor {
	
	//@Value("#{66+44}")
	//@Value("#{T(java.lang.Math).abs(-99)}")
	@Value("#{T( java.lang.Integer).MIN_VALUE}")
	private int id;
	@Value("Kamal Rajput")
	private String name;
	
	@Autowired
	private Profiles profile;
	
	//Using expression language on boolean.
	@Value("#{2+3>5}")
	private boolean Active;
	
	
	/* using Spring Expression Language*/
	@Value("#{topics}")
	private List<String> list;

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	

	

	

	@Override
	public String toString() {
		return "Instructor [id=" + id + ", name=" + name + ", profile=" + profile + ", Active=" + Active + ", list="
				+ list + "]";
	}

	public Profiles getProfile() {
		return profile;
	}

	public void setProfile(Profiles profile) {
		this.profile = profile;
	}

	public boolean isActive() {
		return Active;
	}

	public void setActive(boolean active) {
		Active = active;
	}

	public List<String> getList() {
		return list;
	}

	public void setList(List<String> list) {
		this.list = list;
	}

	
	
}
