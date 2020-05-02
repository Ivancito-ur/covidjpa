package covidjpa.entities;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import covidjpa.dao.MensajeDao;
import covidjpa.util.Conexion;

public class Prueba {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Mensaje m = new Mensaje();
		m.setName("Prueba");
		m.setEmail("q@gmail.com");
		m.setWebsite("WWW.ho.ac");
		m.setMessage("222222222");
		
		MensajeDao mDao = new MensajeDao();
		
		mDao.insertar(m);
	}

}
