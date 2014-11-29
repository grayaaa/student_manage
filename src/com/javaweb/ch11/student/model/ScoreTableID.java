package com.javaweb.ch11.student.model;

/**
 * CjbId entity. @author MyEclipse Persistence Tools
 */

public class ScoreTableID implements java.io.Serializable {

	// Fields

	private StudentTable xsb;
	private CourseTable kcb;

	// Constructors

	/** default constructor */
	public ScoreTableID() {
	}

	/** full constructor */
	public ScoreTableID(StudentTable xsb, CourseTable kcb) {
		this.xsb = xsb;
		this.kcb = kcb;
	}

	// Property accessors

	public StudentTable getXsb() {
		return this.xsb;
	}

	public void setXsb(StudentTable xsb) {
		this.xsb = xsb;
	}

	public CourseTable getKcb() {
		return this.kcb;
	}

	public void setKcb(CourseTable kcb) {
		this.kcb = kcb;
	}

	public boolean equals(Object other) {
		if ((this == other))
			return true;
		if ((other == null))
			return false;
		if (!(other instanceof ScoreTableID))
			return false;
		ScoreTableID castOther = (ScoreTableID) other;

		return ((this.getXsb() == castOther.getXsb()) || (this.getXsb() != null
				&& castOther.getXsb() != null && this.getXsb().equals(
				castOther.getXsb())))
				&& ((this.getKcb() == castOther.getKcb()) || (this.getKcb() != null
						&& castOther.getKcb() != null && this.getKcb().equals(
						castOther.getKcb())));
	}

	public int hashCode() {
		int result = 17;

		result = 37 * result
				+ (getXsb() == null ? 0 : this.getXsb().hashCode());
		result = 37 * result
				+ (getKcb() == null ? 0 : this.getKcb().hashCode());
		return result;
	}

}