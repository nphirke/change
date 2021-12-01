package com.bank.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bank.dto.Functions;
import com.bank.service.FunctionService;

@RestController
public class FinController {
	@Autowired
	FunctionService functionService;

	@GetMapping(path = "/", produces = "application/json")
	public List<Functions> getFunctions() {
		return functionService.getAllFunctions();
	}
}
