package Ptes;

import metier.Metierlmpl;
import dao.Daolmpl;
import ext.DaoImpl2;
public class Presentation {
	public static void main (String[] args) {
		DaoImpl2 dao=new DaoImpl2();
		
		Metierlmpl metier=new Metierlmpl();
		metier.setDao(dao);
		System. out.println(" Résulatst = "+ metier.calcul()) ;
		}
	}
