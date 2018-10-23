package com.bottega.withdraw;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WithdrawController {


	private WithdrawalCommandHandler withdrawalCommandHandler;

	@PostMapping("/creditCard/{id}")
	public void withdraw(@RequestBody DoWithdrawMoney command) {

		withdrawalCommandHandler.handle(command);

	}

}
