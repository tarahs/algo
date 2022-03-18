package com.interview.pojo;

public class Developer extends Employee {

	String technology;

	@Override
	public String toString() {
		return "Developer{" +
				"technology='" + technology + '\'' +
				'}';
	}

	@Override
	public boolean equals(Object o) {
		if (this == o) return true;
		if (o == null || getClass() != o.getClass()) return false;

		Developer developer = (Developer) o;

		return technology.equals(developer.technology);
	}

	@Override
	public int hashCode() {
		return technology.hashCode();
	}
}
