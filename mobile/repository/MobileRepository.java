package com.mobile.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import com.mobile.entity.Mobile;

public interface MobileRepository extends JpaRepository<Mobile, Integer> {
	

}
