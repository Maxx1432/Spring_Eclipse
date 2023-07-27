package com.maxx.spring.DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import javax.sql.DataSource;

import com.maxx.spring.model.Users;

import jakarta.validation.Valid;

public class AppDAOImpl implements AppDAO {

	private DataSource dataSource;

	public AppDAOImpl(DataSource dataSource) {
		this.dataSource = dataSource;
	}

	@Override
	public List<Users> listUserss() {
		String SQL = "Select * from uses";
		List<Users> listUsers = new ArrayList<Users>();
		Connection conn = null;
		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(SQL);
			ResultSet rs = ps.executeQuery();
			while (rs.next()) {
				Users temp = new Users(rs.getInt("user_id"), rs.getString("username"), rs.getString("email"));
				listUsers.add(temp);
			}
			rs.close();
			ps.close();
			return listUsers;

		} catch (Exception e) {
			e.printStackTrace();
			return null;
		} finally {
			if (conn != null)
				try {
					conn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
		}

	}

	@Override
	public void addUsers(Users userss) {

		String SQL = "INSERT INTO uses" + "(username,email) VALUES(?, ?)";

		Connection conn = null;

		try {
			conn = dataSource.getConnection();
			PreparedStatement ps = conn.prepareStatement(SQL);
			ps.setString(1, userss.getName());
			ps.setString(2, userss.getEmail());
			System.out.println(ps.execute());

			ps.close();
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			if (conn != null) {
				try {
					conn.close();
				} catch (Exception e2) {
					e2.printStackTrace();
				}
			}
		}
	}

}
