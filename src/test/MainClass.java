/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package test;
import integration.Trapazoidal;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

/**
 *
 * @author VISHAL KUMAR SINGH
 */
public class MainClass {

    public static void main(String[]args)throws IOException{
        System.out.println("Input fn");
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        ExpressionBuilder input= new ExpressionBuilder(reader.readLine());
        System.out.println("entr a");
        double a=Double.parseDouble(reader.readLine());
        System.out.println("entr b");
        double b=Double.parseDouble(reader.readLine());
        System.out.println("precision");
        int n=Integer.parseInt(reader.readLine());
        Expression f = input.variable("x").build();
        System.out.println("trp");
        System.out.println(new Trapazoidal(f,n).evaluateIntegral(a,b));
    }

    }
    

