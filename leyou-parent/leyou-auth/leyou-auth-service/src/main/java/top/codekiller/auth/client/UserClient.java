package top.codekiller.auth.client;

import org.springframework.cloud.openfeign.FeignClient;
import top.codekiller.user.api.UserApi;

@FeignClient(value="user-service")
public interface UserClient extends UserApi {

}
