package com.smart.job.search.beans;


//POJO class
public class Job extends BaseBean {

    private String jobName;
    private String jobLocation;

    public String getJobName() {
        return jobName;
    }

    public void setJobName(String jobName) {
        this.jobName = jobName;
    }

    public String getJobLocation() {
        return jobLocation;
    }

    public void setJobLocation(String jobLocation) {
        this.jobLocation = jobLocation;
    }
}
