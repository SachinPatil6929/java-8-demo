package com.prowings.functional_interface;

@FunctionalInterface
public interface Deletable {
	
	void delete();
	
	default boolean isDeletable() {
		return false;	
	}
	default void print() {
		System.out.println("Deleted Successfully");
	}

}
