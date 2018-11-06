# activiti各版本发行记录

## 5.17.0

- 异步作业执行器全新改造，新的异步作业执行器减少了对数据库的查询次数。默认没有开启新的异步作业执行器，asyncExecutorEnabled 开启新的作业执行器
- modeler重新修订，采用angular JS（部署的时候需要修改app.config文件中的地址）
- 加入skipExpression 可跳过任务
- 源码添加新的模块 activiti-jmx

## 5.18.0

- `bulk insert` (http://www.jorambarrez.be/blog/2015/07/20/the-activiti-performance-showdown-2015/)
- 增加OR查询操作
- 解决异步作业执行器死锁的问题

## 5.19.0

- 新增DynamicBpmnService ，实现动态修改流程定义的某些属性而不用重新部署http://bpmn20inaction.blogspot.com/2015/10/adding-dynamic-behaviour-to-activiti.html

## 5.20.0

- 修复bug bug release

## 5.22.0

- 修复bug
- 删除变量时的并发异常
- DefaultDeploymentCache 非线程安全修复







