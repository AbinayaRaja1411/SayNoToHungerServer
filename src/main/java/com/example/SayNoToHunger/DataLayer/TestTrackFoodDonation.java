package com.example.SayNoToHunger.DataLayer;

import java.util.Date;

import org.springframework.stereotype.Repository;

import com.example.SayNoToHunger.DataLayer.InterfacesDL.ITestTrackFoodDonationDL;
import com.example.SayNoToHunger.Model.TestFoodDonationStatus;

@Repository
public class TestTrackFoodDonation implements ITestTrackFoodDonationDL {
	public TestFoodDonationStatus[] testDataLayerMethod() {
		//Database connections
		TestFoodDonationStatus[] result = new TestFoodDonationStatus[] {
				new TestFoodDonationStatus() {{
					Action = "Food offering placed";
					LastUpdatedOn = new Date();
				}},
				new TestFoodDonationStatus() {{
					Action = "Food offering placed";
					LastUpdatedOn = new Date();
				}}
				};
		return result;
	}

}
