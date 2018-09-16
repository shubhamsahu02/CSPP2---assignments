class Show {
	String movieName;
	String dateTime;
	String[] seatNumber;
	Patron[] booked;
	Show(String movieName, String dateTime, String[] seatNumber) {
		this.movieName = movieName;
		this.dateTime = dateTime;
		this. seatNumber = seatNumber;
		this.booked = new Patron[seatNumber.length];
	}
	public String toString() {
		return movieName+","+dateTime;
	}
}