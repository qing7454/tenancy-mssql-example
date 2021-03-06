package com.netradius.demo.data.repository;

import com.netradius.demo.data.model.User;
import org.springframework.data.querydsl.QueryDslPredicateExecutor;
import org.springframework.data.repository.PagingAndSortingRepository;

import javax.annotation.Nonnull;
import java.util.UUID;

/**
 * @author Kevin Hawkins
 */
public interface UserRepository extends PagingAndSortingRepository<User, UUID>,
		QueryDslPredicateExecutor<User> {

	User findByName(@Nonnull String name);
}
