package com.los.java.web;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;

import com.los.java.domain.Broker;
import com.los.java.domain.BrokerServiceImpl;

@Controller
public class BrokerController {
	@Autowired
	private BrokerServiceImpl service;

	@Autowired
	private HttpSession session;

	@RequestMapping("/broker")
	@ResponseBody
	List<Broker> getBrokerJson() {
		List<Broker> allBrokers = service.displayBrokers();
		// for(Broker broker:allBrokers)
		// {
		// System.out.println("Broker FirstName = "+broker.getbFirstName());
		// System.out.println("Broker LastName = "+broker.getbLastName());
		//
		// }
		return allBrokers;
	}

	@RequestMapping(value = "/login", method = RequestMethod.POST)
	@ResponseBody
	public void loginForm(@RequestBody Broker brokerJson) {

		String username = brokerJson.getbUserName();

		System.out.println("UserName = "+username);

		String password = brokerJson.getbPassword();

		System.out.println("Password = "+password);

		Broker broker = service.retrieveBroker(username, password);
		session.setAttribute("Broker", broker);

		System.out.println("Broker 2 = " + broker.getbFirstName() + "   " + broker.getbLastName());

		if (broker.equals(null)) {
			
			System.out.println("Was here");
			throw new RuntimeException();
			
		}

	}

	@RequestMapping(value = "/signup", method = RequestMethod.POST)
	@ResponseBody
	public void signUpSave(@RequestBody Broker broker1) {

		service.insertBroker(broker1);

		System.out.println("Broker from signup Post = " + broker1.getbFirstName());
		System.out.println("Broker from signup Post = " + broker1.getbLastName());
	}

}
