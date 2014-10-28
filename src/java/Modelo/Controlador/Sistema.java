
package Modelo.Controlador;

import Modelo.Categoria;
import Modelo.DAO.CatalogoDeCategoria;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Enumeration;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 *
 * @author Nahum
 */
public class Sistema extends HttpServlet {
    /**
     * Processes requests for both HTTP <code>GET</code> and <code>POST</code>
     * methods.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    private void processRequestGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration<String> parametros =  request.getParameterNames();
        RequestDispatcher rd;
        
        if(parametros.hasMoreElements()){
        
        }else{
            request.setAttribute("titulo", ".::Bienvenido::.");
            request.setAttribute("usuario", "Nahúm Gálvez");
            rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
        }
    }
    
    private boolean addCategoria(String nombre, String descripcion){
        boolean hecho = false;
        CatalogoDeCategoria catalogo = new CatalogoDeCategoria();
        if(catalogo.validarNombre(nombre)){
            hecho = catalogo.addCategoria(new Categoria(nombre, descripcion));
        }
        return hecho;
    }
    
    private int buscarPost(Enumeration<String> parametros){
        int numero = -1;
        ArrayList<String> lista = new ArrayList();
        while(parametros.hasMoreElements()){
            lista.add(parametros.nextElement());
        }
        if(lista.contains("frmNewName") && lista.contains("frmNewDesc"))
           numero = 1;
        return numero;
    }
    
    private void processRequestPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        Enumeration<String> parametros =  request.getParameterNames();
        RequestDispatcher rd = null;
        if(parametros.hasMoreElements()){
            switch(buscarPost(parametros)){
                case 1:
                    String nombre = request.getParameter("frmNewName");
                    String desc = request.getParameter("frmNewDesc");
                    if(addCategoria(nombre, desc)){
                        request.setAttribute("usuario", "Logrado");
                        rd = request.getRequestDispatcher("/index.jsp");
                        rd.forward(request, response);
                    }
                break;
            }
        }else{
            request.setAttribute("titulo", ".::Bienvenido::.");
            request.setAttribute("usuario", "Nahúm Gálvez");
            rd = request.getRequestDispatcher("/index.jsp");
            rd.forward(request, response);
        }
    }

    // <editor-fold defaultstate="collapsed" desc="HttpServlet methods. Click on the + sign on the left to edit the code.">
    /**
     * Handles the HTTP <code>GET</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequestGet(request, response);
    }

    /**
     * Handles the HTTP <code>POST</code> method.
     *
     * @param request servlet request
     * @param response servlet response
     * @throws ServletException if a servlet-specific error occurs
     * @throws IOException if an I/O error occurs
     */
    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        processRequestPost(request, response);
    }

    /**
     * Returns a short description of the servlet.
     *
     * @return a String containing servlet description
     */
    @Override
    public String getServletInfo() {
        return "Short description";
    }// </editor-fold>

}