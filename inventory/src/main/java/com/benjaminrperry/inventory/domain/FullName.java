package com.benjaminrperry.inventory.domain;

import lombok.Data;

import javax.persistence.Embeddable;

@Embeddable
@Data
public class FullName {
    private String firstName;
    private String lastName;
}
