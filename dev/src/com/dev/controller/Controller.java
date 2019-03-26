package com.dev.controller;

import java.io.*;
import javax.servlet.*;
import javax.servlet.http.*;

public interface Controller {
	public void execute(HttpServletRequest resquest, HttpServletResponse response) throws ServletException, IOException;

}
