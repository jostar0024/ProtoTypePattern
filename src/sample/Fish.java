package sample;

public class Fish extends ConcreteFood {
	private String m_name;
	public Fish(final String name)
	{
		this.m_name = name;
	}
	
	@Override
	public void eat(){
		System.out.println(String.format("%sを焼いて食べる",m_name));
	}
}
