package com.cdrates.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cdrates.exp.InvalidZipCodeException;
import com.cdrates.models.CdRateChart;
import com.cdrates.service.CdRatesService;

@RestController
@RequestMapping("/v3")
public class CdRatesController {

	@Autowired
	private CdRatesService cdRatesService;

	@GetMapping("/customer/cdRateChart/{zipCode}")
	public List<CdRateChart> getActiveCdRates(@PathVariable String zipCode) {

		if (zipCode.length() == 5) {
			return cdRatesService.getActiveCdRates(zipCode);
		} else {
			throw new InvalidZipCodeException("Invalid Zipcode");
		}

	}

	@GetMapping("/customer/cdHistoryRateChart/{zipCode}")
	public List<CdRateChart> getCdHistoryRateChart(@PathVariable String zipCode) {

		if (zipCode.length() == 5) {
			return cdRatesService.getActiveCdRates(zipCode);
		} else {
			throw new InvalidZipCodeException("Invalid Zipcode");
		}
	}

	@GetMapping(value = "/manager/cdRateChart/{zipCode}")
	public List<CdRateChart> getActiveManagerCDRates(@PathVariable("zipCode") String zipCode) {
		if (zipCode.length() == 5) {
			return cdRatesService.getActiveManagerCDRates(zipCode);
		} else {
			throw new InvalidZipCodeException("Invalid Zipcode");
		}
	}

	@GetMapping(value = "/manager/cdHistoryRateChart/{zipCode}")
	public List<CdRateChart> getActiveManagerHistoryCDRates(@PathVariable("zipCode") String zipCode) {
		if (zipCode.length() == 5) {
			return cdRatesService.getActiveManagerCDRates(zipCode);
		} else {
			throw new InvalidZipCodeException("Invalid Zipcode");
		}
	}

}
