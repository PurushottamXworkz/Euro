package com.xworkz.vishnu.things;

public class Vishnu {
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

	public Vishnu() {
		System.out.println("This is no arguement constructor");
	}

	public Vishnu(int noOfHands, int noOfEyes, int noOfAvtars, String yuga, int noOfGaurds, String nameOfDevotee,
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

	public Vishnu(String nameOfMother, int noOfFriends, String favFood, String instrument, String nameOfAvtar,
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
		return "Vishnu[Number Of Hands :" + noOfHands + ",Number Of Eyes:" + noOfEyes + ",Number Of Avtars:"
				+ noOfAvtars + ",Yuga:" + yuga + ",Number Of Gaurds:" + noOfGaurds + ",Name Of Devotee:" + nameOfDevotee
				+ ",Name Of Father:" + nameOfFather + ",Name Of Mother :" + nameOfMother + ",Number Of Friends:"
				+ noOfFriends + ",Favorite Food:" + favFood + ",Instrument:" + instrument + ",Name Of Avtar:"
				+ nameOfAvtar + ",Name Of Wife:" + nameOfWife + ",location:" + location + ",Name Of Uncle:"
				+ nameOfUncle + "]";
	}

	public boolean equals(Object obj) {
		if (this == obj) {
			return true;
		}
		if (obj == null) {
			return false;
		}
		if (this.getClass() != obj.getClass()) {
			return false;
		}
		if (!(this instanceof Object)) {
			return false;
		}

		Vishnu vish = (Vishnu) obj;

		return this.yuga.equals(vish.yuga) && this.nameOfDevotee.equals(vish.nameOfDevotee)
				&& this.nameOfFather.equals(vish.nameOfFather) && this.nameOfMother.equals(vish.nameOfMother)
				&& this.favFood.equals(vish.favFood) && this.instrument.equals(vish.instrument)
				&& this.nameOfAvtar.equals(vish.nameOfAvtar) && this.nameOfWife.equals(vish.nameOfWife)
				&& this.location.equals(vish.location) && this.nameOfUncle.equals(vish.nameOfUncle)
				&& this.noOfHands == vish.noOfHands && this.noOfEyes == vish.noOfEyes
				&& this.noOfAvtars == vish.noOfAvtars && this.noOfGaurds == vish.noOfGaurds
				&& this.noOfFriends == vish.noOfFriends;
	}

	public int hashCode() {
		final int prime = 5;
		int result = 1;
		result = result * prime + yuga.hashCode();
		result = result * prime + nameOfDevotee.hashCode();
		result = result * prime + nameOfFather.hashCode();
		result = result * prime + nameOfMother.hashCode();
		result = result * prime + favFood.hashCode();
		result = result * prime + instrument.hashCode();
		result = result * prime + nameOfAvtar.hashCode();
		result = result * prime + nameOfWife.hashCode();
		result = result * prime + location.hashCode();
		result = result * prime + nameOfUncle.hashCode();
		result = result * prime + noOfHands;
		result = result * prime + noOfEyes;
		result = result * prime + noOfAvtars;
		result = result * prime + noOfGaurds;
		result = result * prime + noOfFriends;
		return result;
	}
}
