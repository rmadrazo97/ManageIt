/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Informacion;

import org.hibernate.Session;

/**
 *
 * @author Chino Guzman
 */
public class ClientesHelper {
    
    Session session = null;
    
    public ClientesHelper(){
        this.session = NewHibernateUtil.getSessionFactory().getCurrentSession();
    }
    
    
}
