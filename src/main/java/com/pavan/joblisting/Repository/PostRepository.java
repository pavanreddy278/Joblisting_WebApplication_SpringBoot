package com.pavan.joblisting.Repository;

import org.springframework.data.mongodb.repository.MongoRepository;
//import org.springframework.stereotype.Repository;

import com.pavan.joblisting.Model.Post;

//@Repository
public interface PostRepository extends MongoRepository<Post,String> {

}
