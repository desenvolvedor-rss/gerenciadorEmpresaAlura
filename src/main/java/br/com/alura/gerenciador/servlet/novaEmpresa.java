package br.com.alura.gerenciador.servlet;


import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import br.com.alura.gerenciador.modelo.Banco;
import br.com.alura.gerenciador.modelo.Empresa;

import java.util.*;

//@WebServlet("/novaEmpresa")
public class novaEmpresa extends HttpServlet {
	private static final long serialVersionUID = 1L;

    public novaEmpresa() {
        super();
 
    }

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
			//PARA ENVIAR GET SOMENTE POR FORMULÁRIO, POIS SE INSERIR NA LINHA DÁ ERRO
		
		PrintWriter nova=response.getWriter();
		String s=request.getParameter("nome");
//		nova.println("<h1> A empresa, " +s+ " foi cadastrada com Sucesso!");
//		nova.close();
//		
		String nomeEmpresa = request.getParameter("nome");
		String dataEmpresa = request.getParameter("data");
		
		Date dataAbertura = null;
		try {
			SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
			dataAbertura = sdf.parse(dataEmpresa);
		} catch (ParseException e) {
			throw new ServletException(e);
		}
		
		
		
		Empresa empresa = new Empresa();
		empresa.setNome(nomeEmpresa);
		empresa.setDataAbertura(dataAbertura);
		
		Banco banco = new Banco();
		banco.adiciona(empresa);
//		
		
		response.sendRedirect("listaEmpresas");
//		//Chamar JSP 
//				RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
//				request.setAttribute("empresa", empresa.getNome());
//				rd.forward(request, response);
	}
	
			
//		protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
//			
//			doPost(request, response);
//		
	}


