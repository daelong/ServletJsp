package com.edu.customTag;

import java.io.IOException;
import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;

public class MyCustomTag2 extends SimpleTagSupport{
	@Override
	public void doTag() throws JspException, IOException{
		System.out.println("Ŀ���� �±��� �ٵ� ����Ǳ� ��");
		getJspBody().invoke(null);
		System.out.println("Ŀ���� �±��� �ٵ� ����� ��");
	}

}