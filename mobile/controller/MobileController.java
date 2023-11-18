package com.mobile.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;


import com.mobile.entity.Mobile;
import com.mobile.service.MobileService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class MobileController {
	@Autowired
	MobileService ms;

	@GetMapping(value = "getvalue/{price}")
	public List<Mobile> get(@PathVariable int price) {

		return ms.get(price);
	}

	@GetMapping(value = "getsort")
	public List<Mobile> getso() {
		return ms.getso();
	}
	@PostMapping(value = "setdata")
	public Mobile save(@RequestBody Mobile e) {
		return ms.save(e);
}
}
