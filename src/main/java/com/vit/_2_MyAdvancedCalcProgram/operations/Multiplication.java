package com.vit._2_MyAdvancedCalcProgram.operations;

public class Multiplication extends AbstractBaseOperation{

    private Integer[] arr;
    private final String  operationName="Multiplication";

    public Multiplication(Integer... arr){
        this.arr = arr;
    }

    public void multiplication(){
        int temp = 1;
        for(int i=0;i<arr.length;i++) {
            temp = arr[i] * temp;
        }
        super.setResult(temp);
        super.showResult(operationName);
    }

}
