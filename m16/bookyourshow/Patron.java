class Patron{
	String name;
	String mobileNum;
	Patron(String name, String mob){
		this.name = name;
	}

	public String toString(){
		return name+" "+mobileNum;
	}

}