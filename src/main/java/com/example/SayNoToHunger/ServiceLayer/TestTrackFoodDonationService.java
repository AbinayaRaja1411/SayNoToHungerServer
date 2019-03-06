package com.example.SayNoToHunger.ServiceLayer;

import org.springframework.stereotype.Service;
import org.springframework.beans.factory.annotation.Autowired;

import com.example.SayNoToHunger.DataLayer.InterfacesDL.ITestTrackFoodDonationDL;
import com.example.SayNoToHunger.Model.TestFoodDonationStatus;
import com.example.SayNoToHunger.ServiceLayer.InterfacesSL.ITestTrackFoodDonationSL;

@Service
public class TestTrackFoodDonationService implements ITestTrackFoodDonationSL {

	@Autowired
	ITestTrackFoodDonationDL testTrackFoodDonationDL;
	public TestFoodDonationStatus[] testServiceLayerMethod() {
		//Business logic & calls to DL
		return testTrackFoodDonationDL.testDataLayerMethod();
	}
}
