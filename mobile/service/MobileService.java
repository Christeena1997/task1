package com.mobile.service;

import java.util.Comparator;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mobile.dao.MobileDao;
import com.mobile.entity.Mobile;

@Service
public class MobileService {
	@Autowired
	MobileDao md;

	public List<Mobile> get(int price) {
		return md.get(price);

	}

	public List<Mobile> getso() {
		return md.getso();
	}

	public Mobile save(Mobile e) {
		// TODO Auto-generated method stub
		return md.save(e);
	}

}
