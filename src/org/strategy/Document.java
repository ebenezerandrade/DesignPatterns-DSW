package org.strategy;

public abstract class Document {

	protected DrawBehavior drawBehavior;
	protected String text;
	
	public void performDraw() {
		drawBehavior.draw();
	}
	
	public void setDrawBehavior(DrawBehavior drawBehavior) {
		this.drawBehavior = drawBehavior;
	}
	
	public String getText() {
		return this.text;
	}
	
	public void addText(String text) {
		this.text += text;
	}
}
