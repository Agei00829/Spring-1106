
package com.mycompany.springbase1102.di.byname;


public class OracleProgramer {
    private String name;
    private Language java;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language getJava() {
        return java;
    }

    public void setJava(Language java) {
        this.java = java;
    }

    @Override
    public String toString() {
        return "OracleProgramer{" + "name=" + name + ", java=" + java + '}';
    }
    
}
