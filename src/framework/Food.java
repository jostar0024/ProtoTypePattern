package framework;

public interface Food extends Cloneable {
	public abstract void eat();
	public abstract Food createCopy();
}
