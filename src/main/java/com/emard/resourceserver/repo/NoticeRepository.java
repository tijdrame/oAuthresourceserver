package com.emard.resourceserver.repo;

import java.util.List;

import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.emard.resourceserver.model.Notice;


public interface NoticeRepository extends CrudRepository<Notice, Long> {
	
	@Query(value = "from Notice n where CURDATE() BETWEEN noticBegDt AND noticEndDt")
	List<Notice> findAllActiveNotices();

}