package configure;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import services.BookServices;
import services.implementations.BookDetails;

@Configuration
public class LibaryConfig {
    @Bean(name="book")
    public BookServices getGenetic(){
        return new BookDetails();
    }

}
