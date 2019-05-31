package com.job.model;


public class Admin 
{
    private String id;
    private String admin_name = "";  
    private String admin_password ="";
    private String salt="";
    private Integer master = 0;
    private Integer froze = 0;
    private Integer delete = 0;
    private Integer repassword = 0;
    private Integer select = 0;
    private Integer freeze = 0;

	

    public String getId() {
        return id;
    }
/*	
	public void setId(Integer id) {
        this.id = id;
    }
*/
    @Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+admin_name+" "+admin_password+" "+salt+" "+master+" "+froze+" "+delete+" "+repassword+" "+select+" "+freeze;
	}

	public String getSalt() {
		return salt;
	}
	public void setSalt(String salt) {
		this.salt = salt;
	}
	public Admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Admin(String admin_name, String admin_password, Integer master, Integer froze, Integer delete, Integer repassword,
			Integer select, Integer freeze) {
		super();
		this.admin_name = admin_name;
		this.admin_password = admin_password;
		this.master = master;
		this.froze = froze;
		this.delete = delete;
		this.repassword = repassword;
		this.select = select;
		this.freeze = freeze;
	}

	
    public String getAdmin_name() {
        return admin_name;
    }

    public void setAdmin_name(String admin_name) {
        this.admin_name = admin_name == null ? null : admin_name.trim();
    }
    
	
    public String getAdmin_password() {
		return admin_password;
	}

	public void setAdmin_password(String admin_password) {
		this.admin_password = admin_password;
	}

	public Integer getMaster() {
        return master;
    }

    public void setMaster(Integer master) {
        this.master = master;
    }

    public Integer getFroze() {
        return froze;
    }

    public void setFroze(Integer froze) {
        this.froze = froze;
    }

    public Integer getDelete() {
        return delete;
    }

    public void setDelete(Integer delect) {
        this.delete = delect;
    }

    public Integer getRepassword() {
        return repassword;
    }

    public void setRepassword(Integer repassword) {
        this.repassword = repassword;
    }

    public Integer getSelect() {
        return select;
    }

    public void setSelect(Integer select) {
        this.select = select;
    }

    public Integer getFreeze() {
        return freeze;
    }

    public void setFreeze(Integer freeze) {
        this.freeze = freeze;
    }
}