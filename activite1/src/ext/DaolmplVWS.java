package ext;

import dao.IDao;

public class DaolmplVWS implements IDao{
	
	@Override
	public double getData() {
		System. out.println("Version Web Service") ;
		double temp=90;
		return temp;
	}

}
