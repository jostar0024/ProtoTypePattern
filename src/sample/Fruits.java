package sample;

public class Fruits extends ConcreteFood {
	private String m_name;
	public Fruits(final String name)
	{
		this.m_name = name;
	}
	
	@Override
	public void eat(){
		System.out.println(String.format("%sを生で食べる",m_name));
	}
}
