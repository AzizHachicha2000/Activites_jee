package dao;

public class Daolmpl implements IDao{
	
	@Override
	public double getData() {
		System.out.println("versionn base de données");
		double temp=Math.random()*40;
		return temp;
	}
}
