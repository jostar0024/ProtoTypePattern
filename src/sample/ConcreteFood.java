package sample;

import framework.Food;

public class ConcreteFood implements Food {
	@Override
	public void eat(){}
	
	@Override
	public Food createCopy() {
		Food food = null;
		try {
			food = (Food)clone();
		}catch(CloneNotSupportedException e) {
			e.printStackTrace();
		}
		return food;
	}	
}

