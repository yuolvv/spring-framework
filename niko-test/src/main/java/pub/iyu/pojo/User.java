package pub.iyu.pojo;

/**
 * @ClassName : User
 * @Auther: Niko
 * @Date: 2020/7/13 10:44
 * @Description:
 */
public class User {
	private String username;
	private String address;

	@Override
	public String toString() {
		return "User{" +
				"username='" + username + '\'' +
				", address='" + address + '\'' +
				'}';
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}
}
