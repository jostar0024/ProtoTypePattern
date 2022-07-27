package framework;

import java.util.HashMap;
import java.util.Map;

public class Manager {
	private Map<String,Food> showcase = new HashMap<>();
	
	public void register(final String name,final Food prototype) {
		showcase.put(name, prototype);
	}
	
	public Food create(final String prototypeName) {
		final Food food = showcase.get(prototypeName);
		return food.createCopy();
	}
}
