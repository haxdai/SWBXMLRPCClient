/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package org.semanticwb.xmlrpc;

/**
 *
 * @author victor.lorenzana
 */
public class ServerException extends Exception
{
    private int code;
    private String html;
    public ServerException(String message,int code,String html)
    {
        super(message);
        this.html=html;
        this.code=code;
        
    }
    public int getCode()
    {
        return code;
    }
    public String getHtml()
    {
        return html;
    }             
    
}
