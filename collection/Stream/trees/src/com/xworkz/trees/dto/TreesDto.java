package com.xworkz.trees.dto;

public class TreesDto {
	private String treeName;
	private int noOfTrees;
	
	public TreesDto(String treeName, int noOfTrees) {
		super();
		this.treeName = treeName;
		this.noOfTrees = noOfTrees;
	}

	public String getTreeName() {
		return treeName;
	}

	public void setTreeName(String treeName) {
		this.treeName = treeName;
	}

	public int getNoOfTrees() {
		return noOfTrees;
	}

	public void setNoOfTrees(int noOfTrees) {
		this.noOfTrees = noOfTrees;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + noOfTrees;
		result = prime * result + ((treeName == null) ? 0 : treeName.hashCode());
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
		TreesDto other = (TreesDto) obj;
		if (noOfTrees != other.noOfTrees)
			return false;
		if (treeName == null) {
			if (other.treeName != null)
				return false;
		} else if (!treeName.equals(other.treeName))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "treeName=" + treeName + ", noOfTrees=" + noOfTrees + "";
	}
	
	
}
