package com.koreait.first.db;

import java.sql.Connection;
import java.sql.SQLException;

public class DatabaseTest {

	public static void main(String[] args) {
		Connection con = DbUtils.getCon();
		DbUtils.close(con);
	}

}
