package org.wlfek.test.Service;

import javax.annotation.Resource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.stereotype.Service;
import org.wlfek.test.Domain.User;

@Service("testService")
public class TestService {
	
//	@Autowired
//	RedisTemplate<String, User> redisTemplate;
//	
    @Resource(name="stringRedisTemplate")
    private RedisTemplate<String, String> redisTemplate;

    //	@Resource(name="stringRedisTemplate")
//	private ListOperations<String, String> listOps;
//	 
//	@Resource(name="stringRedisTemplate")
//	private HashOperations<String, String, String> hashOps;
//	 
//	@Resource(name="stringRedisTemplate")
//	private SetOperations<String, String> setOps;
	
	public User test(){
		User user = new User();
        user.setId(6);
        user.setName("wlfek");
        try {
        	redisTemplate.opsForValue().set("ming", "min");
        	//redisTemplate.opsForValue().set("hi", user); 
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return user;
	}
}
