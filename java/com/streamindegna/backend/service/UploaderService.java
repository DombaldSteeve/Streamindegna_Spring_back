package com.streamindegna.backend.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.streamindegna.backend.model.Video;
import com.streamindegna.backend.repository.UploaderRepository;

@Service
public class UploaderService {
	
	@Autowired
	private UploaderRepository uploaderRepository;
	
	public List<Video> getVideos() {
		List<Video> videos = new ArrayList<>();
		uploaderRepository.findAll().forEach(video -> { videos.add(video); 
		});
		return videos;
	}

	public Video getVideo(Integer id) {
		return uploaderRepository.findById(id).orElse(null);
	}

	public void deleteVideo(Integer id) {
		uploaderRepository.deleteById(id);
	}

	public void addVideo(Video video) {
		uploaderRepository.save(video);	
	}

	public void updateVideo(Video video, Integer id) {
		uploaderRepository.save(video);
	}

}
