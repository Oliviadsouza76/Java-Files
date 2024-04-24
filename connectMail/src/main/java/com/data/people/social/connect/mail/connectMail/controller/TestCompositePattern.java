package com.data.people.social.connect.mail.connectMail.controller;

import com.data.people.social.connect.mail.connectMail.entities.DesignComposite;
import com.data.people.social.connect.mail.connectMail.service.Circle;
import com.data.people.social.connect.mail.connectMail.service.Triangle;

public class TestCompositePattern {
	
	private void psvm() {
		// TODO Auto-generated method stub

	}
	
	public static void main(String [] args) {
		
		DesignComposite dc = new Triangle();
		DesignComposite dc1 = new Triangle();
		DesignComposite circle = new Circle();
		
		Drawing drwaDrawing = new Drawing();
		drwaDrawing.add(dc);
		drwaDrawing.add(dc1);
		drwaDrawing.add(circle);	
		
		drwaDrawing.draw("Red");
		
		drwaDrawing.clear();
		
		drwaDrawing.add(dc);
		drwaDrawing.add(dc1);
		drwaDrawing.add(circle);
		drwaDrawing.draw("Green");
		
		
	}

}
