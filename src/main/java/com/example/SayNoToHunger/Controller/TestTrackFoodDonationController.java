package com.example.SayNoToHunger.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.SayNoToHunger.Model.TestFoodDonationStatus;
import com.example.SayNoToHunger.ServiceLayer.InterfacesSL.ITestTrackFoodDonationSL;

@RestController
public class TestTrackFoodDonationController {

	@Autowired
	ITestTrackFoodDonationSL testTrackFoodDonationService;
	
	@RequestMapping("/test")
    TestFoodDonationStatus[] hello() {
		
        return testTrackFoodDonationService.testServiceLayerMethod();
    }
	
}
