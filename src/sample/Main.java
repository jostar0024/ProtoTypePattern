package sample;
import framework.Food;
import framework.Manager;

public class Main {
	public static void main(String[] args) {
		final Manager manager = new Manager();
		final Fish fish = new Fish("さば");
		final Fruits fruits = new Fruits("リンゴ");
		
		//登録
		manager.register("saba", fish);
		manager.register("apple", fruits);
		
		//生成と使用
		final Food food = manager.create("saba");
		food.eat();
		
		final Food food2 = manager.create("apple");
		food2.eat();
		
	}

}
