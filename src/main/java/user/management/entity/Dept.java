package user.management.entity;

import org.springframework.stereotype.Component;

@Component
public class Dept {
	private int did;
	
	private String dname;
	
	private String dtel;

	public int getDid() {
		return did;
	}

	public void setDid(int did) {
		this.did = did;
	}

	public String getDname() {
		return dname;
	}

	public void setDname(String dname) {
		this.dname = dname;
	}

	public String getDtel() {
		return dtel;
	}

	public void setDtel(String dtel) {
		this.dtel = dtel;
	}
}
