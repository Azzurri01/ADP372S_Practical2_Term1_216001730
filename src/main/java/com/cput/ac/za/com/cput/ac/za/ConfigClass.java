package com.cput.ac.za.com.cput.ac.za;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigClass
{
    @Bean(name="Alias")

    public AnimalInterface getService()
    {
        return new AnimalInterfaceImplementation();
    }
}
