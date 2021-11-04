package com.renatodavis.controller;
import java.util.List;

import com.renatodavis.model.*;

public interface IPessoaDAO {
	
	public void save(Pessoa pessoa);
	public Pessoa getPessoaById(int id);
	public void updatePessoa(Pessoa pessoa);
	public void deletePessoa(int id);
	public List<Pessoa> getAllPessoa(); 		
}

