package data;

public class User {
	String userName;
	String userID;
	String userIphone;
	String userAddress;

	public User(String userName, String userID, String userIphone, String userAddress) {
		super();
		this.userName = userName;
		this.userID = userID;
		this.userIphone = userIphone;
		this.userAddress = userAddress;
	}

	public User() {
		super();
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserIphone() {
		return userIphone;
	}

	public void setUserIphone(String userIphone) {
		this.userIphone = userIphone;
	}

	public String getUserAddress() {
		return userAddress;
	}

	public void setUserAddress(String userAddress) {
		this.userAddress = userAddress;
	}

	@Override
	public String toString() {
		return "User [userName=" + userName + ", userID=" + userID + ", userIphone=" + userIphone + ", userAddress="
				+ userAddress + "]";
	}

}
