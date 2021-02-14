package com.ainur.fastid.domain;

/**
 * DTO для id
 */
public class Identity {

  private Long id;

  public Identity() {
  }

  public Identity(Long id) {
    this.id = id;
  }

  public Long getId() {
    return id;
  }

  public void setId(Long id) {
    this.id = id;
  }
}
