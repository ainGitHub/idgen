package com.ainur.fastid.service;

import com.ainur.fastid.domain.Identity;
import com.ainur.fastid.repository.IdGenerationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class IdentityServiceImpl implements IdentityService {

  @Autowired
  private IdGenerationRepository idGenerationRepository;

  @Override
  public synchronized Identity generateNextIdentity() {
    return new Identity(idGenerationRepository.getNextId());
  }
}

