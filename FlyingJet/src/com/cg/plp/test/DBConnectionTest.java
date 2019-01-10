package com.cg.plp.test;

import static org.junit.jupiter.api.Assertions.*;

import java.io.IOException;
import java.sql.Connection;
import java.sql.SQLException;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.jupiter.api.Test;

import com.cg.plp.dao.IQuoteDAO;
import com.cg.plp.dao.QuoteDAOImpl;
import com.cg.plp.util.DBConnection;


public class DBConnectionTest {
	static IQuoteDAO dao=null;
	static Connection con;
	@BeforeClass
	public static void initialise() {
		dao = new QuoteDAOImpl();
		con=null;
	}
	@Before
	public void beforeEachTest() {
		System.out.println("----Starting DBConnection Test Case----\n");
	}
	
	@Test
	public void testGetConnection() throws IOException, ClassNotFoundException, SQLException{
		
		Connection con = DBConnection.getConnection();
		Assert.assertNotNull(con);
	}
	@After
	public void afterEachTest() {
		System.out.println("----End of DBConnection Test Case----\n");
	}

	@AfterClass
	public static void destroy() {
		System.out.println("\t----End of Tests----");
		dao = null;
		con = null;
	}

}

