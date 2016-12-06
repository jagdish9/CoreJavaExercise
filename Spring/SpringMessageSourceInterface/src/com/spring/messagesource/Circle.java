package com.spring.messagesource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Required;
import org.springframework.context.MessageSource;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Controller;
import org.springframework.stereotype.Service;

//@Component // by-default Circle name is circle treated as bean which is not defined in spring.xml
//@Service // same as above
@Controller // same as above
public class Circle implements Shape{

	private Point center;

	@Autowired
	private MessageSource messageSource;
	
	public MessageSource getMessageSource() {
		return messageSource;
	}

	public void setMessageSource(MessageSource messageSource) {
		this.messageSource = messageSource;
	}

	public Point getCenter() {
		return center;
	}

	@Autowired
	public void setCenter(Point center) {
		this.center = center;
	}

	public void draw()
	{
		System.out.println(this.messageSource.getMessage("drawing.circle", null, "Default drawing circle!", null));
		System.out.println("Point is = (" + getCenter().getX() + ", " + getCenter().getY() + ")");
		System.out.println(this.messageSource.getMessage("welcomes", null, "Default greeting", null));
		System.out.println(this.messageSource.getMessage("drawing.point", new Object[] {center.getX(), center.getY()}, "Default drawing point!", null));
	}
}
