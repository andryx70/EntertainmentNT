package com.andry.entertainmentnt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import com.andry.entertainmentnt.db.DateBase;
import java.util.ArrayList;

import com.andry.entertainmentnt.db.IDBConnection;
import com.andry.entertainmentnt.model.Movie;

public interface MovieDAO extends IDBConnection {
	
	default Movie setMovieViewed(Movie movie) {
		return movie;
	}
	
	default ArrayList<Movie> read(){
		ArrayList<Movie> movie = new ArrayList<>();
		try(Connection connection = connectToDB()){
			String query = "SELECT * FROM " + TMOVIE;
			PreparedStatement preparedStatement = connection.prepareStatement(query);
			ResultSet rs = preparedStatement.executeQuery();
			
			while (rs.next()) {
				 Movie movie = new Movie(
						 rs.getString(TMOVIE_TITLE),
						 rs.getString(TMOVIE_GENRE),
						 rs.getString(TMOVIE_CREATOR),
						 Integer.valueOf(rs.getString(TMOVIE_YEAR)));
				 
				 movie.setId(Integer.valueOf(rs.getString(TMOVIE_ID)));
				 movies.add(movie);
			}
		}catch (SQLException e) {
			// TODO: handle exception
		}
		return movie;
	}
	
	private boolean getMovieViewed() {
		return false;
	}
}
