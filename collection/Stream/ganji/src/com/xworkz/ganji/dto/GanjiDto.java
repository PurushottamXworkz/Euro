package com.xworkz.ganji.dto;

public class GanjiDto {
	private String name;
	private int typesOfGanji;
	
	public GanjiDto(String name, int typesOfGanji) {
		super();
		this.name = name;
		this.typesOfGanji = typesOfGanji;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getTypesOfGanji() {
		return typesOfGanji;
	}

	public void setTypesOfGanji(int typesOfGanji) {
		this.typesOfGanji = typesOfGanji;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + typesOfGanji;
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
		GanjiDto other = (GanjiDto) obj;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (typesOfGanji != other.typesOfGanji)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "name=" + name + ", typesOfGanji=" + typesOfGanji + "";
	}
	
	
}
