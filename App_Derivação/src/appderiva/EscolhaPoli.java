/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package appderiva;

/**
 *
 * @author user
 */
public class EscolhaPoli {
   private String poli = "" ;
   private String deriv = "";

   
   // parte de gera��o de polinomios:  
    public void setQuant(int n){
     
       int qt [] = new int[n];
       int sp [] = new int [n];
       int quantos = n;
       String formula = "";
        int sup, index;
        
      while (!formula.contains("x")) {  
       for(int c = 0; c<quantos;c++){
            sup = (int) (Math.random()*(5-1));
            index =(int)(Math.random()*(21-1));
            if (quantos == 1 && sup== 0){
                    formula = " ";
                }else if(sup == 0 && index > 0){
                    formula =  formula +" +"+index;
                }else if(sup == 0 && index<0){
                    formula =  formula + index;
                }else if(sup == 1&& index>0){
                   formula+=" +"+index + "x"; 
                }else if (sup == 1 && index<0){
                   formula+= index + "x";  
                }else if (index == 0){
                   formula += " ";
                }else if (index >0){
                   formula += " +"+index + "x<sup>" + sup+"</sup>" ; 
                }else{
                    formula+= index + "x<sup>"+sup+"</sup>";
                }
            qt[c] = index;
            sp[c] = sup;
   
        }
  
      }
       poli = formula;
       // fim da gera��o de polinomios:

       //derivando a primeira equa��o:
   
        int are [] = new int[qt.length];
        int sop [] = new int [sp.length];
        for (int c = 0; c< qt.length;c++){
        are[c] = qt[c] * sp[c];
        }
        for (int l = 0; l<sp.length;l++){
        sop[l] = sp[l]-1;
        }
        //montando a equa��o derivada
        String intermed = "";
        for (int h = 0;h<qt.length;h++){
        if (are[h] == 0){
           intermed += " ";
        }else if (sop[h] == 0 && are[h]>0){
           intermed += " +"+are[h]+ " ";
        }else if (sop[h] == 0 && are[h]<0){
           intermed += are[h]+ " ";
        }else if (sop[h] == 1 && are[h]>0){
           intermed += " +"+are[h]+ "x ";
        }else if (sop[h] == 1 && are [h]<0){
           intermed += are[h]+ "x ";
        }else if(are[h]<0) {
           intermed += are[h]+ "x<sup>"+sop[h]+"</sup> ";
        }else if (are[h]>0){
           intermed += " +"+are[h]+ "x<sup>"+sop[h]+"</sup> ";
        }
        }
        deriv = intermed;
    }
        // fim da deriva��o 1
   


public String getForm(){
    return poli;
}

public String getDerivada(){
    return deriv;
}

}
