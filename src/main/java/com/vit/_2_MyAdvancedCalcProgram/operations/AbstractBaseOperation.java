package com.vit._2_MyAdvancedCalcProgram.operations;

abstract public class AbstractBaseOperation {

    private Integer result;

    protected void setResult(Integer result){
        this.result = result;
    }

    public void showResult(String opsName){
        System.out.println("Result of the Operation: " + opsName + " is: " + result);
    }
}
