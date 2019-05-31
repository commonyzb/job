package com.job.model;

public class Knowledge 
{
    private String id;
    private String type_name="";
    
    
    public Knowledge() {
		super();
		// TODO Auto-generated constructor stub
	}

    
	public Knowledge(String type_name) {
		super();
		this.type_name = type_name;
	}

/*
	public Knowledge(int id, String type_name) {
		super();
		this.id = id;
		this.type_name = type_name;
	}
*/

	public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTypename() {
        return type_name;
    }

    public void setTypename(String type_name) {
        this.type_name = type_name == null ? null : type_name.trim();
    }


	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+type_name;
	}
    
    
}