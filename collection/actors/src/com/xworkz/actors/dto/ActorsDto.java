package com.xworkz.actors.dto;

public class ActorsDto {
	private String actorName;
	private long contact;
	private String debue;
	
	public ActorsDto(String actorName, long contact, String debue) {
		super();
		this.actorName = actorName;
		this.contact = contact;
		this.debue = debue;
	}

	public String getActorName() {
		return actorName;
	}

	public void setActorName(String actorName) {
		this.actorName = actorName;
	}

	public long getContact() {
		return contact;
	}

	public void setContact(long contact) {
		this.contact = contact;
	}

	public String getDebue() {
		return debue;
	}

	public void setDebue(String debue) {
		this.debue = debue;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((actorName == null) ? 0 : actorName.hashCode());
		result = prime * result + (int) (contact ^ (contact >>> 32));
		result = prime * result + ((debue == null) ? 0 : debue.hashCode());
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
		ActorsDto other = (ActorsDto) obj;
		if (actorName == null) {
			if (other.actorName != null)
				return false;
		} else if (!actorName.equals(other.actorName))
			return false;
		if (contact != other.contact)
			return false;
		if (debue == null) {
			if (other.debue != null)
				return false;
		} else if (!debue.equals(other.debue))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "ActorsDto [actorName=" + actorName + ", contact=" + contact + ", debue=" + debue + "]";
	}
	
	
	
	
}
