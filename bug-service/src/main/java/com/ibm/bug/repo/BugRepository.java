package com.ibm.bug.repo;

import java.util.List;
import java.util.Optional;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;

import com.ibm.bug.STATUS;
import com.ibm.bug.entity.Bug;

public interface BugRepository extends MongoRepository<Bug, String> {
	
	//@Query("{'title':?0}")
	//Optional<Bug> findByTitle(String bugTitle);

	List<Bug> findByStatus(STATUS bugStatus);

	//List<Bug> findByStatusAndTitle(STATUS bugStatus,String bugTitle);
	List<Bug> findByStatusAndTitleIgnoreCase(STATUS bugStatus,String bugTitle);
	
	//without @Query	//was Optional<Bug>
	List<Bug> findByTitleIgnoreCase(String bugName);
	
	//with @Query
	@Query("{title : {$regex : ?0,'$options':'i'}}")
	List<Bug> findByNameIgnoreCase(String bugName);

	

	//@Query("{'title':?0}")
	//List<Bug> findByTitleIgnoreCase(String bugName);

}
