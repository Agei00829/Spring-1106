
package com.mycompany.springbase1102.proxy.sta;

interface Subject {
    void request();
}

class RealSubject implements Subject {

    @Override
    public void request() {
        
        System.out.println("AAA");
        
    }
    
}

class Proxy implements Subject {
    private Subject subject;

    public Proxy(Subject subject) {
        this.subject = subject;
    }
    
    @Override
    public void request() {
        System.out.println("1");
        subject.request();
        System.out.println("3");
    }
    
}

public class ProxyDemo {
    public static void main(String[] args) {
       //Subject subject = new RealSubject();
       //subject.request();
       Proxy proxy = new Proxy(new RealSubject());
       proxy.request();
    }
}
