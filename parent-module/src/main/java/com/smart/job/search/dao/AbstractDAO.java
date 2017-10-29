package com.smart.job.search.dao;

import com.smart.job.search.beans.BaseBean;
import com.smart.job.search.beans.Job;

import java.io.Serializable;
import java.util.List;
import java.util.concurrent.Callable;

public abstract class AbstractDAO{

//behavior
    private int a;
    private int b;

    public abstract void search();


    protected void find(BaseBean myBean){

        //

    }

    protected void display(){

        //implementation
    }
}
