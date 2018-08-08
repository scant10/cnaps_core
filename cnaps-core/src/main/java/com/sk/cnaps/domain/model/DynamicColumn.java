package com.sk.cnaps.domain.model;

import java.lang.annotation.Annotation;

import javax.persistence.Column;

public class DynamicColumn implements Column {
	
    private String name;
    
    public DynamicColumn(String name) {
        this.name = name;
    }
 
    @Override
    public String name() {
        return name;
    }

	@Override
	public Class<? extends Annotation> annotationType() {
		// TODO Auto-generated method stub
		return DynamicColumn.class;
	}

	@Override
	public boolean unique() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean nullable() {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean insertable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public boolean updatable() {
		// TODO Auto-generated method stub
		return true;
	}

	@Override
	public String columnDefinition() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public String table() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public int length() {
		// TODO Auto-generated method stub
		return 255;
	}

	@Override
	public int precision() {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public int scale() {
		// TODO Auto-generated method stub
		return 0;
	}
}
