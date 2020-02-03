package org.com.aop.services;

import org.com.aop.dto.Circle;
import org.com.aop.dto.Triangle;

public class AopService {
	private Triangle triangle;
	private Circle circle;
	
	public Triangle getTriangle() {
		return triangle;
	}
	public void setTriangle(Triangle triangle) {
		this.triangle = triangle;
	}
	public Circle getCircle() {
		return circle;
	}
	public void setCircle(Circle circle) {
		this.circle = circle;
	}
}
