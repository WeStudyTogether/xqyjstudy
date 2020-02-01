package com.java21days;

import java.awt.Point;

public class Box2 {
	int x1 = 0;
	int y1 = 0;
	int x2 = 0;
	int y2 = 0;

	Box2(int x1, int y1, int x2,int y2){
		this.x1 = x1;
		this.y1 = y1;
		this.x2 = x2;
		this.y2 = y2;
	}
	
	Box2(Point topLeft,Point bottomRight){
		this(topLeft.x, topLeft.y,bottomRight.x,
				bottomRight.y);
	}

	 Box2(Point topLeft, int w,int h){
		 this(topLeft.x, topLeft.y,topLeft.x+ w,
				 topLeft.y +h);
	 }
	 
}