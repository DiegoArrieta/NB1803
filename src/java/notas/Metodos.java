/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

/**
 *
 * @author zeuss
 */
public class Metodos {
    public float calcular_promedio(float a, float b, float c, float d)
    {
    float n1, n2, n3, n4, prom;
    n1 = (float) (a*0.20);
    n2 = (float) (b*0.25);
    n3 = (float) (c*0.25);
    n4 = (float) (d*0.30);
    prom = a*0.20f + b*0.25f + c*0.25f + d*0.30f;
    return prom;
    }
    
}
