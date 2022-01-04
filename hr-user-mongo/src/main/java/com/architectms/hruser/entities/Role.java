package com.architectms.hruser.entities;

import java.io.Serializable;

import javax.persistence.Id;

import org.springframework.data.mongodb.core.mapping.Document;


@Document(collection = "tb_role") //Also could be just @Document
public class Role implements Serializable {
	private static final long serialVersionUID = 1L;
	
	@Id
	private String id;
	private String roleName;
	
	public Role() {}

	public Role(String id, String roleName) {
		super();
		this.id = id;
		this.roleName = roleName;
	}

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((roleName == null) ? 0 : roleName.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Role other = (Role) obj;
		if (roleName == null) {
			if (other.roleName != null)
				return false;
		} else if (!roleName.equals(other.roleName))
			return false;
		return true;
	}
	
	
}
