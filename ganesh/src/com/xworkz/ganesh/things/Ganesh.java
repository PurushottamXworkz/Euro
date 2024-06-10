package com.xworkz.ganesh.things;

import com.xworkz.ganesh.boot.Ganesh;

public class Ganesh {

	public int noOfHands;
	public int noOfEyes;
	public int noOfAvtars;
	public int noOfFriends;
	public int noOfGaurds;
	public String nameOfDevotee;
	public String nameOfFather;
	public String nameOfMother;
	public String yuga;
	public String favFood;
	public String instrument;
	public String nameOfAvtar;
	public String nameOfWife;
	public String location;
	public String nameOfUncle;

	public Ganesh() {
		System.out.println("This is no arguement constructor");
	}

	public Ganesh(int noOfHands, int noOfEyes, int noOfAvtars, String yuga, int noOfGaurds, String nameOfDevotee,
			String nameOfFather) {
		this.noOfHands = noOfHands;
		System.out.println("The number of hands :" + this.noOfHands);
		this.noOfEyes = noOfEyes;
		System.out.println("The number of Eyes :" + this.noOfEyes);
		this.noOfAvtars = noOfAvtars;
		System.out.println("The number of Avtaras :" + this.noOfAvtars);
		this.yuga = yuga;
		System.out.println("The Avatara yuga :" + this.yuga);
		this.noOfGaurds = noOfGaurds;
		System.out.println("Number of gaurds of Vishu :" + this.noOfGaurds);
		this.nameOfDevotee = nameOfDevotee;
		System.out.println("The name of Devotee :" + this.nameOfDevotee);
		this.nameOfFather = nameOfFather;
		System.out.println("The name of father is :" + this.nameOfFather);
	}

	public Ganesh(String nameOfMother, int noOfFriends, String favFood, String instrument, String nameOfAvtar,
			String nameOfWife, String location, String nameOfUncle) {
		this.nameOfMother = nameOfMother;
		System.out.println("The name of Mother :" + this.nameOfMother);
		this.noOfFriends = noOfFriends;
		System.out.println("The number of Friends :" + this.noOfFriends);
		this.favFood = favFood;
		System.out.println("The favorate food of Vishnu :" + this.favFood);
		this.instrument = instrument;
		System.out.println("The instrument played by Vishnu :" + this.instrument);
		this.nameOfAvtar = nameOfAvtar;
		System.out.println("Name of Vishu Avtar : " + this.nameOfAvtar);
		this.nameOfWife = nameOfWife;
		System.out.println("The Wife name of Vishnu :" + this.nameOfWife);
		this.location = location;
		System.out.println("The Vishnu from :" + this.location);
		this.nameOfUncle = nameOfUncle;
		System.out.println("Uncle name of Krishna is :" + this.nameOfUncle);
	}

	public void setHands(int hands) {
		this.noOfHands = hands;

	}

	public int getHands() {
		System.out.println("Number of hands from get method :" + noOfHands);
		return noOfHands;
	}

	public void setEyes(int eyes) {
		this.noOfEyes = eyes;
	}

	public int getEyes() {
		return noOfEyes;
	}

	public void setNoAvatars(int avatar) {
		this.noOfAvtars = avatar;
	}

	public int getNoOfAvatars() {
		return noOfAvtars;
	}

	public void setYuga(String yug) {
		this.yuga = yug;
	}

	public String getYuga() {
		return yuga;
	}

	public void setNoOfGaurds(int gaurds) {
		this.noOfGaurds = gaurds;
	}

	public int getNoOfgaurds() {
		return noOfGaurds;
	}

	public void setNameOfDevotee(String Devotee) {
		this.nameOfDevotee = Devotee;
	}

	public String getNameOfDevotee() {
		return nameOfDevotee;
	}

	public void setNameOfFather(String father) {
		this.nameOfFather = father;
	}

	public String getNameOfFather() {
		return nameOfFather;
	}

	public void setNameOfMother(String mother) {
		this.nameOfMother = mother;
	}

	public String getNameOfMother() {
		return nameOfMother;
	}

	public void setNoOfFriends(int friends) {
		this.noOfFriends = friends;
	}

	public int getNoOfFriends() {
		return noOfFriends;
	}

	public void setFavFood(String food) {
		this.favFood = food;
	}

	public String getFavFood() {
		return favFood;
	}

	public void setInstrument(String gadget) {
		this.instrument = gadget;
	}

	public String getInstrument() {
		return instrument;
	}

	public void setNameofAvtar(String avatara) {
		this.nameOfAvtar = avatara;
	}

	public String getNameOfAvtar() {
		return nameOfAvtar;
	}

	public void setNameOfWife(String wife) {
		this.nameOfWife = wife;
	}

	public String getNameOfWife() {
		return nameOfWife;
	}

	public void setLocation(String address) {
		this.location = address;
	}

	public String getLocation() {
		return location;
	}

	public void setNameOfUncle(String mama) {
		this.nameOfUncle = mama;
	}

	public String getnameOfUncle() {
		return nameOfUncle;
	}

	public String toString() {
		return "[Number Of Hands :" + noOfHands + ",Number Of Eyes:" + noOfEyes + ",Number Of Avtars:"
				+ noOfAvtars + ",Yuga:" + yuga + ",Number Of Gaurds:" + noOfGaurds + ",Name Of Devotee:" + nameOfDevotee
				+ ",Name Of Father:" + nameOfFather + ",Name Of Mother :" + nameOfMother + ",Number Of Friends:"
				+ noOfFriends + ",Favorite Food:" + favFood + ",Instrument:" + instrument + ",Name Of Avtar:"
				+ nameOfAvtar + ",Name Of Wife:" + nameOfWife + ",location:" + location + ",Name Of Uncle:"
				+ nameOfUncle + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Ganesh other = (Ganesh) obj;
		if (favFood == null) {
			if (other.favFood != null)
				return false;
		} else if (!favFood.equals(other.favFood))
			return false;
		if (instrument == null) {
			if (other.instrument != null)
				return false;
		} else if (!instrument.equals(other.instrument))
			return false;
		if (location == null) {
			if (other.location != null)
				return false;
		} else if (!location.equals(other.location))
			return false;
		if (nameOfAvtar == null) {
			if (other.nameOfAvtar != null)
				return false;
		} else if (!nameOfAvtar.equals(other.nameOfAvtar))
			return false;
		if (nameOfDevotee == null) {
			if (other.nameOfDevotee != null)
				return false;
		} else if (!nameOfDevotee.equals(other.nameOfDevotee))
			return false;
		if (nameOfFather == null) {
			if (other.nameOfFather != null)
				return false;
		} else if (!nameOfFather.equals(other.nameOfFather))
			return false;
		if (nameOfMother == null) {
			if (other.nameOfMother != null)
				return false;
		} else if (!nameOfMother.equals(other.nameOfMother))
			return false;
		if (nameOfUncle == null) {
			if (other.nameOfUncle != null)
				return false;
		} else if (!nameOfUncle.equals(other.nameOfUncle))
			return false;
		if (nameOfWife == null) {
			if (other.nameOfWife != null)
				return false;
		} else if (!nameOfWife.equals(other.nameOfWife))
			return false;
		if (noOfAvtars != other.noOfAvtars)
			return false;
		if (noOfEyes != other.noOfEyes)
			return false;
		if (noOfFriends != other.noOfFriends)
			return false;
		if (noOfGaurds != other.noOfGaurds)
			return false;
		if (noOfHands != other.noOfHands)
			return false;
		if (yuga == null) {
			if (other.yuga != null)
				return false;
		} else if (!yuga.equals(other.yuga))
			return false;
		return true;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((favFood == null) ? 0 : favFood.hashCode());
		result = prime * result + ((instrument == null) ? 0 : instrument.hashCode());
		result = prime * result + ((location == null) ? 0 : location.hashCode());
		result = prime * result + ((nameOfAvtar == null) ? 0 : nameOfAvtar.hashCode());
		result = prime * result + ((nameOfDevotee == null) ? 0 : nameOfDevotee.hashCode());
		result = prime * result + ((nameOfFather == null) ? 0 : nameOfFather.hashCode());
		result = prime * result + ((nameOfMother == null) ? 0 : nameOfMother.hashCode());
		result = prime * result + ((nameOfUncle == null) ? 0 : nameOfUncle.hashCode());
		result = prime * result + ((nameOfWife == null) ? 0 : nameOfWife.hashCode());
		result = prime * result + noOfAvtars;
		result = prime * result + noOfEyes;
		result = prime * result + noOfFriends;
		result = prime * result + noOfGaurds;
		result = prime * result + noOfHands;
		result = prime * result + ((yuga == null) ? 0 : yuga.hashCode());
		return result;
	}

}
