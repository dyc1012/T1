package com.ts.web.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

import com.ts.entity.Account;

public class LoginController extends AbstractController
{

	private String formView;
	private String successView;

	public String getFormView()
	{
		return formView;
	}

	public void setFormView(String formView)
	{
		this.formView = formView;
	}

	public String getSuccessView()
	{
		return successView;
	}

	public void setSuccessView(String successView)
	{
		this.successView = successView;
	}

	@Override
	protected ModelAndView handleRequestInternal(HttpServletRequest request,
			HttpServletResponse response) throws Exception
	{
		String cardNo = request.getParameter("cardNo");
		String password = request.getParameter("password");
		Account account = this.getAccount(cardNo, password);
		Map<String, Object> model = new HashMap<String, Object>();

		if (account != null)
		{
			model.put("account", account);
			return new ModelAndView(this.getSuccessView(), model);
		}
		else
		{
			model.put("error", "cardNo or password error!");
			return new ModelAndView(this.getFormView(), model);
		}
	}

	public Account getAccount(String cardNo, String password)
	{
		if ("123".equals(cardNo) && "123".equals(password))
		{
			Account account = new Account();
			account.setCardNo(cardNo);
			account.setPassword(password);
			account.setBalance(88.8f);
			return account;
		}

		return null;
	}

}
