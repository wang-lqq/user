package user.management.entity;

import java.util.Date;

import org.springframework.stereotype.Component;
@Component
public class User {
	private int uuid;
	
	private String uname;
	
	private String upwd;
	
	private String sex;
	
	private Date birth;
	
	private String city;
	
	private int did;
	
	private Dept dept;

	public int getUuid() {
		return uuid;
	}

	public void setUuid(int uuid) {
		this.uuid = uuid;
	}

	public String getUname() {
		return uname;
	}

	public void setUname(String uname) {
		this.uname = uname;
	}

	public String getUpwd() {
		return upwd;
	}

	public void setUpwd(String upwd) {
		this.upwd = upwd;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Date getBirth() {
		return birth;
	}

	public void setBirth(Date birth) {
		this.birth = birth;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public Dept getDept() {
		return dept;
	}

	public void setDept(Dept dept) {
		this.dept = dept;
	}

	@Override
	public String toString() {
		return "User [uuid=" + uuid + ", uname=" + uname + ", upwd=" + upwd + ", sex=" + sex + ", birth=" + birth
				+ ", city=" + city + ", did=" + did + ", dept=" + dept + "]";
	}
	
}
