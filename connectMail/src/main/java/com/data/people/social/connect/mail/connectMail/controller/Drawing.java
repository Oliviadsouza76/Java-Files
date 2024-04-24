package com.data.people.social.connect.mail.connectMail.controller;

import java.util.ArrayList;
import java.util.List;

import com.data.people.social.connect.mail.connectMail.entities.DesignComposite;

public class Drawing implements DesignComposite {
	
	private List<DesignComposite> designs = new ArrayList<DesignComposite>();

	@Override
	public void draw(String fillColor) {
		// TODO Auto-generated method stub
		for (DesignComposite sh : designs) {
			
			sh.draw(fillColor);
		}
	}
	
	public void add(DesignComposite addDC) {
		this.designs.add(addDC);
	}
	
	public void removeShape(DesignComposite C) {
		
		designs.remove(C);
	}
	
	public void clear() {
		System.out.println("Clearing all SHapes from drawing");
		this.designs.clear();
	}

}
