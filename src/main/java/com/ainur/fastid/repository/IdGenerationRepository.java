package com.ainur.fastid.repository;

/**
 * Репозиторий для получения ид
 */
public interface IdGenerationRepository {

  /**
   * Получение следующего ид
   *
   * @return следующее ид
   */
  Long getNextId();
}
