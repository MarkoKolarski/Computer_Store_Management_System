package rs.ac.uns.ftn.db.jdbc.exam.dao.impl;


import java.sql.SQLException;

import rs.ac.uns.ftn.db.jdbc.exam.dao.RacunDAO;
import rs.ac.uns.ftn.db.jdbc.exam.theatre.model.Racun;

public class RacunDAOImpl implements RacunDAO {
	

	@Override
	public int count() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean delete(Racun entity) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int deleteAll() throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

	@Override
	public boolean deleteById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean existsById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Iterable<Racun> findAll() throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Iterable<Racun> findAllById(Iterable<Integer> ids) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Racun findById(Integer id) throws SQLException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean save(Racun entity) throws SQLException {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public int saveAll(Iterable<Racun> entities) throws SQLException {
		// TODO Auto-generated method stub
		return 0;
	}

}
