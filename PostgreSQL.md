psql
CREATE DATABASE testdb;
CREATE USER think8848 CREATEDB LOGIN PASSWORD '111111'
如下图所示，这样我们就创建了一个名为think8848的用户，后面的 CREATEDB LOGIN PASSWORD '111111' 意思是这个用户可以创建数据库，还可以登录，他的密码是111111
GRANT ALL ON DATABASE testdb TO think8848
\q

sudo firewall-cmd --zone=public --add-port=5432/tcp --permanent

sudo firewall-cmd --reload
