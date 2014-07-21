/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package tela.util;

import java.security.NoSuchAlgorithmException;

/**
 *
 * @author Acer
 */
public interface Criptografia{

    String encrypt(String value) throws NoSuchAlgorithmException;

}
