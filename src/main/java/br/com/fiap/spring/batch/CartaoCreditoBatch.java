package br.com.fiap.spring.batch;

import br.com.fiap.spring.entity.CartaoCredito;
import org.springframework.batch.core.Job;
import org.springframework.batch.core.Step;
import org.springframework.batch.core.configuration.annotation.JobBuilderFactory;
import org.springframework.batch.core.configuration.annotation.StepBuilderFactory;
import org.springframework.batch.item.ItemProcessor;
import org.springframework.batch.item.ItemReader;
import org.springframework.batch.item.ItemWriter;
import org.springframework.batch.item.database.JpaItemWriter;
import org.springframework.batch.item.file.FlatFileItemReader;
import org.springframework.batch.item.file.builder.FlatFileItemReaderBuilder;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.io.Resource;

import javax.persistence.EntityManagerFactory;

@Configuration
public class CartaoCreditoBatch {

  @Bean("cartaoCreditoJob")
  public Job job(JobBuilderFactory jobBuilderFactory, Step step) {
    return jobBuilderFactory.get("CARTAO_JOB")
        .start(step)
        .build();
  }

  @Bean
  public Step step(StepBuilderFactory stepBuilderFactory,
                   ItemReader<CartaoCredito> itemReader,
                   ItemWriter<CartaoCredito> itemWriter,
                   ItemProcessor<CartaoCredito, CartaoCredito> processor) {
        return stepBuilderFactory.get("STEP")
               .<CartaoCredito, CartaoCredito>chunk(2)
               .reader(itemReader)
               .processor(processor)
               .writer(itemWriter)
               .listener(listener())
               .allowStartIfComplete(false)
               .build();             
  }

  @Bean
  public FlatFileItemReader<CartaoCredito> itemReader(@Value("${file.inpute") Resource resource){
    return new FlatFileItemReaderBuilder<CartaoCredito>()
            .name("FILE_ITEM_READER")
            .targetType(CartaoCredito.class)
            .delimited().delimiter(";").names("NOME", "REGISTRO", "CURSO", "NUMERO", "DATA_VALIDADE", "VERIFICADOR")
            .resource(resource)
            .linesToSkip(1)
            .build();
  }

  @Bean
  public ItemProcessor<CartaoCredito, CartaoCredito> processor() {
    return cartao -> {
      cartao.setNome(cartao.getNome().toUpperCase());
      cartao.setRegistro(cartao.getRegistro());
      cartao.setCurso(cartao.getCurso());
      cartao.setNumeroCartao(cartao.getNumeroCartao());
      cartao.setVerificador(cartao.getVerificador());
      cartao.setDataValidade(cartao.getDataValidade());
      return cartao;
    };
  }

  @Bean
  public ItemWriter<CartaoCredito> databaseWriter(EntityManagerFactory emf){
    final JpaItemWriter<CartaoCredito> jpaItemWriter = new JpaItemWriter<>();
    jpaItemWriter.setEntityManagerFactory(emf);
    return jpaItemWriter;
  }

  @Bean
  public ItemCountListener listener(){
    return new ItemCountListener();
  }
  
}
