package com.example.demo;

import org.springframework.data.repository.CrudRepository;

public interface TweetMessageRepository extends CrudRepository<TweetMessage, Long> {
}
