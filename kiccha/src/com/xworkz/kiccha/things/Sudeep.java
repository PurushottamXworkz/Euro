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

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((address == null) ? 0 : address.hashCode());
		result = prime * result + age;
		result = prime * result + ((comeBackMovie == null) ? 0 : comeBackMovie.hashCode());
		result = prime * result + (int) (contact ^ (contact >>> 32));
		result = prime * result + Float.floatToIntBits(height);
		result = prime * result + ((languageOfMovie == null) ? 0 : languageOfMovie.hashCode());
		result = prime * result + ((nameOfActor == null) ? 0 : nameOfActor.hashCode());
		result = prime * result + ((nameOfAward == null) ? 0 : nameOfAward.hashCode());
		result = prime * result + ((nameofMovie == null) ? 0 : nameofMovie.hashCode());
		result = prime * result + noOfAwards;
		result = prime * result + noOfMovies;
		result = prime * result + performingLanguages;
		result = prime * result + (presentlyActive ? 1231 : 1237);
		result = prime * result + weight;
		result = prime * result + ((wifeName == null) ? 0 : wifeName.hashCode());
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
		Sudeep other = (Sudeep) obj;
		if (address == null) {
			if (other.address != null)
				return false;
		} else if (!address.equals(other.address))
			return false;
		if (age != other.age)
			return false;
		if (comeBackMovie == null) {
			if (other.comeBackMovie != null)
				return false;
		} else if (!comeBackMovie.equals(other.comeBackMovie))
			return false;
		if (contact != other.contact)
			return false;
		if (Float.floatToIntBits(height) != Float.floatToIntBits(other.height))
			return false;
		if (languageOfMovie == null) {
			if (other.languageOfMovie != null)
				return false;
		} else if (!languageOfMovie.equals(other.languageOfMovie))
			return false;
		if (nameOfActor == null) {
			if (other.nameOfActor != null)
				return false;
		} else if (!nameOfActor.equals(other.nameOfActor))
			return false;
		if (nameOfAward == null) {
			if (other.nameOfAward != null)
				return false;
		} else if (!nameOfAward.equals(other.nameOfAward))
			return false;
		if (nameofMovie == null) {
			if (other.nameofMovie != null)
				return false;
		} else if (!nameofMovie.equals(other.nameofMovie))
			return false;
		if (noOfAwards != other.noOfAwards)
			return false;
		if (noOfMovies != other.noOfMovies)
			return false;
		if (performingLanguages != other.performingLanguages)
			return false;
		if (presentlyActive != other.presentlyActive)
			return false;
		if (weight != other.weight)
			return false;
		if (wifeName == null) {
			if (other.wifeName != null)
				return false;
		} else if (!wifeName.equals(other.wifeName))
			return false;
		return true;
	}

	
}
