package com.task.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.task.demo.model.Request;
import com.task.demo.service.RequestService;

@RestController
@RequestMapping("/api/")
public class RequestController {

	@Autowired
	private RequestService requestService;

	@PostMapping("/requests")
	public Request createRequest(@RequestBody Request request) {
		return requestService.createRequest(request);
	}
	

	@PutMapping("/{id}/requests")
	public Request updateRequest(@PathVariable Long id, @RequestBody Request updatedRequest) {
		return requestService.updateRequest(id, updatedRequest);
	}

	@GetMapping("/{id}/requests")
	public Request retrieveRequest(@PathVariable Long id) {
		return requestService.getRequest(id);
	}
	
	
	@DeleteMapping("/{id}/requests")
	public ResponseEntity<String> deleteRequest(@PathVariable Long id) {		
		requestService.deleteByID(id);
		return ResponseEntity.ok("This Requested ID: "+ id +" was deleted");
		
	}
	
	
	
	

}