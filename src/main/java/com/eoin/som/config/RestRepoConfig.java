package com.eoin.som.config;

import com.eoin.som.entities.*;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestConfigurer;

@Configuration
public class RestRepoConfig implements RepositoryRestConfigurer {
    public void configureRepositoryRestConfiguration(RepositoryRestConfiguration config)
    {
        config.exposeIdsFor(Student.class);
        config.exposeIdsFor(Teacher.class);
        config.exposeIdsFor(Instrument.class);
        config.exposeIdsFor(StudInstrument.class);
        config.exposeIdsFor(TeachInstrument.class);
    }
}
