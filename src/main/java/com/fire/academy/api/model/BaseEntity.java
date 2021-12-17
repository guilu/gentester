package com.fire.academy.api.model;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Base class to derive entity classes from.
 *
 * @author diegobarrioh
 */
@MappedSuperclass
public class BaseEntity implements Serializable {

    private static final long serialVersionUID = 1234L;

    @GeneratedValue
    @Id
    private Long id;

    /**
     * public constructor to avoid
     */
    public BaseEntity() {
        //PUBLIC CONSTRUCTIOR TO AVOID
    }

    public static long getSerialVersionUID() {
        return serialVersionUID;
    }

    /**
     * Returns the identifier of the entity.
     *
     * @return the id
     */
    public Long getId() {
        return this.id;
    }

    public void setId(long id) {
        this.id = id;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass())  return false;
        BaseEntity that = (BaseEntity) o;
        return Objects.equals(id, that.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}

