package com.pavan.joblisting.Repository;

import java.util.List;

import com.pavan.joblisting.Model.Post;

public interface SearchRepository {
	

	List<Post> findByText(String text);

}
