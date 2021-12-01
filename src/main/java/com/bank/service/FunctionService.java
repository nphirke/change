package com.bank.service;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.stereotype.Service;

import com.bank.dto.Functions;

@Service
public class FunctionService {
	public List<Functions> getAllFunctions() {
		List<Functions> list = new ArrayList<>();
		Functions f1 = new Functions("Send Payment", "Deposit");
		Functions f2 = new Functions("Withdraw Payment", "Withdraw");
		return list;

	}
}
