package com.streamindegna.backend.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.streamindegna.backend.model.Video;
import com.streamindegna.backend.service.UploaderService;

@RestController
public class UploaderController {
	
	@Autowired
	private UploaderService videoService;
	
	@RequestMapping(method = RequestMethod.GET, value = "/videos")
	public List<Video> getVideo() {
		return videoService.getVideos();
	}
	
	@RequestMapping(method = RequestMethod.GET, value = "/video/{id}")
	public Video getVideo(@PathVariable Integer id) {
		return videoService.getVideo(id);
	}
	
	@RequestMapping(method = RequestMethod.DELETE, value = "/video/{id}")
	public void deleteVideo(@PathVariable Integer id) {
		videoService.deleteVideo(id);
	}
	
	@RequestMapping(method = RequestMethod.POST, value = "/videos")
	public void addVideo(@RequestBody Video video) {
		videoService.addVideo(video);
	}
	
	 @RequestMapping(method = RequestMethod.PUT, value ="/video/{id}")
	public void updateVideo(@RequestBody Video video, @PathVariable Integer id) {
		videoService.updateVideo(video, id);
	}
	
}
