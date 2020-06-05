package model.dao;

import db.DB;
import model.dao.impl.sellerDaoJDBC;

public class DaoFactory {

	public static SellerDao createSellerDao() {
	
		return (SellerDao) new sellerDaoJDBC(DB.getConnection());
		
	}
}
