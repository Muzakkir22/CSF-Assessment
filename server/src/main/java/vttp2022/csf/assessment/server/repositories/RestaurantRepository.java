package vttp2022.csf.assessment.server.repositories;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Query;

import vttp2022.csf.assessment.server.models.Comment;
import vttp2022.csf.assessment.server.models.Restaurant;

public class RestaurantRepository {

	@Autowired
	private MongoTemplate mongoTemplate;

	public List<Restaurant> getRestaurants(int limit, int skip) {
		Query query = (new Query()).limit(limit).skip(skip);
		return(null);
	}

	// TODO Task 2
	// Use this method to retrive a list of cuisines from the restaurant collection
	// You can add any parameters (if any) and the return type 
	// DO NOT CHNAGE THE METHOD'S NAME
	// Write the Mongo native query above for this method
	// Implmementation in here
	//  

	public List<Restaurant> getCuisines(String cuisine) {
		

	}

	// TODO Task 3
	// Use this method to retrive a all restaurants for a particular cuisine
	// You can add any parameters (if any) and the return type 
	// DO NOT CHNAGE THE METHOD'S NAME
	// Write the Mongo native query above for this method
	//  
	// Implmementation in here

	public ??? getRestaurantsByCuisine(???) {
		

	}

	// TODO Task 4
	// Use this method to find a specific restaurant
	// You can add any parameters (if any) 
	// DO NOT CHNAGE THE METHOD'S NAME OR THE RETURN TYPE
	// Write the Mongo native query above for this method
	//  
	// Implmementation in here

	public Optional<Restaurant> getRestaurant(???) {
		
		
	}

	// TODO Task 5
	// Use this method to insert a comment into the restaurant database
	// DO NOT CHNAGE THE METHOD'S NAME OR THE RETURN TYPE
	// Write the Mongo native query above for this method
	//  
	// Implmementation in here

	public void addComment(Comment comment) {
		
		
	}
	
	

}
