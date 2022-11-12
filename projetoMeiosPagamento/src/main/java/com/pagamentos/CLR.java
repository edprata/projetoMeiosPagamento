package com.pagamentos;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class CLR implements CommandLineRunner {
	
	@Autowired
    Environment env;

    @Override
    public void run(String... args) throws Exception {
        log.info( "Profile                  :  {}", env.getProperty("spring.profiles.active"));
        log.info( "Datasource               :  {}", env.getProperty("spring.datasource.url"));
    }
}

