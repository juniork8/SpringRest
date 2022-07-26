package com.algaworks.algalog.domain.model;

public @interface EqualsAndHashCode {

	public @interface Include {

	}

	boolean onlyExplicitlyIncluded();

}
