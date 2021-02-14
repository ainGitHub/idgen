package com.ainur.fastid.controller;

import com.ainur.fastid.domain.Identity;
import com.ainur.fastid.service.IdentityService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class IdentityController {

  private final IdentityService identityService;

  @Autowired
  public IdentityController(IdentityService identityService) {
    this.identityService = identityService;
  }

  @GetMapping("/")
  public Identity getIdentity() {
    return identityService.generateNextIdentity();
  }
}
