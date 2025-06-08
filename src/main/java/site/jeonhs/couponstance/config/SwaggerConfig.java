package site.jeonhs.couponstance.config;

import io.swagger.v3.oas.models.OpenAPI;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SwaggerConfig {

  public OpenAPI openAPI() {
    return new OpenAPI()
        .info(new io.swagger.v3.oas.models.info.Info()
            .title("Couponstance API")
            .version("1.0.0")
            .description("쿠폰스탕스의 API 문서입니다."));
  }
}
