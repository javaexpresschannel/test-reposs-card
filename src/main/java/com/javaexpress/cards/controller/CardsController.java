/**
 * 
 */
package com.javaexpress.cards.controller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.javaexpress.cards.config.CardsServiceConfig;
import com.javaexpress.cards.model.Cards;
import com.javaexpress.cards.model.Customer;
import com.javaexpress.cards.repository.CardsRepository;
import com.javaexpress.cards.response.PropertiesBo;

@RestController
public class CardsController {

	private static final Logger logger = LoggerFactory.getLogger(CardsController.class);
	
	@Autowired
	private CardsRepository cardsRepository;
	
	@Autowired
	private CardsServiceConfig cardsServiceConfig;

	@PostMapping("/myCards")
	public List<Cards> getCardDetails(@RequestBody Customer customer) {
		logger.info("getCardDetails() method started in Cards Microservice");
		
		List<Cards> cards = cardsRepository.findByCustomerId(customer.getCustomerId());
		if (cards != null) {
			return cards;
		} else {
			return null;
		}

	}
	
	
	@GetMapping("/cards/properties")
	public PropertiesBo getPropertyDetails() {
		PropertiesBo response = new PropertiesBo(cardsServiceConfig.getMsg(),
				cardsServiceConfig.getBuildVersion(),
				cardsServiceConfig.getMailDetails(),
				cardsServiceConfig.getActiveBranches());
		return response;
	}
	

}
