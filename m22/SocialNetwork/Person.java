import java.util.Arrays;
class Person {
	private String user;
	private List<String> friendlist;
	Person(String user) {
		this.user = user;
		friendlist = new List<String>();
	}
	public String getUser() {
		return this.user;
	}
	public void addFriend(String follower) {
		friendlist.add(follower);
	}
	public List<String> getList() {
		return friendlist;
	}
	public String toString() {

		String str = this.user+": "+friendlist.toString();
		return str;
	}
}

class SocialNetwork {
	private List<Person> pers_date;
	SocialNetwork() {
		pers_date = new List<Person>();
	}
	public void addConnection(String user, String friend) {
		for (int i = 0; i < pers_date.size(); i++) {
			if (user.equals(pers_date.get(i).getUser())) {
				pers_date.get(i).addFriend(friend);
			}
		}
	}
	public void addConnection(Person person) {
		pers_date.add(person);
	}
	public String getConnections(String user) {
		for (int i = 0; i < pers_date.size(); i++) {
			if (user.equals(pers_date.get(i).getUser())) {
				return pers_date.get(i).toString();
			}
		}
		return "Not a user in Network";
	}
	public void getCommonConnections(String personOne, String personTwo) {
		List<String> temp1 = new List<String>();
		List<String> temp2 = new List<String>();
		List<String> result = new List<String>();
		for (int i = 0; i < pers_date.size(); i++) {
			if (personOne.equals(pers_date.get(i).getUser())) {
				temp1 = pers_date.get(i).getList();
				break;
			}
		}
		for (int i = 0; i < pers_date.size(); i++) {
			if (personTwo.equals(pers_date.get(i).getUser())) {
				temp2 = pers_date.get(i).getList();
				break;
			}
		}
		for (int i = 0; i < temp1.size(); i++) {
			if (temp2.contains(temp1.get(i))) {
				result.add(temp1.get(i));
			}
		}
		System.out.println(result.toString());
	}
	public void showAll() {
		String[] uNames = new String[pers_date.size()];
		for (int i = 0; i < pers_date.size(); i++) {
			uNames[i] = pers_date.get(i).toString();
		}
		Arrays.sort(uNames);
		String str = Arrays.toString(uNames);
		System.out.println(str.substring(1,str.length()-1));
	}
}