package org.strategy;

public class Client {

	public static void main(String[] args) {
		Document doc = new Legal();
		doc.setDrawBehavior(new PDF());
		doc.performDraw();
		doc.setDrawBehavior(new Html());
		doc.performDraw();
	}

}
