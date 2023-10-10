# Requirements for Ch01

hello, 欢迎来到我们Java后端的第一个学习任务！

本次学习任务要求你们上交一篇MarkDown格式的报告、一份代码(以github链接的形式附在报告开头)。

你需要在报告中回答下述若干个思考题（需要在报告中附上问题本身，然后再回答），并且在代码中实现下述几个功能。

## 思考题

1. 也许你会好奇，为什么在demo的pom.xml文件中，我们引入的依赖不需要添加version标签，也能正常的引入所需要的依赖？为什么mysql-connector-java却又需要？
2. 不论我们使用什么ORM框架，我们都需要配置一个数据源来完成和数据库的连接，在本次demo中，我们是怎么实现配置数据源的？如果需要换一个DataBase来连接，配置应该是什么样的？
3. 也许本次demo中的bean注入方式和你之前学习的网课或者博客里面看到的不一样，说说本次demo中的bean注入方式是什么？有什么好处？
4. 为什么我们只是写了配置文件，springboot就能自动帮我们注册好对应的bean？
5. 说说demo中的Student这个类里面用到的各个注解分别的作用？
6. 我们在service层代码中注入了StudentRepository类型的bean，这个接口的实现类是怎么实现的？
7. 在StudentController中的接口registerStu，@RequestBody起了什么作用？此时它的请求头“Content-Type”是什么？

## 功能要求

1. 

