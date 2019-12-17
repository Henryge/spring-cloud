package com.example.web;

import com.alibaba.fastjson.JSONObject;
import com.example.configuration.ApolloConfig;
import com.example.dto.ResultMessage;
import com.example.service.ClientTransService;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
@RequestMapping("/demo")
public class HelloController {

    private final Logger logger = Logger.getLogger(getClass());

    @Resource
    private ApolloConfig apolloConfig;

    @Autowired
    private ClientTransService clientTransService;

    @RequestMapping(value="/hello", method = RequestMethod.POST)
    public ResultMessage index(@RequestBody JSONObject jsonObject) {
        logger.info("开始加载数据在" + apolloConfig.getEnv() + "环境");
        ResultMessage result = new ResultMessage();
        result.setCode("0000");
        result.setMessage("处理成功");
        result.setObject(clientTransService.loadData(Long.valueOf(jsonObject.getString("transId"))));
        return result;
    }

}
