package com.yash.candidaterestapi.service;

import java.sql.Connection;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.yash.candidaterestapi.dao.CandidateDao;
import com.yash.candidaterestapi.model.Candidate;
import com.yash.candidaterestapi.model.Marks;

public class CandidateService {

	String query;
	Connection connection;

	CandidateDao candidateDao = new CandidateDao();
	ResultSet resultSet = null;
	List<Candidate> candidateList = new ArrayList<Candidate>();
	List<Marks> list = new ArrayList<Marks>();
	public List<Candidate> getAllCandidates() {
		// TODO Auto-generated method stub

		return null;
	}

	public Candidate getCandidate(int candidateId) {

		query = "SELECT * FROM Candidate WHERE CANDIDATE_ID =" + candidateId;
		resultSet = candidateDao.selectCandidate(query);
		Candidate candidate = new Candidate();

		try {
			while (resultSet.next()) {
				
				candidate.setCandidate_id(resultSet.getInt(1));
				candidate.setName(resultSet.getString(2));
				candidate.setCity(resultSet.getString(3));

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return candidate;
	}

	public List<Candidate> getCandidateByCityService(String city) {

		query = "SELECT * FROM CANDIDATE WHERE CITY ='" + city + "'";
		resultSet = candidateDao.selectCandidate(query);
		try {
			while (resultSet.next()) {
				Candidate candidate = new Candidate();
				candidate.setCandidate_id(resultSet.getInt(1));
				candidate.setName(resultSet.getString(2));
				candidate.setCity(resultSet.getString(3));
				candidateList.add(candidate);

			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return candidateList;
	}

	public List<Marks> getCandidateMarksTenth(int standard) {

		query = "SELECT * FROM MARKS WHERE STANDARD = '"+standard+"'";
		resultSet = candidateDao.selectCandidate(query);
		Marks marks =null;
		try {
			while (resultSet.next()) {
								
				marks = new Marks();
				
				marks.setMarks_id(resultSet.getInt(1));
				marks.setCandidate_id(resultSet.getInt(2));
				marks.setStandard(resultSet.getInt(3));
				marks.setGrade(resultSet.getString(4));
					
				list.add(marks);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return list;
	}

}
