package com.task.demo.service;

import java.util.Optional;

import javax.management.RuntimeErrorException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.task.demo.model.Request;
import com.task.demo.repository.RequestRepository;

@Service
public class RequestService {

	@Autowired
	private RequestRepository requestRepository;

	public Request createRequest(Request request) {
		request.setCreateDate(java.time.LocalDateTime.now()); // Setting the creation date
		request.setModifiedDate(java.time.LocalDateTime.now());
		Request re = requestRepository.save(request);
		return re;
	}

	public Request updateRequest(Long id, Request request) {

		Optional<Request> req = requestRepository.findById(id);

		Request re = new Request();
		re = req.get();
		re.setStatus(request.getStatus());
		Request rf = requestRepository.save(re);

		return rf;
	}

	public Request getRequest(Long id) {

		Optional<Request> req = requestRepository.findById(id);
		Request re = new Request();
		re = req.get();
		return re;
	}

	public void deleteByID(Long id) {
		// TODO Auto-generated method stub
		if(requestRepository.existsById(id))
		{
			requestRepository.deleteById(id);
			}
		else {
			throw new RuntimeException("This id not found in the database");
		}		
	}

}
