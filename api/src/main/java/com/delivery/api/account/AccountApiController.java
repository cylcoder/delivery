package com.delivery.api.account;

import com.delivery.db.account.Account;
import com.delivery.db.account.AccountRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/accounts")
public class AccountApiController {

  private final AccountRepository accountRepository;

  @GetMapping
  public void save() {
    Account account = Account.builder().build();
    accountRepository.save(account);
  }

}
