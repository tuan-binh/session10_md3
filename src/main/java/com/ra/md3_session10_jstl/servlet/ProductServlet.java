package com.ra.md3_session10_jstl.servlet;

import javax.servlet.ServletException;
import javax.servlet.annotation.MultipartConfig;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.Part;
import java.io.File;
import java.io.IOException;

@WebServlet(name = "ProductServlet", value = "/product-servlet")
@MultipartConfig(
		  fileSizeThreshold = 1024 * 1024,
		  maxFileSize = 1024 * 1024 * 5,
		  maxRequestSize = 1024 * 1024 * 25
)
public class ProductServlet extends HttpServlet
{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		req.getRequestDispatcher("/product/add_product.jsp").forward(req, resp);
	}
	
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException
	{
		
		String pathUpload = req.getServletContext().getRealPath("/upload/");
		File fileUpload = new File(pathUpload);
		if (!fileUpload.exists())
		{
			fileUpload.mkdir();
		}
		Part part = req.getPart("image");
		String fileName = part.getSubmittedFileName();
		try
		{
			part.write(fileUpload + File.separator + fileName);
		}
		catch (IOException e)
		{
			e.printStackTrace();
		}
		
		req.setAttribute("image", "/upload/"+fileName);
		req.getRequestDispatcher("/product/product_result.jsp").forward(req, resp);
	}
}
