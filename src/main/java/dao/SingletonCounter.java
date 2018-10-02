package dao;

import javax.annotation.PostConstruct;
import javax.ejb.Singleton;
import javax.ejb.Startup;
import java.util.concurrent.atomic.AtomicInteger;

@Singleton
@Startup
public class SingletonCounter {


    private AtomicInteger visits;

    @PostConstruct
    private void init(){
        visits = new AtomicInteger();
    }

    public int getVisits(){


        return visits.incrementAndGet();
    }



}
