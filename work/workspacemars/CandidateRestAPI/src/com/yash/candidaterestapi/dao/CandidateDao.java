package com.yash.candidaterestapi.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import com.yash.candidaterestapi.util.ConnectionProvider;

public class CandidateDao {

	ResultSet resultSet;

	public ResultSet selectCandidate(String query) {

		try {

			Connection connection = ConnectionProvider.getConnection();
			PreparedStatement preparedStatement = connection.prepareStatement(query);

			resultSet = preparedStatement.executeQuery();

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return resultSet;

	}

	

}
