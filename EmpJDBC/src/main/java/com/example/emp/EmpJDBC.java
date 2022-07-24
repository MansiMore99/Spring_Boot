package com.example.emp;

import javax.persistence.Id;

public class EmpJDBC {
	
   
	public Integer eid;
    public String ename;
    public String eDOB;
    
    public EmpJDBC()
    {
    	
    }
    
	public EmpJDBC(Integer eid, String ename, String eDOB) {
		//super();
		this.eid = eid;
		this.ename = ename;
		this.eDOB = eDOB;
	}

	public Integer getEid() {
		return eid;
	}

	public void setEid(Integer eid) {
		this.eid = eid;
	}

	public String getEname() {
		return ename;
	}

	public void setEname(String ename) {
		this.ename = ename;
	}

	public String geteDOB() {
		return eDOB;
	}

	public void seteDOB(String eDOB) {
		this.eDOB = eDOB;
	}

	@Override
	public String toString() {
		return "EmpJDBC [eid=" + eid + ", ename=" + ename + ", eDOB=" + eDOB + "]";
	}
	
	
	 	
}
