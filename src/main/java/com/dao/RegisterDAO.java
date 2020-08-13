package com.dao;

import com.model.Register;

import java.util.List;

/**
 * Interface for our Data Access Object to handle database queries related to Register.
 */
public interface RegisterDAO {
    
    public List<Register> getAllRegisters();
    public List<Register> getRegistersByid1(int id1);
    public List<Register> getRegistersByname1(String name1);
    public List<Register> getRegistersByid2(int id2);
    public List<Register> getRegistersByname2(String name2);
	
	public boolean addRegister(Register Register);
	public boolean updateRegister(Register Register);
	//public boolean deleteRegister(Register Register);
}
