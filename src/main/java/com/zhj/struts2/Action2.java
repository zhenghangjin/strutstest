/*
 * Copyright 2006 The Apache Software Foundation.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *      http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.zhj.struts2;

import com.opensymphony.xwork2.ActionSupport;
import com.zhj.struts2.service.Service2;

/**
 * 测试：策略2：Spring插件管理Action
 * zhenghangjin
 * 2017年10月7日 21:21:32
 */
public class Action2 extends ActionSupport {

    //field
    private String result;
    //service
    private Service2 service2;

    public String execute() throws Exception {
        result = service2.say();
        System.out.println(result + "     HashCode:" + this.hashCode());
        return SUCCESS;
    }

    public void setService2(Service2 service2) {
        this.service2 = service2;
    }
}
