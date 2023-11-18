package com.mobile.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.mobile.entity.Mobile;
import com.mobile.repository.MobileRepository;

@Repository
public class MobileDao {
	@Autowired
	MobileRepository mr;

	public List<Mobile> get(int price) {
		return mr.findAll();

	}

	public List<Mobile> getDetails() {

		return mr.findAll();
	}

	public List<Mobile> getso() {
		// TODO Auto-generated method stub
		return mr.findAll();
	}

	public Mobile save(Mobile e) {

		return mr.save(e);
	}

}
