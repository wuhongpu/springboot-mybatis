package zytrade.service.mobile;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
/**
 *
 * @Author: 吴红普
 * @Description:
 * @Date: Create in 11:19 2017/11/8
 * @Modified By:
 */
@SpringBootApplication
@EnableAutoConfiguration
//@EnableDiscoveryClient
@MapperScan("zytrade.service.mobile.dao")
public class MposApplication {
    public static void main(String[] args) {
        SpringApplication.run(MposApplication.class, args);
    }
}
