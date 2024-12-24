package Facade;

import java.util.HashMap;
import java.util.Map;

public class FacadeDemo {

    public String getName(Long id) {
        return "Bob";
    }

    public Integer getAge(Long id) {
        return 16;
    }

    public String getCity(Long id) {
        return "New York";
    }

    public Integer getWeight(Long id) {
        return 66;
    }

    // 门面模式封装getName() getAge() 和 getWeight()
    public Map<String, Object> getUser(Long id) {
        Map<String, Object> data = new HashMap<>();
        data.put("name", getName(id));
        data.put("age", getAge(id));
        data.put("weight", getWeight(id));
        return data;
    }
}
