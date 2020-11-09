
package com.mycompany.springbase1102.di.byname;


public class MicrosoftProgramer {
    private String name;
    private Language vb;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Language getVb() {
        return vb;
    }

    public void setVb(Language vb) {
        this.vb = vb;
    }

    @Override
    public String toString() {
        return "MicrosoftProgramer{" + "name=" + name + ", vb=" + vb + '}';
    }
    
}
