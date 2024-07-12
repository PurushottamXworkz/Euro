package com.xworkz.reporter.dto;

public class ReporterDto {
	private String nameOfReporter;
	private String nameOfMagazines;
	private int noOfPapers;
	
	public ReporterDto(String nameOfReporter, String nameOfMagazines, int noOfPapers) {
		super();
		this.nameOfReporter = nameOfReporter;
		this.nameOfMagazines = nameOfMagazines;
		this.noOfPapers = noOfPapers;
	}

	public String getNameOfReporter() {
		return nameOfReporter;
	}

	public void setNameOfReporter(String nameOfReporter) {
		this.nameOfReporter = nameOfReporter;
	}

	public String getNameOfMagazines() {
		return nameOfMagazines;
	}

	public void setNameOfMagazines(String nameOfMagazines) {
		this.nameOfMagazines = nameOfMagazines;
	}

	public int getNoOfPapers() {
		return noOfPapers;
	}

	public void setNoOfPapers(int noOfPapers) {
		this.noOfPapers = noOfPapers;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((nameOfMagazines == null) ? 0 : nameOfMagazines.hashCode());
		result = prime * result + ((nameOfReporter == null) ? 0 : nameOfReporter.hashCode());
		result = prime * result + noOfPapers;
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
		ReporterDto other = (ReporterDto) obj;
		if (nameOfMagazines == null) {
			if (other.nameOfMagazines != null)
				return false;
		} else if (!nameOfMagazines.equals(other.nameOfMagazines))
			return false;
		if (nameOfReporter == null) {
			if (other.nameOfReporter != null)
				return false;
		} else if (!nameOfReporter.equals(other.nameOfReporter))
			return false;
		if (noOfPapers != other.noOfPapers)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "nameOfReporter=" + nameOfReporter + ", nameOfMagazines=" + nameOfMagazines
				+ ", noOfPapers=" + noOfPapers + "";
	}
	
	
	
}
