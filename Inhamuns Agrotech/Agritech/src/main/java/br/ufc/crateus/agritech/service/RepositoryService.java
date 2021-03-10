package br.ufc.crateus.agritech.service;

import java.util.Set;

public interface RepositoryService<E> {
	
	public E add(E e);
	
    public E get(Integer id);
	
    public E update(Integer id, E e);
    
	public boolean delete(Integer id);
	
	public boolean exists(E e);
	
	public Set<E> getAll();
	
}
