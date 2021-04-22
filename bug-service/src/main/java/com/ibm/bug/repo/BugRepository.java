package com.ibm.bug.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;


import com.ibm.bug.STATUS;
import com.ibm.bug.entity.Bug;

public interface BugRepository extends MongoRepository<Bug, String> {
	
	//@Query("{'title':?0}")
	Optional<Bug> findByTitle(String bugTitle);

	List<Bug> findByStatus(STATUS bugStatus);
	List<Bug> findByStatusAndTitle(STATUS bugStatus,String bugTitle);

//	@Query("{'title':?0}")
	//List<Bug> findByTitleIgnoreCase(String bugName);

}
