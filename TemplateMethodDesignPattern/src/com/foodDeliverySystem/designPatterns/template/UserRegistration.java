package com.foodDeliverySystem.designPatterns.template;

abstract class UserRegistration {
		
	public abstract void captureFoodPreferences();
	
	public abstract void captureLisenceDetails();
	
	public abstract void captureEducationDetails();
	
	public final void capturePersonalDetails() {
		System.out.println("Personal details registered.. ");
	}
	
    public final String submitApplication(String userType)
    {
        try
        {
            System.out.println("Submitting Application of " + userType);
            
            if ("CLIENT".equalsIgnoreCase(userType)) {
            	capturePersonalDetails();
            	captureFoodPreferences();
            	
            } else if ("DELIVERY_AGENT".equalsIgnoreCase(userType)) {
            	capturePersonalDetails();
            	captureLisenceDetails();
            	
            } else if ("CUSTOMER_SERVICE_AGENT".equalsIgnoreCase(userType)) {
            	capturePersonalDetails();
            	captureEducationDetails();
            	
            } else {
            	System.out.println("Ivalid userType " + userType);
            	return "APPLICATION_SUBMISSION_FAILED";
            }
            
            System.out.println("Application submitted successfully for " + userType);
            return "APPLICATION_SUBMITTED";
        }
        catch (Exception e)
        {
            System.out.println("Error trying to submit application of " + userType);
            return "APPLICATION_ERROR";
        }
        
    }
    
}
