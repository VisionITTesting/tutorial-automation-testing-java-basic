package com.vit._2_MyAdvancedCalcProgram.operations;

public class Subtraction extends AbstractBaseOperation{

    private Integer[] arr;
    private final String  operationName="Sub";

    public Subtraction(Integer... arr){
        this.arr = arr;
    }

    public void subtraction(){
        int temp = 0;
        for(int i=0;i<arr.length;i++) {
            temp = arr[i] + temp;
        }
        super.setResult(temp);
        super.showResult(operationName);
    }

}
