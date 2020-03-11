package com.aalina.didemo.config;

import com.aalina.didemo.examplebeans.FakeDataSource;
import com.aalina.didemo.examplebeans.FakeJmsBroker;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class PropertyConfig {
    @Value("${aalina.username}")
    String username;

    @Value("${aalina.password}")
    String password;

    @Value("${aalina.dburl}")
    String url;

    @Value("${aalina.jms.username}")
    String jmsUsername;

    @Value("${aalina.jms.password}")
    String jmsPassword;

    @Value("${aalina.jms.dburl}")
    String jmsUrl;

    @Bean
    public FakeDataSource fakeDataSource() {
        FakeDataSource fakeDataSource = new FakeDataSource();
        fakeDataSource.setUser(username);
        fakeDataSource.setPassword(password);
        fakeDataSource.setUrl(url);

        return fakeDataSource;
    }

    @Bean
    public FakeJmsBroker fakeJmsBroker() {
        FakeJmsBroker fakeJmsBroker = new FakeJmsBroker();
        fakeJmsBroker.setUser(jmsUsername);
        fakeJmsBroker.setPassword(jmsPassword);
        fakeJmsBroker.setUrl(jmsUrl);

        return fakeJmsBroker;
    }
}
