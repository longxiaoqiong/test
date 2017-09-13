@echo off
echo 开始进行测试关闭功能....
mvn install -Dmaven.test.skip=true
@pause