package com.edu.test;

import javax.servlet.http.*;

public class TestSessionAttributeListener implements HttpSessionAttributeListener{
	public TestSessionAttributeListener() {
		System.out.println("TestSessionAttributener ��ü ����");
	}
	
	public void attributeAdded(HttpSessionBindingEvent e) {
		System.out.println("���� ��ü�� �߰��� �Ӽ� ����");
	}
	
	public void attributeReplaced(HttpSessionBindingEvent e) {
		System.out.println("���� ��ü�� �߰��� �Ӽ� ��ü");
	}
}