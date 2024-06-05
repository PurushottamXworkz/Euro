package com.xworkz.kiccha.things;

public class Sudeep {

	public int noOfMovies;
	public int performingLanguages;
	public int noOfAwards;
	public float height;
	public long contact;
	public boolean presentlyActive;
	public int age;
	public int weight;
	public String languageOfMovie;
	public String address;
	public String nameOfActor;
	public String nameOfAward;
	public String wifeName;
	public String comeBackMovie;
	public String nameofMovie;

	public Sudeep() {
		System.out.println("This is no arguement constructor");
	}

	public Sudeep(int noOfMovies, int performingLanguages, int noOfAwards, float height, long contact,
			boolean presentlyActive, int age, int weight) {
		this.noOfMovies = noOfMovies;
		System.out.println("The number Of Movies :" + this.noOfMovies);
		this.performingLanguages = performingLanguages;
		System.out.println("The performing Languages :" + this.performingLanguages);
		this.noOfAwards = noOfAwards;
		System.out.println("The number Awards :" + this.noOfAwards);
		this.height = height;
		System.out.println("The height :" + this.height);
		this.contact = contact;
		System.out.println("Contact :" + this.contact);
		this.presentlyActive = presentlyActive;
		System.out.println("PresentlyActive :" + this.presentlyActive);
		this.age = age;
		System.out.println("The age of actor is :" + this.age);
		this.weight = weight;
		System.out.println("The weight of actor is :" + this.weight);
	}

	public Sudeep(String languageOfMovie, String address, String nameOfActor, String nameOfAward, String wifeName,
			String comeBackMovie, String nameofMovie) {
		this.languageOfMovie = languageOfMovie;
		System.out.println("language Of Movie :" + this.languageOfMovie);
		this.address = address;
		System.out.println("Address :" + this.address);
		this.nameOfActor = nameOfActor;
		System.out.println("Name Of Actor :" + this.nameOfActor);
		this.nameOfAward = nameOfAward;
		System.out.println("Name Of Award :" + this.nameOfAward);
		this.wifeName = wifeName;
		System.out.println("Wife Name :" + this.wifeName);
		this.comeBackMovie = comeBackMovie;
		System.out.println("Come Back Movie :" + this.comeBackMovie);
		this.nameofMovie = nameofMovie;
		System.out.println("The name of Movie :" + this.nameofMovie);
	}

	public void setNoOfMovies(int numberOfMovies) {
		this.noOfMovies = numberOfMovies;

	}

	public int getNoOfMovies() {
		return noOfMovies;
	}

	public void setPerformingLanguages(int performaningLang) {
		this.performingLanguages = performaningLang;
	}

	public int getPerformingLanguages() {
		return performingLanguages;
	}

	public void setNoOfAwards(int awards) {
		this.noOfAwards = awards;
	}

	public int getNoOfAwards() {
		return noOfAwards;
	}

	public void setHeight(float heigh) {
		this.height = heigh;
	}

	public float getHeight() {
		return height;
	}

	public void setContact(long phoneNo) {
		this.contact = phoneNo;
	}

	public long getContact() {
		return contact;
	}

	public void setpresentlyActive(boolean active) {
		this.presentlyActive = active;
	}

	public boolean getpresentlyActive() {
		return presentlyActive;
	}

	public void setAge(int ages) {
		this.age = ages;
	}

	public int getAge() {
		return age;
	}

	public void setWeight(int weigh) {
		this.weight = weigh;
	}

	public float getWeight() {
		return weight;
	}

	public void setlanguageOfMovie(String movieLanguage) {
		this.languageOfMovie = movieLanguage;
	}

	public String getlanguageOfMovie() {
		return languageOfMovie;
	}

	public void setAddress(String addres) {
		this.address = addres;
	}

	public String getAddress() {
		return address;
	}

	public void setNameOfActor(String actor) {
		this.nameOfActor = actor;
	}

	public String getNameOfActor() {
		return nameOfActor;
	}

	public void setNameOfAward(String awardName) {
		this.nameOfAward = awardName;
	}

	public String getNameOfAward() {
		return nameOfAward;
	}

	public void setWifeName(String wife) {
		this.wifeName = wife;
	}

	public String getWifeName() {
		return wifeName;
	}

	public void setComeBackMovie(String comebackMovie) {
		this.comeBackMovie = comebackMovie;
	}

	public String getComeBackMovie() {
		return comeBackMovie;
	}

	public void setNameofMovie(String movieName) {
		this.nameofMovie = movieName;
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
				&& this.nameofMovie.equals(vish.nameofMovie) && this.noOfMovies == vish.noOfMovies
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
