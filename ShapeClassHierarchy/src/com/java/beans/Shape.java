package com.java.beans;

public abstract class Shape {
		private String color;
		private int id;
		private static int cnt;
		static {
			cnt=1;
		}
		public Shape() {
			super();
			// TODO Auto-generated constructor stub
			id=cnt++;
		}

		public Shape(String color) {
			super();
			this.color = color;
			id=cnt++;
		}
		
		public int getId() {
			return id;
		}

		public void setId(int id) {
			this.id = id;
		}

		public String getColor() {
			return color;
		}
		public void setColor(String c) {
			this.color=c;
		}

		@Override
		public String toString() {
			return "Shape [color=" + color + "]";
		}

		public abstract int calculateArea();

		public abstract int calculatePerimeter();
}
