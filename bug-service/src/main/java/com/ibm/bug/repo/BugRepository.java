package com.ibm.bug.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ibm.bug.STATUS;
import com.ibm.bug.entity.Bug;

public interface BugRepository extends MongoRepository<Bug, String> {
	
//	@Query("{'title':?0}")
	//List<Bug> findByName(String bugTitle);

	List<Bug> findByStatus(STATUS bugStatus);
	//List<Bug> findByStatusAndTitle(STATUS bugStatus,String bugTitle);

	//Used for only getting name without regular expression
	List<Bug> findByTitleIgnoreCase(String bugName);
	@Query("{status: ?0,title : {$regex : ?1,'$options':'i'}}")
	List<Bug> findByStatusAndTitleIgnoreCase(STATUS bugStatus, String bugTitle);
	//For partial Search
	//List<Bug> findByTitleLike(String title);
	
	//This is for regular expression
	@Query("{title : {$regex : ?0,'$options':'i'}}")
	List<Bug> findByNameIgnoreCase(String bugName);

}
