package mobileITT.stan;

import java.util.Set;

public class Menu implements IMenu{

	private int width;
	private int height;
	
	private Set<IButton> buttons;
	
	@Override
	public void addMenu() {
		System.out.println("add menu");
		
	}
	@Override
	public void removeMenu() {
		System.out.println("remove menu");
	}
	
	
}
