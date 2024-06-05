package com.xworkz.kiccha.things;

import com.xworkz.vishnu.things.Vishnu;

public class Sudeep {

	public static int noOfMovies;
	public static int performingLanguages;
	public static int noOfAwards;
	public static float height;
	public static long contact;
	public static boolean presentlyActive;
	public static int age;
	public static int weight;
	public static String languageOfMovie;
	public static String address;
	public static String nameOfActor;
	public static String nameOfAward;
	public static String wifeName;
	public static String comeBackMovie;
	public static String nameofMovie;

	public Sudeep() {
		System.out.println("This is no arguement constructor");
	}

	public Sudeep(int noOfMovies, int performingLanguages, int noOfAwards, float height, long contact,
			boolean presentlyActive, int age, int weight) {
		this.noOfMovies = noOfMovies;
		System.out.println("The number of hands :" + this.noOfMovies);
		this.performingLanguages = performingLanguages;
		System.out.println("The number of Eyes :" + this.performingLanguages);
		this.noOfAwards = noOfAwards;
		System.out.println("The number of Avtaras :" + this.noOfAwards);
		this.height = height;
		System.out.println("The Avatara yuga :" + this.height);
		this.contact = contact;
		System.out.println("Number of gaurds of Vishu :" + this.contact);
		this.presentlyActive = presentlyActive;
		System.out.println("The name of Devotee :" + this.presentlyActive);
		this.age = age;
		System.out.println("The name of father is :" + this.age);
		this.weight = weight;
		System.out.println("The name of father is :" + this.weight);
	}

	public Sudeep(String languageOfMovie, String address, String nameOfActor, String nameOfAward, String wifeName,
			String comeBackMovie, String nameofMovie) {
		this.languageOfMovie = languageOfMovie;
		System.out.println("The number of hands :" + this.languageOfMovie);
		this.address = address;
		System.out.println("The number of Eyes :" + this.address);
		this.nameOfActor = nameOfActor;
		System.out.println("The number of Avtaras :" + this.nameOfActor);
		this.nameOfAward = nameOfAward;
		System.out.println("The Avatara yuga :" + this.nameOfAward);
		this.wifeName = wifeName;
		System.out.println("Number of gaurds of Vishu :" + this.wifeName);
		this.comeBackMovie = comeBackMovie;
		System.out.println("The name of Devotee :" + this.comeBackMovie);
		this.nameofMovie = nameofMovie;
		System.out.println("The name of father is :" + this.nameofMovie);
	}

	public static void setNoOfMovies(int numberOfMovies) {
		noOfMovies = numberOfMovies;

	}

	public int getNoOfMovies() {
//		System.out.println("Number of hands from get method :" + noOfMovies);
		return noOfMovies;
	}

	public static void setPerformingLanguages(int performaningLang) {
		performingLanguages = performaningLang;
	}

	public int getPerformingLanguages() {
		return performingLanguages;
	}

	public static void setNoOfAwards(int awards) {
		noOfAwards = awards;
	}

	public int getNoOfAwards() {
		return noOfAwards;
	}

	public static void setHeight(float heigh) {
		height = heigh;
	}

	public float getHeight() {
		return height;
	}

	public static void setContact(long phoneNo) {
		contact = phoneNo;
	}

	public long getContact() {
		return contact;
	}

	public static void setpresentlyActive(boolean active) {
		presentlyActive = active;
	}

	public boolean getpresentlyActive() {
		return presentlyActive;
	}

	public static void setAge(int ages) {
		age = ages;
	}

	public int getAge() {
		return age;
	}

	public static void setWeight(int weigh) {
		weight = weigh;
	}

	public float getWeight() {
		return weight;
	}

	public static void setlanguageOfMovie(String movieLanguage) {
		languageOfMovie = movieLanguage;
	}

	public String getlanguageOfMovie() {
		return languageOfMovie;
	}

	public static void setAddress(String addres) {
		address = addres;
	}

	public String getAddress() {
		return address;
	}

	public static void setNameOfActor(String actor) {
		nameOfActor = actor;
	}

	public String getNameOfActor() {
		return nameOfActor;
	}

	public static void setNameOfAward(String awardName) {
		nameOfAward = awardName;
	}

	public String getNameOfAward() {
		return nameOfAward;
	}

	public static void setWifeName(String wife) {
		wifeName = wife;
	}

	public String getWifeName() {
		return wifeName;
	}

	public static void setComeBackMovie(String comebackMovie) {
		comeBackMovie = comebackMovie;
	}

	public String getComeBackMovie() {
		return comeBackMovie;
	}

	public static void setNameofMovie(String movieName) {
		nameofMovie = movieName;
	}

	public String getNameofMovie() {
		return nameofMovie;
	}

	public String toString() {
		return "Sudeep[Number Of Movies :" + noOfMovies + ",Performing Languages:" + performingLanguages
				+ ",Number Of Awards:" + noOfAwards + ",Height:" + height + ",Contact:" + contact + ",PresentlyActive:"
				+ presentlyActive + ",Age:" + age + ",Weight :" + weight + ",Language Of Movie:" + languageOfMovie
				+ ",Address:" + address + ",Name Of Actor:" + nameOfActor + ",Name Of Award:" + nameOfAward
				+ ",Wife Name:" + wifeName + ",Come Back Movie:" + comeBackMovie + ",Name of Movie:" + nameofMovie
				+ "]";
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

		Sudeep vish = (Sudeep) obj;

		return this.languageOfMovie.equals(vish.languageOfMovie) && this.address.equals(vish.address)
				&& this.nameOfActor.equals(vish.nameOfActor) && this.nameOfAward.equals(vish.nameOfAward)
				&& this.wifeName.equals(vish.wifeName) && this.comeBackMovie.equals(vish.comeBackMovie)
				&& this.nameofMovie.equals(vish.nameofMovie)&& this.noOfMovies == vish.noOfMovies
				&& this.performingLanguages == vish.performingLanguages && this.noOfAwards == vish.noOfAwards
				&& this.height == vish.height && this.contact == vish.contact
				&& this.presentlyActive == vish.presentlyActive && this.age == vish.age && this.weight == vish.weight;

	}

	public int hashCode() {
		final int prime = 5;
		int result = 1;
		result = result * prime + languageOfMovie.hashCode();
		result = result * prime + address.hashCode();
		result = result * prime + nameOfActor.hashCode();
		result = result * prime + nameOfAward.hashCode();
		result = result * prime + wifeName.hashCode();
		result = result * prime + comeBackMovie.hashCode();
		result = result * prime + nameofMovie.hashCode();
		
		result = result * prime + noOfMovies;
		result = result * prime + performingLanguages;
		result = result * prime + noOfAwards;
//		result = result * prime + height;
//		result = result * prime + contact;
//		result = result * prime + presentlyActive;
		result = result * prime + age;
//		result = result * prime + weight;
		return result;
	}

}
