package com.curso.crud.controllers;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.curso.crud.model.Usuario;
import com.curso.crud.repository.UsuarioRepository;

@RestController
public class GreetingsController {
	
	@Autowired
	private UsuarioRepository usuarioRepository;
	
	
 
    //Cadastro de usuario
    @RequestMapping(value = "/usuario/{nome}/idade/{idade}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String salvarUsuario(@PathVariable String nome, @PathVariable int idade) {
    	
    	Usuario usuario = new Usuario();
    	    	   	
    	usuario.setNome(nome);
    	usuario.setIdade(idade);
    	usuarioRepository.save(usuario);
    	  	    	
    	return  usuario.toString();
    }
    
    @RequestMapping(value = "usuario/listar", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public List<Usuario> listarTodosUsuarios(){
    	List<Usuario> usuarios = new ArrayList<>();
    	
    	usuarioRepository.findAll().forEach(usuarios::add);
    	
    	return usuarios;
    }
    
    @RequestMapping(value = "usuario/deletar/{id}", method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.OK)
    public String deletarUsuario(@PathVariable Long id) {
    	usuarioRepository.deleteById(id);
    	
    	return "<h3>Usuario deletado. </h3>";
    }
    
    
}
