/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author zeuss
 */
public class Metodos {
    public String calcular(int n)
        {
        String r;
            if(n>0)
                {
                    r = "Positivo";
                }
                else
{
                if(n==0)
                    {
                        r = "Neutro";
                    }
                    else
                        {
                            r = "Negativo";
                        }
}
            return r;
        }

}
