package br.com.fiap.spring.batch;

import org.springframework.batch.core.configuration.annotation.DefaultBatchConfigurer;
import org.springframework.batch.core.configuration.annotation.EnableBatchProcessing;
import org.springframework.batch.core.launch.JobLauncher;
import org.springframework.batch.core.launch.support.SimpleJobLauncher;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import javax.sql.DataSource;

@Configuration
@EnableBatchProcessing
public class SpringBatchConfig extends DefaultBatchConfigurer {

    @Qualifier("H2DataSource")
    private DataSource dataSource;

    @Bean("batchJobLauncher")
    @Override
    protected JobLauncher createJobLauncher() throws Exception {
        setDataSource(dataSource);
        SimpleJobLauncher batchJobLauncher = new SimpleJobLauncher();
        batchJobLauncher.setJobRepository(getJobRepository());
        batchJobLauncher.afterPropertiesSet();
        return batchJobLauncher;
    }
}
