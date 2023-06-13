package com.foodDeliverySystem.designPatterns;

import com.foodDeliverySystem.designPatterns.template.*;
import com.foodDeliverySystem.designPatterns.template.dto.UserType;

public class TemplateMethodDesignPattern {
	
	public static void main(String[] args) {
		 Client client = new Client();
		 client.submitApplication(UserType.CLIENT.name());
	     System.out.println();
	      
	     DeliveryAgent deliveryAgent = new DeliveryAgent();
	     deliveryAgent.submitApplication(UserType.DELIVERY_AGENT.name());
	     System.out.println();
	     
	     CustomerServiceAgent customerServiceAgent = new CustomerServiceAgent();
	     customerServiceAgent.submitApplication(UserType.CUSTOMER_SERVICE_AGENT.name());
	     System.out.println();

	}

}
