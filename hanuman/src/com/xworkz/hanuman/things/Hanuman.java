package com.xworkz.hanuman.things;

public class Hanuman {
		public static int noOfHands;
		public static int noOfEyes;
		public static int noOfAvtars;
		public static int noOfFriends;
		public static int noOfGaurds;
		public static String nameOfDevotee;
		public static String nameOfFather;
		public static String nameOfMother;
		public static String yuga;
		public static String favFood;
		public static String instrument;
		public static String nameOfAvtar;
		public static String nameOfWife;
		public static String location;
		public static String nameOfUncle;

		public Hanuman() {
			System.out.println("This is no arguement constructor");
		}

		public Hanuman(int noOfHands, int noOfEyes, int noOfAvtars, String yuga, int noOfGaurds, String nameOfDevotee,
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

		public Hanuman(String nameOfMother, int noOfFriends, String favFood, String instrument, String nameOfAvtar,
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

		public static void setHands(int hands) {
			noOfHands = hands;

		}

		public int getHands() {
			System.out.println("Number of hands from get method :" + noOfHands);
			return noOfHands;
		}

		public static void setEyes(int eyes) {
			noOfEyes = eyes;
		}

		public int getEyes() {
			return noOfEyes;
		}

		public static void setNoAvatars(int avatar) {
			noOfAvtars = avatar;
		}

		public int getNoOfAvatars() {
			return noOfAvtars;
		}

		public static void setYuga(String yug) {
			yuga = yug;
		}

		public String getYuga() {
			return yuga;
		}

		public static void setNoOfGaurds(int gaurds) {
			noOfGaurds = gaurds;
		}

		public int getNoOfgaurds() {
			return noOfGaurds;
		}

		public static void setNameOfDevotee(String Devotee) {
			nameOfDevotee = Devotee;
		}

		public String getNameOfDevotee() {
			return nameOfDevotee;
		}

		public static void setNameOfFather(String father) {
			nameOfFather = father;
		}

		public String getNameOfFather() {
			return nameOfFather;
		}

		public static void setNameOfMother(String mother) {
			nameOfMother = mother;
		}

		public String getNameOfMother() {
			return nameOfMother;
		}

		public static void setNoOfFriends(int friends) {
			noOfFriends = friends;
		}

		public int getNoOfFriends() {
			return noOfFriends;
		}

		public static void setFavFood(String food) {
			favFood = food;
		}

		public String getFavFood() {
			return favFood;
		}

		public static void setInstrument(String gadget) {
			instrument = gadget;
		}

		public String getInstrument() {
			return instrument;
		}

		public static void setNameofAvtar(String avatara) {
			nameOfAvtar = avatara;
		}

		public String getNameOfAvtar() {
			return nameOfAvtar;
		}

		public static void setNameOfWife(String wife) {
			nameOfWife = wife;
		}

		public String getNameOfWife() {
			return nameOfWife;
		}

		public static void setLocation(String address) {
			location = address;
		}

		public String getLocation() {
			return location;
		}

		public static void setNameOfUncle(String mama) {
			nameOfUncle = mama;
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

			Hanuman hanuman = (Hanuman) obj;

			return this.yuga.equals(hanuman.yuga) && this.nameOfDevotee.equals(hanuman.nameOfDevotee)
					&& this.nameOfFather.equals(hanuman.nameOfFather) && this.nameOfMother.equals(hanuman.nameOfMother)
					&& this.favFood.equals(hanuman.favFood) && this.instrument.equals(hanuman.instrument)
					&& this.nameOfAvtar.equals(hanuman.nameOfAvtar) && this.nameOfWife.equals(hanuman.nameOfWife)
					&& this.location.equals(hanuman.location) && this.nameOfUncle.equals(hanuman.nameOfUncle)
					&& this.noOfHands == hanuman.noOfHands && this.noOfEyes == hanuman.noOfEyes
					&& this.noOfAvtars == hanuman.noOfAvtars && this.noOfGaurds == hanuman.noOfGaurds
					&& this.noOfFriends == hanuman.noOfFriends;

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


