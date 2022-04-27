package com.streamindegna.backend.repository;

import org.springframework.data.repository.CrudRepository;

import com.streamindegna.backend.model.Video;

public interface UploaderRepository extends CrudRepository<Video, Integer> {

}
