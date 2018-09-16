class BookYourShow {
	Show[] showsArray;
	int size;
	BookYourShow() {
		showsArray = new Show[10];
		size = 0;
	}

	public void addAShow(Show var) {
		showsArray[size++] = var;
	}
	public Show getAShow(String moviename, String datetime) {
		for (Show s : showsArray) {
			if (s != null) {
				if (s.movieName.equals(moviename) && s.dateTime.equals(datetime)) {
					return s;
				}
			}
		}
		return null;
	}
	public void bookAShow(String moviename, String datetime, Patron p, String[] seats) {
		if (size == 0) {
			System.out.println("No show");
			return;
		}
		if (getAShow(moviename, datetime) == null) {
			System.out.println("No show");
			return;
		}
		for (Show s : showsArray) {
			if (s != null) {
				if (s.movieName.equals(moviename) && s.dateTime.equals(datetime)) {
					for (String seatnum : seats) {
						for (int i = 0; i < s.seatNumber.length; i++) {
							if (s.seatNumber[i].equals(seatnum)) {
								s.seatNumber[i] = "N/A";
								s.booked[i] = p;
							}
						}
					}
				}
			}
		}
	}
	public void showAll() {
		for (Show s : showsArray) {
			if (s != null) {
				String res = s.movieName + ",";
				res += s.dateTime + ",[";
				for (int i = 0; i < s.seatNumber.length - 1; i++) {
					res += s.seatNumber[i] + ",";
				}
				res += s.seatNumber[s.seatNumber.length - 1] + "]";
				System.out.println(res);
			}
		}
	}
	public void printTicket(String moviename, String datetime, String mobilenum) {
		boolean booked = false;
		for (Show s : showsArray) {
			if (s != null) {
				if (s.movieName.equals(moviename) && s.dateTime.equals(datetime)) {
					for (int i = 0; i < s.booked.length; i++) {
						if (s.booked[i] != null) {
							if (s.booked[i].mobileNumber.equals(mobilenum)) {
								booked = true;
							}
						}
					}
				}
			}
		}
		if (booked) {
			System.out.println(mobilenum + " " + moviename + " " + datetime);
		} else {
			System.out.println("Invalid");
		}
	}
}