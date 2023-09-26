package blog.yrol;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackages = "blog.yrol")
public class StockService implements CommandLineRunner {

    public static final Logger LOG = LoggerFactory.getLogger(StockService.class);

    public static void main(String[] args) {
        SpringApplication.run(StockService.class);
    }

    @Override
    public void run(String... args) throws Exception {
        LOG.info("Stock service started");
    }
}