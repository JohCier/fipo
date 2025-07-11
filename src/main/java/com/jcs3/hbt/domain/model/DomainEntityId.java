package com.jcs3.hbt.domain.model;

import java.util.Objects;

public abstract class DomainEntityId {

  private final String id;

  protected DomainEntityId(String id) {
    this.id = id;
  }

  public String value() {
    return id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DomainEntityId that = (DomainEntityId) o;
    return Objects.equals(id, that.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    return id;
  }

}
