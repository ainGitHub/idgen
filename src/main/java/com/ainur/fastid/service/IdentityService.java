package com.ainur.fastid.service;

import com.ainur.fastid.domain.Identity;

/**
 * Сервис для работы с id
 */
public interface IdentityService {

  /**
   * Получение следующего уникального id
   *
   * @return следующее id
   */
  Identity generateNextIdentity();
}
