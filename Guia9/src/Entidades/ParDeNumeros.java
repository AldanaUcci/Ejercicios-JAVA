/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Entidades;

/**
 *
 * @author AldiLee
 */
public class ParDeNumeros {
    private Integer num1;
    private Integer num2;

    public ParDeNumeros() {
        this.num1 = (int) (Math.random() * (20)-10);
        this.num2 = (int) (Math.random() * (20)-10);
                
    }

    public Integer getNum1() {
        return num1;
    }

    public void setNum1(Integer num1) {
        this.num1 = num1;
    }

    public Integer getNum2() {
        return num2;
    }

    public void setNum2(Integer num2) {
        this.num2 = num2;
    }

 
    
}